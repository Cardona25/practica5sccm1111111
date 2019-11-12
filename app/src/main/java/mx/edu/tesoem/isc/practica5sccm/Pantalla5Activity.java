package mx.edu.tesoem.isc.practica5sccm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Pantalla5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla5);
    }

    public void resgresamenu(View v){
        Intent men=new Intent(this, Pantalla1Activity.class);
        startActivity(men);
        finish();
    }
}
