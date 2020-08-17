package com.trece.tortilleriamovil.Vista.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.trece.tortilleriamovil.CRUD.CRUD;
import com.trece.tortilleriamovil.Consultas.ConsultaUsuario;
import com.trece.tortilleriamovil.Modelo.Usuario;
import com.trece.tortilleriamovil.ModeloDAO.UsuarioDAO;
import com.trece.tortilleriamovil.R;

public class Login extends AppCompatActivity {
private EditText txtUsuario,txtContra;
private Button btnAccesar;
private UsuarioDAO usDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnAccesar = findViewById(R.id.btnAccesar);
        txtUsuario =(EditText) findViewById(R.id.txtUsu);
        txtContra = (EditText)findViewById(R.id.txtContra);
        btnAccesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           if(!txtUsuario.getText().toString().equals("") && !txtContra.getText().toString().equals(""))
                {
                    usDAO = new ConsultaUsuario();
                    Usuario u = usDAO.acceder(txtUsuario.getText().toString(),txtContra.getText().toString());
                    if(u.getId_Usuario() != 0)
                    {
                        Toast.makeText(getApplicationContext(),"Bienvenido "+txtUsuario.getText(),Toast.LENGTH_SHORT).show();
                    }else
                    {
                        Toast.makeText(getApplicationContext(),"Verifique sus datos "+txtContra.getText(),Toast.LENGTH_SHORT).show();
                    }

                }else
                 {
                     Toast.makeText(getApplicationContext(),"No deje campos vacíos",Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}