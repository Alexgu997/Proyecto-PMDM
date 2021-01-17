package villablanca.agg.ProyectoPMDM;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class VistaReservasUsuario extends AppCompatActivity {

    ImageButton salir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_reservas_usuario);
        salir=findViewById(R.id.imageButtonRetornoReservas);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cerrarActividad();
            }
        });
    }

    private void cerrarActividad() {
        finish();
    }
}