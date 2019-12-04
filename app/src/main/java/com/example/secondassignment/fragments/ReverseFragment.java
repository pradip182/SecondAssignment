package com.example.secondassignment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReverseFragment extends Fragment implements View.OnClickListener {

    private EditText etrev;
    private Button btnrev;
    private TextView tvrever;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_reverse, container, false);
        etrev=view.findViewById(R.id.etrev);
        btnrev=view.findViewById(R.id.btrev);
        tvrever=view.findViewById(R.id.tvrever);
        btnrev.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etrev.getText())) {
            etrev.setError("Enter Something");;
            return;
        }

        int num =Integer.parseInt(etrev.getText().toString());
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        tvrever.setText("Reversed Value is :"+reversed);

    }

}