package com.example.desenvolverdor.searchwords;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    Button search;
    TextView word;
    TextView meaning;
    EditText searchword;

    public MainActivityFragment() {


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        search = (Button)view.findViewById(R.id.ButtonSearch);
        searchword = (EditText)view.findViewById(R.id.editTextSearch);
        word = (TextView)view.findViewById(R.id.word);
        meaning = (TextView)view.findViewById(R.id.meaning);
        final SearchWord sw = new SearchWord();

        search.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String word2 = searchword.getText().toString();
                word.setText(sw.SearchWord(word2));
            }
        });

        return view;
    }
}
