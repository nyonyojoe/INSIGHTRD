package eyrastudios.com.insightrd;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class AndroidActivity extends AppCompatActivity {

    String AndroidTutsPT = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/Android%2Fandroids_tutorial.pdf?alt=media&token=ccaf7084-6370-4f17-bfb8-fe974fc8a892";
    String AndroidDevelopment = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/Android%2FAndroid%20Application%20Development.pdf?alt=media&token=1921ae75-e8d3-4efb-98d4-af8236a59923";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);


        CardView AndroidPT = findViewById(R.id.AndroidTutotialsPoint);
        CardView AndroidDev = findViewById(R.id.AndroidDevelopment);


        AndroidPT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile", AndroidTutsPT);
                startActivity(intent);
            }
        });

        AndroidDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile", AndroidDevelopment);
                startActivity(intent);
            }
        });




    }
}
