package com.android.settings.celestial.util;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;

public interface AbstractIconsHandler {
    public Drawable getIconFromHandler(Context context, ActivityInfo info);
}
