package com.yschi.castscreen.ui.activity;

import android.view.View;
import android.widget.EditText;

/**
 * Created by kevinleperf on 26/03/16.
 */
public interface IToolbarManipulation {

    void setCanEdit(boolean state);

    void notifyCollapsingSetChanged();

    void setEditTextFocusListenerFor(EditText edit_text);

    void scrollTo(View view);

    void setBackable(boolean backable);

    int getExpandableHeight();
}
