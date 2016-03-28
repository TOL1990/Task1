package task1.yalantis.com.task1;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadImages();

    }

    private void loadImages() {
        //Reload old vers.
        ImageView img1 = (ImageView) findViewById(R.id.image1);
        ImageView img2 = (ImageView) findViewById(R.id.image2);
        Picasso.with(this).load(R.drawable.task1pict1).into(img1);
        Picasso.with(this).load(R.drawable.task1pict2).into(img2);

    }


    @Override
    public void onBackPressed() {

        Toast.makeText(this, "Any control", Toast.LENGTH_SHORT).show();

//       System.exit(0);
    }


}
