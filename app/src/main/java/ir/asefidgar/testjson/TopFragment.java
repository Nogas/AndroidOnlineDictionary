package ir.asefidgar.testjson;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class TopFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_top,container,false);

        TextView txt = (TextView) v.findViewById(R.id.top_txt);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Vazir.ttf");
        txt.setTypeface(font);

        Button button= (Button) v.findViewById(R.id.top_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getFragmentManager().popBackStack();
            }
        });

        return v;
    }
}
