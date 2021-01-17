package villablanca.agg.ProyectoPMDM;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    private final int OCULTO=129;
    private final int VISIBLE=145;
    TextView usuario,contraseña;
    Button mostrarcontrasenia,hacerlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mostrarcontrasenia=findViewById(R.id.buttonMostrarContraseñaLogin);
        hacerlogin=findViewById(R.id.buttonHacerLogin);
        contraseña=findViewById(R.id.editTextTextPasswordLogin);
        mostrarcontrasenia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ocultarContraseña();
            }
        });
        hacerlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirMenu(v);
            }
        });
    }

    private void ocultarContraseña() {

        if(contraseña.getInputType()==OCULTO){
            contraseña.setInputType(VISIBLE);
        }else{
            contraseña.setInputType(OCULTO);
        }

    }

    private void abrirMenu(View v){
        Intent i = new Intent(v.getContext(), MenuUsuario.class);
        startActivity(i);
    }
}