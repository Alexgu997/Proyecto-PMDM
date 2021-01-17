package villablanca.agg.ProyectoPMDM;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class RestauranteBuscado extends AppCompatActivity {

    ImageButton salir;
    Button carta,reservardia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante_buscado);
        salir=findViewById(R.id.imageButtonRegresoRestauranteBuscado);
        carta=findViewById(R.id.buttonCartaRestaurante);
        reservardia=findViewById(R.id.buttonHacerReserva);
        carta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //abrirWeb();
            }
        });
        reservardia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActividad(v,CalendarioReserva.class);
            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void abrirActividad(View v, Class actividadclass) {
        Intent i = new Intent(v.getContext(), actividadclass);
        startActivity(i);
    }
}