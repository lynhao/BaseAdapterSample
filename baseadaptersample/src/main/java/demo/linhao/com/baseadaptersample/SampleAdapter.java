package demo.linhao.com.baseadaptersample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by linhao on 16/3/6.
 */
public class SampleAdapter extends BaseAdapter {
    private List<ItemBean> beanList;
    private LayoutInflater mInflate;

    public SampleAdapter(Context context, List<ItemBean> list) {
        mInflate = LayoutInflater.from(context);
        beanList = list;
    }


    @Override
    public int getCount() {
        return beanList.size();
    }

    @Override
    public Object getItem(int position) {
        return beanList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        View view = mInflate.inflate(R.layout.item, null);
//        ImageView itemImage = (ImageView) view.findViewById(R.id.iv_image);
//        TextView itemTile = (TextView) view.findViewById(R.id.tv_title);
//        TextView itemContent = (TextView) view.findViewById(R.id.tv_content);
//        ItemBean bean = beanList.get(position);
//        itemImage.setImageResource(bean.itemImageId);
//        itemTile.setText(bean.ImageTile);
//        itemContent.setText(bean.ImageContent);
//        return view;
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = mInflate.inflate(R.layout.item, null);
            holder.photo = (ImageView) convertView.findViewById(R.id.iv_image);
            holder.mTitle = (TextView) convertView.findViewById(R.id.tv_title);
            holder.mContent = (TextView) convertView.findViewById(R.id.tv_content);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        ItemBean itemBean = beanList.get(position);
        holder.photo.setImageResource(itemBean.itemImageId);
        holder.mTitle.setText(itemBean.ImageTile);
        holder.mContent.setText(itemBean.ImageContent);

        return convertView;

    }

    public class ViewHolder {
        ImageView photo;
        TextView mTitle, mContent;
    }
}
