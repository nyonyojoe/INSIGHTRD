package eyrastudios.com.insightrd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.PriorityQueue;

public class MainActivity extends AppCompatActivity {

    LinearLayout loginbt;
    TextView gotosignup;
    EditText Email,Password;
    FirebaseAuth mFireBaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateLstener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbt = findViewById(R.id.linear);
        gotosignup = findViewById(R.id.signuppageid);
        Email = findViewById(R.id.loginEmailid);
        Password = findViewById(R.id.signuppasswordid);
        mFireBaseAuth = FirebaseAuth.getInstance();





        gotosignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),SignupActivity.class));
            }
        });


    }
}
