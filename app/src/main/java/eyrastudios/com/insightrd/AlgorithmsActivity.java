package eyrastudios.com.insightrd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AlgorithmsActivity extends AppCompatActivity {
    String pdfUrl = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/Algorithms%2FAlgorithms.pdf?alt=media&token=b6608720-f3f7-4c66-bc55-6336088d5035";
    String quantumAL = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/Algorithms%2FAn%20Introduction%20to%20Quantum%20Algorithms_tutorial.pdf?alt=media&token=fffc6a62-6427-4f35-9ec7-3b766f78bbea";
    String AlgorithmsData = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/Algorithms%2FBasic%20Introduction%20into%20Algorithms%20and%20Data.pdf?alt=media&token=c243e5e7-4af1-41f5-ba58-304295ab6f5a";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithms);

        CardView albk1 = findViewById(R.id.AL1);
        CardView QuantumAL = findViewById(R.id.QuantumAL);
        CardView AlgorithmsandData = findViewById(R.id.Algorithm_Data);

        albk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile", pdfUrl);
                startActivity(intent);

            }
        });

        QuantumAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile", quantumAL);
                startActivity(intent);
            }
        });

        AlgorithmsandData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile", AlgorithmsData);
                startActivity(intent);
            }
        });











    }
}
