package mx.edu.tesoem.isc.practica5sccm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Pantalla1Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla1);
    }

    public void resta(View v){
        Intent pantalla3= new Intent(this,Pantalla4Activity.class);
        startActivity(pantalla3);
        finish();
    }
    public void regresa(View v){
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
        finish();
    }


}
