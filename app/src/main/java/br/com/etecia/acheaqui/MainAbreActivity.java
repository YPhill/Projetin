package br.com.etecia.acheaqui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.MaterialToolbar;

public class MainAbreActivity extends AppCompatActivity {

    TextView mDocumento, mCategoria, mDescricao;

    ImageView mImagemDoc;

    MaterialToolbar idToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_abre_layout);


        mDocumento = findViewById(R.id.mDocumento);
        mCategoria = findViewById(R.id.mCategoria);
        mDescricao = findViewById(R.id.mDescricao);
        mImagemDoc = findViewById(R.id.mImagemDoc);


        idToolbar = findViewById(R.id.idToolBar);

        Intent intent = getIntent();
        //Declarando as variáveis que irão receber o valor
        String documento, descricao, categoria;
        int imagemFilme;

        documento = intent.getExtras().getString("Documento");
        descricao = intent.getExtras().getString("Descricao");
        categoria = intent.getExtras().getString("Categoria");

        imagemFilme = intent.getExtras().getInt("ImagemFilme");

        mDocumento.setText(documento);
        mDescricao.setText(descricao);
        mCategoria.setText(categoria);
        mImagemDoc.setImageResource(imagemFilme);


    }
}