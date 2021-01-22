package villablanca.agg.ProyectoPMDM;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuUsuario extends AppCompatActivity {
    Button reservas,buscarpornombre;
    ImageButton perfil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_usuario);
        perfil=findViewById(R.id.imageButtonPerfil);
        reservas=findViewById(R.id.buttonReservas);
        reservas.setText(getString(R.string.buttonReservas));
        buscarpornombre=findViewById(R.id.buttonBuscarRestauranteNombre);
        buscarpornombre.setText(getString(R.string.buttonBuscarRestauranteNombre));
        reservas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActividad(v,VistaReservasUsuario.class);
            }
        });
        buscarpornombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActividad(v,BusquedaRestaurante.class);
            }
        });

        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActividad(v,PerfilUsuario.class);
            }
        });
    }

    private void abrirActividad(View v, Class actividadclass) {
        Intent i = new Intent(v.getContext(), actividadclass);
        startActivity(i);
    }
}