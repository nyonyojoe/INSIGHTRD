package eyrastudios.com.insightrd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class LibraryActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    String Androidtutorialfromtutorialspoint = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/Android%2Fandroids_tutorial.pdf?alt=media&token=ccaf7084-6370-4f17-bfb8-fe974fc8a892";
    String AngularJSForProfessionals = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/AngularJS%2FAngularJS%20Notes%20For%20Professionals.pdf?alt=media&token=7d1921bf-a367-4004-86b0-7365883b5d13";
    String ReactCheats = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/ReactJS%2FReact%20Cheat%20Sheet.pdf?alt=media&token=7a40e926-7aee-4f71-8221-af3a43e0ef90";
    String PythonPro = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/Python%2FPython_Programming.pdf?alt=media&token=5cf22017-fbae-4940-abff-fab5b5233b5d";
    String DeepLearning = "https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/TensorFlow%2FDeep-learning-tensorflow.pdf?alt=media&token=7e1abfbd-e5f1-4376-ab64-664848239e56";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        CardView AndroidTUts = findViewById(R.id.AndroidTutotialsPoint);
        CardView AngularJS = findViewById(R.id.Angularnotes);
        CardView ReactCheat = findViewById(R.id.reactcheats);
        CardView PythonBK = findViewById(R.id.PythonProgramming);
        CardView TensorFlow = findViewById(R.id.Deeplearningtensorflow);


        AndroidTUts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile",Androidtutorialfromtutorialspoint);
                startActivity(intent);
            }
        });

        AngularJS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile",AngularJSForProfessionals);
                startActivity(intent);
            }
        });

        ReactCheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile", ReactCheats);
                startActivity(intent);
            }
        });

        PythonBK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile",PythonPro);
                startActivity(intent);
            }
        });

        TensorFlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PDFActivity.class);
                intent.putExtra("PdfFile", DeepLearning);
                startActivity(intent);
            }
        });




























        bottomNavigationView =findViewById(R.id.bottom_nav);
        //BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);



        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext(),DashActivity.class));
                        break;
                    case R.id.nav_library:
                        //startActivity(new Intent(getApplicationContext(),LibraryActivity.class));
                        break;
                    case R.id.nav_search:
                        startActivity(new Intent(getApplicationContext(),SearchActivity.class));
                        break;
                    case  R.id.nav_settings:
                        startActivity(new Intent(getApplicationContext(),SettingsActivity.class));
                        break;
                }

                return false;
            }
        });
    }
}
