package com.androidadvance.tsnackbar;

import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.androidadvance.topsnackbar.TSnackbar;

/**
 * Created by Jiang on 2017-08-04.
 */

public class AlertUtil {
    public static void showTopMessage(View view, String text) {
        TSnackbar snackbar = TSnackbar
                .make(view, text, TSnackbar.LENGTH_LONG)
                .setAction("Action", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("CLICKED Action", "CLIDKED Action");
                    }
                });
        snackbar.setActionTextColor(Color.WHITE);
        View snackbarView = snackbar.getView();
        snackbarView.setBackgroundColor(Color.parseColor("#0000CC"));
        TextView textView = (TextView) snackbarView.findViewById(com.androidadvance.topsnackbar.R.id.snackbar_text);
        textView.setTextColor(Color.WHITE);
        snackbar.show();
    }
}
