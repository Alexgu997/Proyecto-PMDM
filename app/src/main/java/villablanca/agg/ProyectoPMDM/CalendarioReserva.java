package villablanca.agg.ProyectoPMDM;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CalendarioReserva extends AppCompatActivity {

    ImageButton salir;
    Button reservardia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario_reserva);
        reservardia=findViewById(R.id.buttonReservarDia);
        reservardia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActividad(v, HacerReserva.class);
            }
        });
        salir=findViewById(R.id.imageButtonRegresoCalendario);
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