package software.aplicacion02;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        TextView lblRecibido = (TextView)findViewById(R.id.lblRecibido);
        Bundle b = this.getIntent().getExtras();

        lblRecibido.setText("Hola " + b.getString("nombre") + ", estos son tus datos:\n" +
                "Genero: " + b.getString("sexo") +
                "\nFecha de nacimiento: " + b.getString("fecha") +
                "\nCelular: " + b.getString("celular"));
    }
}