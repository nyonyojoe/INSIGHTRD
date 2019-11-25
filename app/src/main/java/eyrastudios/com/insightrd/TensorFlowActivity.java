package eyrastudios.com.insightrd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TensorFlowActivity extends AppCompatActivity {

    String Deeplearningtensor = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/TensorFlow%2FDeep-learning-tensorflow.pdf?alt=media&token=7e1abfbd-e5f1-4376-ab64-664848239e56";
    String IntroductionTOTensor = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/TensorFlow%2FIntroduction-to-tensorflow.pdf?alt=media&token=41887f7a-6099-4846-90d9-c3f7121cf29f";
    String  MlTensorFlow = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/TensorFlow%2FMLG_TensorFlow.pdf?alt=media&token=f04be581-747f-44c2-bb1d-d86c84ff8989";
    String TensorWorkshop = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/TensorFlow%2FTensorFlow-Workshop.pdf?alt=media&token=9826039a-0e40-4fea-9cda-c0447922e9c2";
    String TensorFlowPaper = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/TensorFlow%2FTensorFlow-whitepaper-2015.pdf?alt=media&token=7265c486-fae3-400d-8ef5-6948954cbd44";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tensor_flow);

        CardView Deeplearntensor = findViewById(R.id.Deeplearningtensorflow);
        CardView Intrototensor = findViewById(R.id.Intrototensor);
        CardView MLtensorFlow = findViewById(R.id.MLtensor);
        CardView TensorFlowWorkshop = findViewById(R.id.TensorFlowWorkShop);
        final CardView TensorFLowPap = findViewById(R.id.TensorFlowWhite);

        Deeplearntensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile", Deeplearningtensor);
                startActivity(intent);
            }
        });

        Intrototensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile", IntroductionTOTensor);
                startActivity(intent);
            }
        });

        MLtensorFlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile", MlTensorFlow);
                startActivity(intent);
            }
        });

        TensorFlowWorkshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile",TensorWorkshop);
                startActivity(intent);
            }
        });

        TensorFLowPap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile", TensorFlowPaper);
                startActivity(intent);
            }
        });












        BottomNavigationView bottomNavigationView =findViewById(R.id.bottom_nav);

    }
}
