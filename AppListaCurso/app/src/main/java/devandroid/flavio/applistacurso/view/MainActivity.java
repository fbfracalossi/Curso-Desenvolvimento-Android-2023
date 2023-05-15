package devandroid.flavio.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import devandroid.flavio.applistacurso.R;
import devandroid.flavio.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {
Pessoa pessoa;
Pessoa outraPessoa;


String dadosPessoa; //pascalCase - camelCase
String dadosOutraPessoa;



EditText editPrimeiroNome;
EditText editSobrenomeAluno;
EditText editNomeCurso;
EditText editTelefoneContato;

Button btnLimpar;
Button btnSalvar;
Button btnFinalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Flavio");
        pessoa.setSobreNome("Fracalossi");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("48998218360");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Luiz");
        outraPessoa.setSobreNome("Alves");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("6738861821");

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobrenomeAluno = findViewById(R.id.editSobrenomeAluno);
        editNomeCurso = findViewById(R.id.txtNomeCurso);
        editTelefoneContato = findViewById(R.id.txtTelefoneContato);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobrenomeAluno.setText(pessoa.getSobreNome());
        editNomeCurso.setText(pessoa.getCursoDesejado());
        editTelefoneContato.setText(pessoa.getTelefoneContato());




/*
        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone de Contado: ";
        dadosPessoa += pessoa.getTelefoneContato();


        dadosOutraPessoa = "Primeiro nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += " Curso Desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " Telefone de Contado: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();
*/
        Log.i("POOAndroid", "Objeto pessoa: "+pessoa.toString());
        Log.i("POOAndroid", "Objeto outraPessoa: "+outraPessoa.toString());


    }
}