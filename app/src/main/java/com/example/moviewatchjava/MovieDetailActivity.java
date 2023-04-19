package com.example.moviewatchjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MovieDetailActivity extends AppCompatActivity {

    private EditText titleEditText, descEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
    }

    private void initWidgets(){
        titleEditText = findViewById(R.id.titleEditText);
        descEditText = findViewById(R.id.descriptionEditText);

    }

    public void saveMovie(View view) {
        String title = String.valueOf(titleEditText.getText());
        String desc =  String.valueOf(descEditText.getText());

        int id = Note.noteArrayList.size();
        Note newNote = new Note(id, title, desc);
        finish();
    }
}