package com.example.moviewatchjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView noteListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
        setNoteAdapter();
    }


    private void initWidgets() {
        noteListView = findViewById(R.id.movieListView);
    }

    private void setNoteAdapter() {
        NoteAdapter noteAdapter = new NoteAdapter(getApplicationContext(), Note.noteArrayList);
        noteListView.setAdapter(noteAdapter);
    }
    public void newMovie(View view) {
        Intent newNoteIntent = new Intent(this, MovieDetailActivity.class);
        startActivity(newNoteIntent);

    }
}