package eyrastudios.com.insightrd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashActivity extends AppCompatActivity {

    CardView AndroidBooks, JavaBooks, TensorFlowBooks, PythonBooks, AlgorithmBooks, ReactBooks, LaravelBooks, VueJsBooks, AngularBooks, KotlinBooks, BootstrapBooks, DockerBooks, NodeJSBooks, MongoDBooks, TypeScriptBooks;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        AndroidBooks = findViewById(R.id.androidbooksactivityid);
        JavaBooks = findViewById(R.id.javabooksactivityid);
        TensorFlowBooks = findViewById(R.id.tensorflowbooksactivityid);
        PythonBooks = findViewById(R.id.pythonbooksactivityid);
        AlgorithmBooks = findViewById(R.id.algorithmbooksactivityid);
        ReactBooks = findViewById(R.id.reactjsbooksactivityid);
        LaravelBooks = findViewById(R.id.laravelbooksactivityid);
        VueJsBooks = findViewById(R.id.vuejsbooksactivityid);
        AngularBooks = findViewById(R.id.angularbooksactivityid);
        KotlinBooks = findViewById(R.id.kotlinbooksactivityid);
        BootstrapBooks = findViewById(R.id.bootstrapbooksactivityid);
        DockerBooks = findViewById(R.id.dockerbooksactivityid);
        NodeJSBooks = findViewById(R.id.nodejsbooksactivityid);
        MongoDBooks = findViewById(R.id.mongodbbooksactivityid);
        TypeScriptBooks = findViewById(R.id.typescriptbooksactivityid);
        bottomNavigationView =findViewById(R.id.bottom_nav);


        AndroidBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(getApplicationContext(),AndroidActivity.class));
            }
        });


        AngularBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),AngularActivity.class));
            }
        });


        JavaBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),JavaActivity.class));
            }
        });


        TensorFlowBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),TensorFlowActivity.class));
            }
        });


        PythonBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PythonActivity.class));
            }
        });


        AlgorithmBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),AlgorithmsActivity.class));
            }
        });


        ReactBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ReactJSActivity.class));
            }
        });


        LaravelBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),LaravelActivity.class));
            }
        });


        VueJsBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),VueJSActivity.class));
            }
        });


        KotlinBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),KotlinActivity.class));
            }
        });


        BootstrapBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),BootstrapActivity.class));
            }
        });


        DockerBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),DockerActivity.class));
            }
        });


        NodeJSBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),NodeJSActivity.class));
            }
        });


        MongoDBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MongoDBActivity.class));
            }
        });


        TypeScriptBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),TypeScriptActivity.class));
            }
        });





        //BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        //This handles the Bottom navigation

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.nav_home:
                        //startActivity(new Intent(getApplicationContext(),DashActivity.class));
                        break;
                    case R.id.nav_library:
                        startActivity(new Intent(getApplicationContext(),LibraryActivity.class));
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
