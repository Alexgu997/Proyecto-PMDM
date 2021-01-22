package villablanca.agg.ProyectoPMDM;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class AlergiasUsuario extends AppCompatActivity {

    ImageButton salir;
    Button agregarAlergia,borrarAlergia;
    TextView titulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alergias_usuario);
        salir=findViewById(R.id.imageButtonRetornoAlergias);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        titulo=findViewById(R.id.textViewAlergiasTitulo);
        titulo.setText(getString(R.string.textViewAlergiasTitulo));
        agregarAlergia=findViewById(R.id.buttonAgregarAlergias);
        agregarAlergia.setText(getString(R.string.buttonAgregarAlergia));
        borrarAlergia=findViewById(R.id.buttonBorrarAlergia);
        borrarAlergia.setText(getString(R.string.buttonBorrarAlergia));

    }

}