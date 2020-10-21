package ac.i.geekgardenapp.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smarteist.autoimageslider.SliderView;

import ac.i.geekgardenapp.Activity.Login;
import ac.i.geekgardenapp.Activity.Profil;
import ac.i.geekgardenapp.Activity.Register;
import ac.i.geekgardenapp.Adapter.ImageSliderSatu;
import ac.i.geekgardenapp.R;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class lainlain extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.fragment_lainlain, container, false);
        CardView cvakun = (CardView) view.findViewById(R.id.akunsaya);
        cvakun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),Profil.class);
                startActivity(i);
            }
        });
        return view;
    }
}

