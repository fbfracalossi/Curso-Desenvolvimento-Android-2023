package devandroid.flavio.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.flavio.applistacurso.R;
import devandroid.flavio.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {
Pessoa pessoa;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Flavio");
        pessoa.setSobreNome("Fracalossi");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("48998218360");

        int parada = 0;

    }
}