package eyrastudios.com.insightrd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PythonActivity extends AppCompatActivity {

    String PythonProgramming = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/Python%2FPython.pdf?alt=media&token=a945df87-a594-4b3f-8566-2eb9ec2b0c88";
    String CodePython = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/Python%2FPython_Programming.pdf?alt=media&token=5cf22017-fbae-4940-abff-fab5b5233b5d";
    String SturtPython = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/Python%2FSturtPythonReference.pdf?alt=media&token=8867c5f5-671a-45e0-b413-2ec5a01e9896";
    String Numpy = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/Python%2Fnumpy.pdf?alt=media&token=c3ce9b49-69f3-4e24-9ea0-366dc077963c";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);

        CardView PythonProgrammingid = findViewById(R.id.PythonProgramming);
        CardView CodingPython = findViewById(R.id.CodePython);
        CardView SturtsPythonref = findViewById(R.id.SturtPythonReference);
        CardView Numpython =  findViewById(R.id.numpy);

        PythonProgrammingid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile", PythonProgramming);
                startActivity(intent);
            }
        });

        CodingPython.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile",CodePython);
                startActivity(intent);
            }
        });

        SturtsPythonref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile", SturtPython);
                startActivity(intent);
            }
        });

        Numpython.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile", Numpy);
                startActivity(intent);
            }
        });













//        BottomNavigationView bottomNavigationView =findViewById(R.id.bottom_nav);

    }
}
