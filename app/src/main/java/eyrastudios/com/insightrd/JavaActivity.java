package eyrastudios.com.insightrd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class JavaActivity extends AppCompatActivity {

    String SpringTutorials = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/Java%2FSpring_tutorial.pdf?alt=media&token=5a584843-bde7-4f42-b47e-bb0d41199910";
    String JavaStructures = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/Java%2FJavaStructures.pdf?alt=media&token=1c404e7c-8a2f-47dc-8b24-516ae6076ee9";
    String DataStructures = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/Java%2Fopen%20data%20structures-java.pdf?alt=media&token=b32e6763-64f1-4a1f-af53-21745f182f41";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        CardView SpringTuts = findViewById(R.id.SpringTuts);
        CardView JavaStructs = findViewById(R.id.JavaStructures);
        CardView OpenDataStructs = findViewById(R.id.DataStructures);

        SpringTuts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile", SpringTutorials);
                startActivity(intent);
            }
        });

        JavaStructs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile", JavaStructures);
                startActivity(intent);
            }
        });

        OpenDataStructs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile", DataStructures);
                startActivity(intent);
            }
        });












       // BottomNavigationView bottomNavigationView =findViewById(R.id.bottom_nav);

    }
}
