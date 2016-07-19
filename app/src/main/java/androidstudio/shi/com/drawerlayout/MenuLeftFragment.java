package androidstudio.shi.com.drawerlayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 左侧菜单
 * @author SHI
 * @time 2016/7/19 17:23
 */
public class MenuLeftFragment extends Fragment
{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState)
	{
		return inflater.inflate(R.layout.menu_layout_left, container, false);
	}
}
