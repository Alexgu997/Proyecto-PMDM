package villablanca.agg.ProyectoPMDM;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BusquedaRestaurante extends AppCompatActivity {

   ImageButton salir;
   Button buscar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda_restaurante);
        buscar=findViewById(R.id.buttonBusquedaRestaurante);
        salir=findViewById(R.id.imageButtonRegresoBR);
        buscar.setText(getString(R.string.buttonBuscarRestauranteNombre));
        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActividad(v,RestauranteBuscado.class);
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