package vazquez.guillermo.songq.Fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import vazquez.guillermo.songq.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class JoinFragmnet extends Fragment {

    View v;

    public JoinFragmnet() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_join_fragmnet, container, false);

        return v;

    }

}
