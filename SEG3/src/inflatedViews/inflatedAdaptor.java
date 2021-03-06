package inflatedViews;

import java.util.ArrayList;

import com.example.seg3.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
//we used http://stackoverflow.com/questions/13037643/how-to-force-autocompletetextview-drop-down-elements-to-wrap-text-in-three-or-mo 
//in order to understand how to construct a custom adaptor for autocompletetext

public class inflatedAdaptor extends ArrayAdapter<String> {
	public View view;

	public inflatedAdaptor(Context context,
			int textViewResourceId, ArrayList<String> countryNames) {
		super(context, textViewResourceId, countryNames);

	}

	@Override
	public View getView(int someInt, View someView, ViewGroup someViewGroup) {
		final LayoutInflater inflater = LayoutInflater.from(getContext());
		final View view = inflater.inflate(R.layout.dropdown_multiline_item,
				someViewGroup, false);
		

		TextView textView0 = (TextView) view.findViewById(R.id.item);
		textView0.setText(this.getItem(someInt));

		return view;

	}

	public void setTextOfTheView(View view, int i) {

		((TextView) view.findViewById(R.id.item)).setText(this.getItem(i));

	}
}