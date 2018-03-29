package io.github.schierlm.webviewresourecbug;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ((WebView)findViewById(R.id.webview)).loadUrl("file:///android_asset/example.html");
    }

    Resources resources = null;

    @Override
    public Resources getResources() {
        if (resources == null) {
            resources = new MyResources(super.getResources());
        }
        return resources;
    }
}
