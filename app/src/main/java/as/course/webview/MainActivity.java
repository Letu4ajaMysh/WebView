package as.course.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );


        WebView myWebView = (WebView) findViewById(R.id.webview);
//        myWebView.loadUrl("https://cs.mir4global.com/customer");

        myWebView.loadUrl("file:///android_asset/sample.html");

//        String unencodedHtml =
//                "<!DOCTYPE html>\n" +
//                        "<html>\n" +
//                        "<head>\n" +
//                        "<title>Page Title</title>\n" +
//                        "</head>\n" +
//                        "<body>\n" +
//                        "\n" +
//                        "<h1>Lineage 2</h1>\n" +
//                        "<p>Официальное русскоязычное сообщество одной из самых популярных MMORPG в мире!.</p>\n" +
//                        "\n" +
//                        "</body>\n" +
//                        "</html>";
//        String encodedHtml = Base64.encodeToString(unencodedHtml.getBytes(),
//                Base64.NO_PADDING);
//        myWebView.loadData(encodedHtml, "text/html", "base64");
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }
}