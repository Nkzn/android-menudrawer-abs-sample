package jp.water_cell.android.sample.menudrawer;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.actionbarsherlock.app.SherlockListFragment;

public class MenuFragment extends SherlockListFragment {

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1);
		for(int i=0; i < 20; i++) {
			adapter.add("メニュー"+i);
		}
		
		setListAdapter(adapter);
	}
	
}
