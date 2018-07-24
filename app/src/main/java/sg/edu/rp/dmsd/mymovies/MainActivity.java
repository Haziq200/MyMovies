package sg.edu.rp.dmsd.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvMovie;
    ArrayList<MovieList> alMovie;
    CustomeAdapter caMovie;

    TextView tvName;
    TextView tvType;
    TextView tvGenre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = findViewById(R.id.textViewName);
        tvType = findViewById(R.id.textViewType);
        tvGenre = findViewById(R.id.textViewGenre);

        tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),AnswerActivity.class);
                intent.putExtra("title","t");
                intent.putExtra("year","y");
                intent.putExtra("genre","g");
                intent.putExtra("description","d");
                intent.putExtra("watched","w");
                intent.putExtra("theatre","th");
                intent.putExtra("rating","pg13");
                Calendar date1 = Calendar.getInstance();
                date1.set(2012,4,26);
                Calendar date2 = Calendar.getInstance();
                date2.set(2013,9,5);
                startActivity(intent);

            }
        });

        lvMovie = findViewById(R.id.listViewMovie);

        alMovie = new ArrayList<>();
        


        MovieList movie1 = new MovieList("The Avengers","2017","Action | Sci-fi",false);
        MovieList movie2 = new MovieList("Planes","2013","Animation | Comedy",true);
        alMovie.add(movie1);
        alMovie.add(movie2);

        caMovie = new CustomeAdapter(this,R.layout.movie_list,alMovie);
        lvMovie.setAdapter(caMovie);

    }
}
