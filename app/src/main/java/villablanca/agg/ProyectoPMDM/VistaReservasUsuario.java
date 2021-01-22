package villablanca.agg.ProyectoPMDM;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class VistaReservasUsuario extends AppCompatActivity {

    ImageButton salir;
    TextView titulo;
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
        titulo=findViewById(R.id.textViewReservasTitulo);

    }

    private void cerrarActividad() {
        finish();
    }
}