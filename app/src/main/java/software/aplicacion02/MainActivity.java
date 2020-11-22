package software.aplicacion02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnEnviar(View view){
        Intent intent = new Intent(MainActivity.this, SegundaActividad.class);
        EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        EditText txtFecha = (EditText)findViewById(R.id.txtFecha);
        EditText txtCelular = (EditText)findViewById(R.id.txtCelular);
        RadioButton rdUnisex = (RadioButton)findViewById(R.id.rdMasculino);

        Bundle b = new Bundle();
        b.putString("nombre", txtNombre.getText().toString());
        b.putString("fecha", txtFecha.getText().toString());
        b.putString("celular", txtCelular.getText().toString());

        if(rdUnisex.isChecked())
            b.putString("sexo", "Masculino");
        else
            b.putString("sexo", "Femenino");

        intent.putExtras(b);
        startActivity(intent);
    }
}