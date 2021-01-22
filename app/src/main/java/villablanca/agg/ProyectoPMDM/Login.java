package villablanca.agg.ProyectoPMDM;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    private final int OCULTO=129;
    private final int VISIBLE=145;
    TextView usuario,contraseña;
    EditText usuarioet,contraseñaet;
    Button mostrarcontrasenia,hacerlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mostrarcontrasenia=findViewById(R.id.buttonMostrarContraseñaLogin);
        hacerlogin=findViewById(R.id.buttonHacerLogin);
        hacerlogin.setText(getString(R.string.buttonHacerLogin));
        contraseñaet=findViewById(R.id.editTextTextPasswordLogin);
        usuario=findViewById(R.id.textViewUsuarioLogin);
        usuario.setText(getString(R.string.textViewUsuarioLogin));
        contraseña=findViewById(R.id.textViewPasswordLogin);
        contraseña.setText(getString(R.string.textViewPasswordLogin));
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