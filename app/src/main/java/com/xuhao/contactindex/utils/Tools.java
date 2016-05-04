package com.xuhao.contactindex.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Author：Robert Xu
 * <p/>
 * Email: xuhaozv@163.com
 * <p/>
 * description:工具类
 * <p/>
 * Date: 2016/5/4  16:38
 */
public class Tools {
    public static Toast mToast;

    public static void showToast(Context mContext, String msg) {
        if (mToast == null) {
            mToast = Toast.makeText(mContext, "", Toast.LENGTH_SHORT);
        }
        mToast.setText(msg);
        mToast.show();
    }
}
