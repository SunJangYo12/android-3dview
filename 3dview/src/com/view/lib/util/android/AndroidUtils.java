package com.view.lib.util.android;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.app.Activity;
import android.content.Context;

import java.io.File;

public class AndroidUtils {

    @FunctionalInterface
    public interface Callback {
        void onClick(File file);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public static boolean checkPermission(Activity context, String permission, int callback) {
        /*if (android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            return true;
        }
        if (checkPermission(context, permission)) {
            return true;
        }
        requestPermission(context, permission, callback);*/
        return false;

    }

    public static boolean checkPermission(Activity context, String permission) {
        //int permissionCheck = ContextCompat.checkSelfPermission(context, permission);
        //return permissionCheck == PackageManager.PERMISSION_GRANTED;
        return false;
    }

    public static void requestPermission(Activity context, String permission, int callback) {
        //ActivityCompat.requestPermissions(context, new String[]{permission}, callback);
    }

    public static void openUrl(Activity activity, String url){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        activity.startActivity(i);
    }
}
