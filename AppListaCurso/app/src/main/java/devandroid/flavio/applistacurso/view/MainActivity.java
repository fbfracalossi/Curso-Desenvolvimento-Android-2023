package devandroid.flavio.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
        //pessoa.setPrimeiroNome("Flavio");
        //pessoa.setSobreNome("Fracalossi");
        //pessoa.setCursoDesejado("Android");
        //pessoa.setTelefoneContato("48998218360");

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

        editPrimeiroNome.setText(outraPessoa.getPrimeiroNome());
        editSobrenomeAluno.setText(outraPessoa.getSobreNome());
        editNomeCurso.setText(outraPessoa.getCursoDesejado());
        editTelefoneContato.setText(outraPessoa.getTelefoneContato());

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editPrimeiroNome.setText("");
                editSobrenomeAluno.setText("");
                editTelefoneContato.setText("");
                editNomeCurso.setText("");
            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = "Volte Sempre";
                Toast.makeText(MainActivity.this, texto, Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String salvo = "Salvo";
                pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                pessoa.setSobreNome(editSobrenomeAluno.getText().toString());
                pessoa.setCursoDesejado(editNomeCurso.getText().toString());
                pessoa.setTelefoneContato(editTelefoneContato.getText().toString());
                Toast.makeText(MainActivity.this, salvo+pessoa.toString(), Toast.LENGTH_LONG).show();

            }
        });

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