package com.example.secondassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import com.example.secondassignment.fragments.AreaofCircle;
import com.example.secondassignment.fragments.AutomorphicFragment;
import com.example.secondassignment.fragments.PalindromeFragment;
import com.example.secondassignment.fragments.ReverseFragment;
import com.example.secondassignment.fragments.StringRevFragment;
import com.example.secondassignment.fragments.SumFragment;

public class MainActivity extends AppCompatActivity{

    Button btnsum,btnareaofcircle,btnreversenumber,btnpalindrome,btnautomorphicnumber,btnreverseofstring;
    private String status="f1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsum=findViewById(R.id.btnadd);
        btnareaofcircle=findViewById(R.id.btnareaofcircle);
        btnreversenumber=findViewById(R.id.btnreverseofnumber);
        btnpalindrome=findViewById(R.id.btnpalindrome);
        btnautomorphicnumber=findViewById(R.id.btnautomophic);
        btnreverseofstring=findViewById(R.id.btnreverseofstring);

        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                SumFragment sumFragment=new SumFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,sumFragment);
                fragmentTransaction.commit();
            }
        });


        btnareaofcircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                AreaofCircle areaofCircle=new AreaofCircle();
                fragmentTransaction.replace(R.id.fragmentcontainer,areaofCircle);
                fragmentTransaction.commit();
            }
        });

        btnreversenumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                ReverseFragment reverseFragment=new ReverseFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,reverseFragment);
                fragmentTransaction.commit();
            }
        });

        btnpalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                PalindromeFragment palindromeFragment=new PalindromeFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,palindromeFragment);
                fragmentTransaction.commit();
            }
        });

        btnautomorphicnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                AutomorphicFragment automorphicFragment=new AutomorphicFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,automorphicFragment);
                fragmentTransaction.commit();
            }
        });

        btnreverseofstring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                StringRevFragment stringRevFragment=new StringRevFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,stringRevFragment);
                fragmentTransaction.commit();

            }
        });

    }


}