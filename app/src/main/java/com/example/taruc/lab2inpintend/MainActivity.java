package com.example.taruc.lab2inpintend;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void visitTARUC(View v)
    {String uri="http://tarc.edu.my";
     Intent intent= new Intent(Intent.ACTION_VIEW);
     intent.setData(Uri.parse(uri));
     startActivity(intent);

     if(intent.resolveActivity(getPackageManager())!=null)
     {startActivity(intent);}
     else{
         //Debug Message
         Log.d("Implict Intents", "Can't handle this intent!");
     }

    }

    public void showMain(View v)
    {Intent intent= new Intent(Intent.ACTION_MAIN);
     startActivity(intent);
    }

    public void showDial(View v)
    {Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "0123456789"));
     startActivity(intent);
    }

    public void showSendTo(View v)
    {Intent intent= new Intent(Intent.ACTION_SENDTO);
     intent.setData(Uri.parse("mailto:"+"seekt@acd.tarc.edu.my"));
     startActivity(intent);
    }


}

