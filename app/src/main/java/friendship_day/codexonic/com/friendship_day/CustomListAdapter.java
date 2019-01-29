package friendship_day.codexonic.com.friendship_day;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<CustomList> {
    public CustomListAdapter(Activity context, ArrayList<CustomList> customLists) {
        super(context, 0, customLists);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_single, parent, false);
        }
        CustomList currentCustomList = getItem(position);
        TextView text1 = listItemView.findViewById(R.id.text);
        text1.setText(currentCustomList.getmText1());
        ImageView imageView1 = listItemView.findViewById(R.id.image);
        imageView1.setImageResource(currentCustomList.getmImageResourceId1());

        return listItemView;
    }
}
