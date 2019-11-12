package mx.edu.tesoem.isc.practica5sccm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void salir(View v){
        finish();
    }

    public void menuop (View v){
        Intent pantalla1= new Intent(this, Pantalla1Activity.class);
        startActivity(pantalla1);
        finish();
    }
}
