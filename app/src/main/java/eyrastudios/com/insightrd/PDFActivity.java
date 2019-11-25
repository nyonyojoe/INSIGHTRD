package eyrastudios.com.insightrd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.os.AsyncTask;
import android.widget.ProgressBar;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFActivity extends AppCompatActivity {

   // WebView myPDFViewer;
    PDFView mypdflibrary;
    ProgressBar loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);

        //myPDFViewer = (WebView) findViewById(R.id.pdfview);
        mypdflibrary = findViewById(R.id.pdfviewLibrary);

        //myPDFViewer.getSettings().setJavaScriptEnabled(true);



           String getItem = getIntent().getStringExtra("PdfFile");




        //loadUrl("https://firebasestorage.googleapis.com/v0/b/insightrd-3b7d4.appspot.com/o/Algorithms%2FAlgorithms.pdf?alt=media&token=b6608720-f3f7-4c66-bc55-6336088d5035");

//      This function reads pdf from the pdf from url
        new RetrievePDFStream().execute(getItem);


    }

    class RetrievePDFStream extends AsyncTask<String,Void,InputStream>
    {

        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream = null;
            try {
                URL url = new URL(strings[0]);
                HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
                if(urlConnection.getResponseCode() == 200)
                {
                   inputStream = new BufferedInputStream(urlConnection.getInputStream());
                }
            }
            catch (IOException e)
            {
                return null;
            }
            return inputStream;
        }

        @Override
        protected void onPostExecute(InputStream inputStream){
            mypdflibrary.fromStream(inputStream).load();
        }
    }
}
