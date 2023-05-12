package devandroid.flavio.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.flavio.applistacurso.R;
import devandroid.flavio.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {
Pessoa pessoa;
Pessoa outraPessoa;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        //Atribuir conteúdo, dados e valores para o Objeto
        //Conforme o seu MODELO, TEMPLATE
        pessoa.setPrimeiroNome("Flavio");
        pessoa.setSobreNome("Fracalossi");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("48998218360");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Luiz");
        outraPessoa.setSobreNome("Alves");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("6738861821");

        int parada = 0;

    }
}