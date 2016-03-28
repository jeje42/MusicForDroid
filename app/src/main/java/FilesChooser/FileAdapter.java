package FilesChooser;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.io.File;
import java.util.List;

/**
 * Created by jeje on 3/28/16.
 */
public class FileAdapter extends ArrayAdapter<File>{
	private LayoutInflater mInflater = null;

	public FileAdapter(Context context, int textViewResourceId, File ... objects) {
		super(context, textViewResourceId, objects);
		mInflater = LayoutInflater.from(context);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		File item = getItem(position);

		//Todo : include style for already selected items in the preferences.

		CheckBox box = new CheckBox(getContext());

		box.setText(item.getName());
		box.setChecked(false);

		return box;
		//return super.getView(position, convertView, parent);
	}
}
