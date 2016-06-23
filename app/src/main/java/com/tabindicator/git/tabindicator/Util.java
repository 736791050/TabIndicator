package com.tabindicator.git.tabindicator;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * Created by lk on 16/6/23.
 */
public class Util {
    /**
     * 根据手机的分辨率从dp的单位转成为px
     */
    public static int dip2px(float dpValue, Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        float density = displayMetrics.density;
        return (int) (dpValue * density + 0.5f);
    }
}
