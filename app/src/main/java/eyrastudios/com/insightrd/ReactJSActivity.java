package eyrastudios.com.insightrd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ReactJSActivity extends AppCompatActivity {

    String Reacttut = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/ReactJS%2FReact%20Cheat%20Sheet.pdf?alt=media&token=7a40e926-7aee-4f71-8221-af3a43e0ef90";
    String ReactMit = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/ReactJS%2FReact-MIT.pdf?alt=media&token=152b739e-4d62-40af-bee0-9f0eab5db05d";
    String ReactReference = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/ReactJS%2FReactjs%20Reference%20sheet.pdf?alt=media&token=ec8859f8-d0ac-40c2-8163-32f1805370bc";
    String ReactGuide = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/ReactJS%2FReact_Quick_Start_Guide.pdf?alt=media&token=a50db7e2-88a7-4865-a8c5-04813b3c0e6a";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_react_js);

        CardView ReactTutorial = findViewById(R.id.reacttut);
        CardView reactmittut = findViewById(R.id.reactmit);
        CardView reactref = findViewById(R.id.reactref);
        CardView reactguide = findViewById(R.id.reactguide);


        ReactTutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile", Reacttut);
                startActivity(intent);
            }
        });

        reactmittut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile", ReactMit);
                startActivity(intent);
            }
       });

        reactref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile", ReactReference);
                startActivity(intent);
            }
        });

        reactguide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile", ReactGuide);
                startActivity(intent);
            }
        });











//        BottomNavigationView bottomNavigationView =findViewById(R.id.bottom_nav);

    }
}
