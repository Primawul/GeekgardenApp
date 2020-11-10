package ac.i.geekgardenapp.produk;

import ac.i.geekgardenapp.R;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ALFRED extends AppCompatActivity {
    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfred);
        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Alfred.pdf")
                .enableSwipe(true)
                .load();
    }
}