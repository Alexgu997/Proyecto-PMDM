package villablanca.agg.ProyectoPMDM;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class HacerReserva extends AppCompatActivity {

    ImageButton salir;
    Button reservar;
    TextView hora,numpersonas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hacer_reserva);
        reservar=findViewById(R.id.buttonReservarHora);
        hora=findViewById(R.id.textViewHoraTitulo);
        numpersonas=findViewById(R.id.textViewNumeroPersonaTitulo);
        hora.setText(getString(R.string.textViewHoraTitulo));
        numpersonas.setText(getString(R.string.textViewNumeroPersonaTitulo));
        reservar.setText(getString(R.string.buttonReservarHora));
        salir=findViewById(R.id.imageButtonRegresarHacerReservar);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}