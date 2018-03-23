package com.example.fitri_pc.prj1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edNama) EditText edNama;
    @BindView(R.id.edNpm) EditText edNpm;
    @BindView(R.id.edtanggal) EditText edtanggal;
    @BindView(R.id.edtugas) EditText edtugas;
    @BindView(R.id.ednilaiquiz) EditText ednilaiquiz;
    @BindView(R.id.eduts) EditText eduts;
    @BindView(R.id.edUAS) EditText edUAS;

    @BindView(R.id.txtNama) EditText txtNama;
    @BindView(R.id.txtNpm) EditText txtNpm;
    @BindView(R.id.txttanggal) EditText txttanggal;
    @BindView(R.id.txtTugas) EditText txtTugas;
    @BindView(R.id.txtQuis) EditText txtQuis;
    @BindView(R.id.txtUTS) EditText txtUTS;
    @BindView(R.id.txtUAS) EditText txtUAS;

    @OnClick(R.id.btnKlickMe)
    void hasil_tampil(){
        String Nama = edNama.getText().toString();
        String NPM = edNpm.getText().toString();
        String tanggal = edtanggal.getText().toString();
        String tugas = edtugas.getText().toString();
        String quiz = ednilaiquiz.getText().toString();
        String UTS = eduts.getText().toString();
        String UAS = edUAS.getText().toString();
        String A = Nama+" "+NPM+" "+tanggal+" "+tugas+""+quiz+""+UTS+""+UAS;

        Toast.makeText(getApplicationContext(),A,Toast.LENGTH_LONG).show();
        txtNama.setText(Nama);
        txtNpm.setText(NPM);
        txttanggal.setText(tanggal);
        txtTugas.setText(tugas);
        txtQuis.setText(quiz);
        txtUTS.setText(UTS);
        txtUAS.setText(UAS);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
