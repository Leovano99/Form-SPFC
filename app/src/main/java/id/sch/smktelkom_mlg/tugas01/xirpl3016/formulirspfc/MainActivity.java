package id.sch.smktelkom_mlg.tugas01.xirpl3016.formulirspfc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama, etTahun, etEmail;
    CheckBox cbBK, cbBR, cbGL, cbKR;
    RadioButton rbLK, rbPR;
    Spinner spKelas;
    Button bOK;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = (EditText) findViewById(R.id.editTextEmail);
        etNama = (EditText) findViewById(R.id.editTextNama);
        etTahun = (EditText) findViewById(R.id.editTextTahun);
        bOK = (Button) findViewById(R.id.buttonOK);

        /*bOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                doClick();
            }
        });*/
    }

    private void doClick() {
        String nama = etNama.getText().toString();
        tvHasil.setText("Terimasih");
    }

}
