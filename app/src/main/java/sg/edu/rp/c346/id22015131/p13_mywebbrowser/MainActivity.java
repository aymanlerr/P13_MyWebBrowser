package sg.edu.rp.c346.id22015131.p13_mywebbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnLoadUrl;
    WebView wvMyPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoadUrl = (Button) findViewById(R.id.btnLoadUrl);
        wvMyPage = (WebView) findViewById(R.id.wvMyPage);

        wvMyPage.setWebViewClient(new WebViewClient());

        btnLoadUrl.setOnClickListener(v -> {
            String url = "https://www.rp.edu.sg/soi/home";
            wvMyPage.loadUrl(url);
            wvMyPage.getSettings().setBuiltInZoomControls(true);
        });
    }
}