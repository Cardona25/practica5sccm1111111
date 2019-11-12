package mx.edu.tesoem.isc.practica5sccm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Pantalla4Activity extends AppCompatActivity implements  View.OnClickListener{
    EditText a1,a2;
    Button btCal;
    TextView bres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla4);

        a1=(EditText) findViewById(R.id.tx1);
        a2=(EditText) findViewById(R.id.tx2);
        bres=(TextView) findViewById(R.id.tx4);
        btCal=(Button) findViewById(R.id.button9);
        btCal.setOnClickListener(this);
    }

    @Override

    public void onClick(View v){
        int w=Integer.parseInt(a1.getText().toString());
        int x=Integer.parseInt(a2.getText().toString());
        int z=w-x;

        bres.setText("La resta es: "+z);
    }

    public void opcion(View v){
        Intent p4= new Intent(this, Pantalla1Activity.class);
        startActivity(p4);
        finish();

    }
}
