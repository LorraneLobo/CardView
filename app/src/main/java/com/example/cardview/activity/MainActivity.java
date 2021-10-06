package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        //define adapter
        this.prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter(postagemList);
        recyclerPostagem.setAdapter(adapter);

    }

    public void prepararPostagens(){

        postagemList.add(new Postagem("Lorrane A F Brito Lobo", "#tbt Viagem legal!", R.drawable.imagem1 ));
        postagemList.add(new Postagem("Ciclano de Souza", "A vista está interessante hehe", R.drawable.imagem2 ));
        postagemList.add(new Postagem("Fulano da Silva", "Cidade linda", R.drawable.imagem3 ));
        postagemList.add(new Postagem("Igor Lisboa Lobo", "Dia muito bom!", R.drawable.imagem4 ));
    }
}