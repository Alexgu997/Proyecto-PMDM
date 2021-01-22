package villablanca.agg.ProyectoPMDM;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PerfilUsuario extends AppCompatActivity {

    ImageButton salir;
    Button alergias,cuentabancaria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario);
        salir=findViewById(R.id.imageButton2SalidaPerfil);
        alergias=findViewById(R.id.buttonAlergias);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        alergias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActividad(v,AlergiasUsuario.class);
            }
        });
        alergias.setText(getString(R.string.buttonAlergias));
        cuentabancaria=findViewById(R.id.buttonCuentaBancaria);
        cuentabancaria.setText(getString(R.string.buttonCuentaBancaria));
    }
    private void abrirActividad(View v, Class actividadclass) {
        Intent i = new Intent(v.getContext(), actividadclass);
        startActivity(i);
    }
}