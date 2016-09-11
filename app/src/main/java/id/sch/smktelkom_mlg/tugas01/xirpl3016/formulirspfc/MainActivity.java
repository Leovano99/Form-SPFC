package id.sch.smktelkom_mlg.tugas01.xirpl3016.formulirspfc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etNama, etTahun, etEmail;
    CheckBox cbBK, cbBR, cbGL, cbKR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
