package corp.poopapps.geometracalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bCalcular;
    String valor, valor1;
    double value;
    double value1;
    double perimetro, area, volumen;
    int paso=0;

   TextView Tvalor1, Tvalor2, Tvalor3;
   EditText Evalor1, Evalor2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tvalor1 = (TextView)findViewById(R.id.Tvalor1);
        Tvalor2 = (TextView)findViewById(R.id.Tvalor2);
        Tvalor3 = (TextView)findViewById(R.id.Tvalor3);
        Evalor1 = (EditText)findViewById(R.id.Evalor1);
        Evalor2 = (EditText)findViewById(R.id.Evalor2);

        bCalcular = (Button) findViewById(R.id.bCalcular);
    }

    public void onRadioButtonClicked(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.cuadrado:
                Evalor1.setText("");
                Evalor2.setText("");
                Evalor1.setVisibility(View.VISIBLE);
                Evalor1.setHint("LADO [L]");
                Evalor2.setVisibility(View.INVISIBLE);

                Tvalor1.setVisibility(View.INVISIBLE);
                Tvalor2.setVisibility(View.INVISIBLE);
                Tvalor3.setVisibility(View.INVISIBLE);
                paso = 1;

                break;

            case R.id.circulo:
                Evalor1.setText("");
                Evalor2.setText("");
                Evalor1.setVisibility(View.VISIBLE);
                Evalor1.setHint("RADIO [R]");
                Evalor2.setVisibility(View.INVISIBLE);

                Tvalor1.setVisibility(View.INVISIBLE);
                Tvalor2.setVisibility(View.INVISIBLE);
                Tvalor3.setVisibility(View.INVISIBLE);

                paso = 2;

                break;

            case R.id.triangulo:    
                Evalor1.setText("");
                Evalor2.setText("");
                Evalor1.setVisibility(View.VISIBLE);
                Evalor1.setHint("BASE [B]");

                Evalor2.setVisibility(View.VISIBLE);
                Evalor2.setHint("ALTURA [H]");

                Tvalor1.setVisibility(View.INVISIBLE);
                Tvalor2.setVisibility(View.INVISIBLE);
                Tvalor3.setVisibility(View.INVISIBLE);

                paso = 3;

                break;

            case R.id.cubo:
                Evalor1.setText("");
                Evalor2.setText("");
                Evalor1.setVisibility(View.VISIBLE);
                Evalor1.setHint("LADO [L]");
                Evalor2.setVisibility(View.INVISIBLE);

                Tvalor1.setVisibility(View.INVISIBLE);
                Tvalor2.setVisibility(View.INVISIBLE);
                Tvalor3.setVisibility(View.INVISIBLE);

                paso = 4;

                break;
        }


    }

    public void onButtonClicked(View view) {

        switch (paso) {
            case 1: //CUADRADO
                Tvalor1.setVisibility(View.VISIBLE);
                Tvalor2.setVisibility(View.VISIBLE);
                Tvalor3.setVisibility(View.INVISIBLE);

                valor = Evalor1.getText().toString();
                value = Double.parseDouble(valor);

                perimetro = 4 * value;
                area = value * value;

                Tvalor1.setText("P = " + String.valueOf(perimetro));
                Tvalor2.setText("A = " + String.valueOf(area));

                break;

            case 2: //CIRCULO
                Tvalor1.setVisibility(View.VISIBLE);
                Tvalor2.setVisibility(View.VISIBLE);
                Tvalor3.setVisibility(View.INVISIBLE);

                valor = Evalor1.getText().toString();
                value = Double.parseDouble(valor);

                perimetro = 2 * 3.1416 * value;
                area = 3.1416 * value * value;

                Tvalor1.setText("P = " + String.valueOf(perimetro));
                Tvalor2.setText("A = " + String.valueOf(area));

                break;

            case 3: //TRIANGULO
                Tvalor1.setVisibility(View.VISIBLE);
                Tvalor2.setVisibility(View.VISIBLE);
                Tvalor3.setVisibility(View.INVISIBLE);

                valor = Evalor1.getText().toString();
                value = Double.parseDouble(valor);
                valor1 = Evalor2.getText().toString();
                value1 = Double.parseDouble(valor1);

                perimetro = 3 * value;
                area = (value * value1) / 2;

                Tvalor1.setText("P = " + String.valueOf(perimetro));
                Tvalor2.setText("A = " + String.valueOf(area));

                break;

            case 4: //CUBO
                Tvalor1.setVisibility(View.INVISIBLE);
                Tvalor2.setVisibility(View.VISIBLE);
                Tvalor3.setVisibility(View.VISIBLE);

                valor = Evalor1.getText().toString();
                value = Double.parseDouble(valor);

                volumen = value * value * value;
                area = 6 * value * value;

                Tvalor3.setText("V = " + String.valueOf(volumen));
                Tvalor2.setText("A = " + String.valueOf(area));

                break;
        }
    }
}

