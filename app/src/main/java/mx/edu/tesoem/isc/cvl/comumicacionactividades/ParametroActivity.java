package mx.edu.tesoem.isc.cvl.comumicacionactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ParametroActivity extends AppCompatActivity {

    TextView lblsaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametro);
        lblsaludo = findViewById(R.id.lblsaludo);
        Bundle parametro = getIntent().getExtras();
        lblsaludo.setText("bienvenido" + parametro.getString("Nombre"));
    }
}
