package org.tensorflow.lite.examples.textclassification;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    private  Context mContext;
    private  int mResource;

    public NewsAdapter(@NonNull Context context, int resource, @NonNull List<News> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }

//    public NewsAdapter(Context context, ArrayAdapter<News> arrayAdapter) {
//        super(context, R.layout.list_item);
//    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResource, parent, false);

//        News news = getItem(position);
//        if (convertView == null ){
//            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent, false);
//        }

        TextView userInput = convertView.findViewById(R.id.userInput);
        TextView fakeOutput = convertView.findViewById(R.id.fakeOutput);
        TextView realOutput = convertView.findViewById(R.id.realOutput);

        userInput.setText(getItem(position).getUserInput());
        fakeOutput.setText(getItem(position).getFakeOutput());
        realOutput.setText(getItem(position).getRealOutput());

//        return super.getView(position, convertView, parent);
        return  convertView;
    }
}
