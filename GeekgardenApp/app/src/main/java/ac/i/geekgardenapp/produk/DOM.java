package ac.i.geekgardenapp.produk;

import ac.i.geekgardenapp.R;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DOM extends AppCompatActivity {
    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dom);

        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("DOM (Digital Order Management).pdf")
                .enableSwipe(true)
                .load();
    }
}