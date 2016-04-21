package advance.com.expandablelistmultiselectexample;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

public class ExpandableListAdapter extends BaseExpandableListAdapter {

    private static final float PERCENTAGE = 0.8f;

    private final LayoutInflater inflater;
    private final ExpandableListView expandableListView;

    public ExpandableListAdapter(Context context, ExpandableListView expandableListView) {
        inflater = LayoutInflater.from(context);
        this.expandableListView = expandableListView;
    }

    @Override
    public int getGroupCount() {
        return DataHolder.CATEGORY.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        final String category = DataHolder.CATEGORY.get(groupPosition);
        return DataHolder.CATEGORY_FIGHTERS.get(category).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return DataHolder.CATEGORY.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        final String category = DataHolder.CATEGORY.get(groupPosition);
        return DataHolder.CATEGORY_FIGHTERS.get(category).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(final int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.expandable_list_group, null);
        }
        TextView categoryNameTextView = (TextView) convertView.findViewById(R.id.categoryName);
        categoryNameTextView.setText(DataHolder.CATEGORY.get(groupPosition));
        ImageView expandButton = (ImageView) convertView.findViewById(R.id.expandButton);
        ImageView collapseButton = (ImageView) convertView.findViewById(R.id.collapseButton);
        convertView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN || event.getAction() == MotionEvent.ACTION_UP){
                    int x = (int) event.getX();
                    if (x > (v.getRight() * PERCENTAGE)) {
                        if (expandableListView.isGroupExpanded(groupPosition)) {
                            expandableListView.collapseGroup(groupPosition);
                        } else {
                            expandableListView.expandGroup(groupPosition);
                        }
                    }
                }
                return false;
            }
        });
        if (expandableListView.isGroupExpanded(groupPosition)) {
            expandButton.setVisibility(View.GONE);
            collapseButton.setVisibility(View.VISIBLE);
        } else {
            expandButton.setVisibility(View.VISIBLE);
            collapseButton.setVisibility(View.GONE);
        }
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String category = DataHolder.CATEGORY.get(groupPosition);
        final String childText = DataHolder.CATEGORY_FIGHTERS.get(category).get(childPosition);

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.expandable_list_child, null);
        }

        TextView fighterNameTextView = (TextView) convertView.findViewById(R.id.childName);
        fighterNameTextView.setText(childText);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
