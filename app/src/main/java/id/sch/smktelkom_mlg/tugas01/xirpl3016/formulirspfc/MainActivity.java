package id.sch.smktelkom_mlg.tugas01.xirpl3016.formulirspfc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        rbLK = (RadioButton) findViewById(R.id.radioButtonLK);
        rbPR = (RadioButton) findViewById(R.id.radioButtonPR);

        bOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                doClick();
            }
        });
    }

    private void doClick() {
        if (isValid()) {
            String nama = etNama.getText().toString();
            tvHasil.setText("Terima Kasih " + nama + " atas partisipasi anda");
        }
    }

    private boolean isValid() {
        boolean valid = true;

        String nama = etNama.getText().toString();
        String tahun = etTahun.getText().toString();
        String email = etEmail.getText().toString();

        if (nama.isEmpty()) {
            etNama.setError("Nama Belum Diisi");
            valid = false;
        } else if (nama.length() < 3) {
            etNama.setError("Nama Minimal 3 Karakter");
            valid = false;
        } else {
            etNama.setError(null);
        }

        if (tahun.isEmpty()) {
            etTahun.setError("Tahun Kelahiran Belum Diisi");
            valid = false;
        } else if (tahun.length() != 4) {
            etTahun.setError("Format Tahun Kelahiran Bukan yyyy");
            valid = false;
        } else {
            etTahun.setError(null);
        }

        if (email.isEmpty()) {
            etEmail.setError("Email Belum Diisi");
            valid = false;
        } else if (email.length() < 7) {
            etEmail.setError("Pastikan format email benar");
            valid = false;
        } else {
            etEmail.setError(null);
        }


        return valid;
    }

}
