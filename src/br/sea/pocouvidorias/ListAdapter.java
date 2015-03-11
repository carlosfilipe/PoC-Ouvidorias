package br.sea.pocouvidorias;

import java.util.ArrayList;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {

	ArrayList<ListElement> list;
	Context context;	
	public ListAdapter(Context c) {
		
		this.context = c;
		list = new ArrayList<ListElement>();
		
		for (int i = 0; i < 5; i++) {
			list.add(new ListElement("TCU", "Tribunal de Contas da União",
					R.drawable.tcu_imagem));

		}

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return list.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View row = inflater.inflate(R.layout.elemento_lista_orgaos, arg2, false);
		
		TextView title = (TextView) row.findViewById(R.id.textView1);
		TextView fullName = (TextView) row.findViewById(R.id.textView2);
		ImageView image = (ImageView) row.findViewById(R.id.imageView1);
		
		
		ListElement temp =list.get(arg0);
		title.setText(temp.shortName);
		fullName.setText(temp.fullName);
		image.setImageResource(temp.image);
		
		
		return row;
	}

}
