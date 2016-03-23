package task1.yalantis.com.task1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadImages();
    }

    private void loadImages() {

        ImageView img1  = (ImageView) findViewById(R.id.image1);
        ImageView img2  = (ImageView) findViewById(R.id.image2);
        Picasso.with(this).load("http://desktopgames.com.ua/games/23/manchkin-5f.jpg").into(img1);
        Picasso.with(this).load("http://desktopgames.com.ua/games/23/manchkin-1f.jpg").into(img2);

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "My custom text", Toast.LENGTH_SHORT).show();

//        System.exit(0);
    }
}
