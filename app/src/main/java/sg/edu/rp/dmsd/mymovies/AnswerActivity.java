package sg.edu.rp.dmsd.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView tvTitleAns;
    TextView tvYearAns;
    TextView tvGenreAns;
    TextView tvDescAns;
    TextView tvWatchAns;
    TextView tvTheatreAns;
    ImageView imMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        tvTitleAns = findViewById(R.id.textViewTitle);
        tvYearAns = findViewById(R.id.textViewYear);
        tvGenreAns = findViewById(R.id.textViewGenre1);
        tvDescAns = findViewById(R.id.textViewDescr);
        tvWatchAns = findViewById(R.id.textViewWatch);
        tvTheatreAns = findViewById(R.id.textViewTheatre);
        imMovie = findViewById(R.id.imageViewMovie);

        tvTitleAns.setText("The Avengers");
        tvYearAns.setText("2017");
        tvGenreAns.setText("Action | Sci-fi");
        tvDescAns.setText("Nick Fury of S.H.I.E.L.D assembles a team of superheores to save the planet from Loki and his army.");
        tvWatchAns.setText("Watch on:15/12/2014");
        tvTheatreAns.setText("in Theatre:Golden Village- Bishan");
        imMovie.setImageResource(R.drawable.rating_pg13);

        Intent intentReceived = getIntent();
        String titleSelected = intentReceived.getStringExtra("title");
        tvTitleAns.setText(titleSelected);
        Intent intentReceived1 = getIntent();
        String yearSelected = intentReceived1.getStringExtra("year");
        tvTitleAns.setText(yearSelected);
        Intent intentReceived2 = getIntent();
        String genreSelected = intentReceived2.getStringExtra("genre");
        tvGenreAns.setText(genreSelected);
        Intent intentReceived3 = getIntent();
        String descSelected = intentReceived3.getStringExtra("description");
        tvDescAns.setText(descSelected);
        Intent intentReceived4 = getIntent();
        String watchSelected = intentReceived4.getStringExtra("watched");
        tvWatchAns.setText(watchSelected);
        Intent intentReceived5 = getIntent();
        String theatreSelected = intentReceived5.getStringExtra("theatre");
        tvTheatreAns.setText(theatreSelected);

    }
}
