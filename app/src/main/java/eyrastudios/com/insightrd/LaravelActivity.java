package eyrastudios.com.insightrd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class LaravelActivity extends AppCompatActivity {

    String LaravelTutorials = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/Laravel%2Flaravel_tutorial.pdf?alt=media&token=2767383d-42db-43fd-90a7-53d4bd4f8676";
    String LearningLaravel = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/Laravel%2Flaravel.pdf?alt=media&token=29aa7d89-86a4-41aa-836a-7bcd86e7595c";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laravel);

        CardView laraveltuts = findViewById(R.id.laraveltut);
        CardView learninglaravel = findViewById(R.id.learninglaravel);

        laraveltuts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PDFActivity.class);
                intent.putExtra("PdfFile", LaravelTutorials);
                startActivity(intent);
            }
        });

        learninglaravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile", LearningLaravel);
                startActivity(intent);
            }
        });










        BottomNavigationView bottomNavigationView =findViewById(R.id.bottom_nav);

    }
}
