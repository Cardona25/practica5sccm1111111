package mx.edu.tesoem.isc.practica5sccm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Pantalla2Activity extends AppCompatActivity  implements  View.OnClickListener{
    EditText vnumero1,vnumero2;
    Button btnCalcular;
    TextView vres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        vnumero1 =(EditText) findViewById(R.id.txtnum1);
        vnumero2=(EditText) findViewById(R.id.txtnum2);
        vres=(TextView) findViewById(R.id.txtres);
        btnCalcular=(Button) findViewById(R.id.button5);
        btnCalcular.setOnClickListener(this);
    }

    @Override
    public  void onClick(View v){
        int val1=Integer.parseInt(vnumero1.getText().toString());
        int val2=Integer.parseInt(vnumero2.getText().toString());
        int resultado= val1+val2;

        vres.setText("La suma es: "+ resultado);
    }

    public void menu2 (View v){
        Intent m2 = new Intent(this, Pantalla1Activity.class);
        startActivity(m2);
        finish();
    }
}
