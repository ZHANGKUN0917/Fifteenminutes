package test.bwie.com.fifteenminutes.adpter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import test.bwie.com.fifteenminutes.R;
import test.bwie.com.fifteenminutes.bean.Bean;

/**
 * 类的用途：
 *
 * @author HP
 * @date 2017/11/1 21 00
 */

public class ListAdpter extends BaseAdapter {
    private Context context;
    private List<Bean> list;

    public ListAdpter(Context context, List<Bean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=View.inflate(context, R.layout.list,null);
        ImageView iv=view.findViewById(R.id.iv);
        ImageView iv1=view.findViewById(R.id.iv1);
        TextView tv=view.findViewById(R.id.tv);
        iv.setImageResource(list.get(i).getTp());
        iv1.setImageResource(R.mipmap.raw_1499943790);
        tv.setText(list.get(i).getName());
        return view;
    }

}
