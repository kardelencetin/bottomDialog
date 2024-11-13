package com.kardelencetin.bottomdialog.adapter;

import android.graphics.drawable.Drawable;
import android.view.MenuItem;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.core.graphics.drawable.DrawableCompat;

class BottomSheetMenuItem implements BottomSheetItem {

    @ColorInt
    private int mTextColor;

    @ColorInt
    private int mTintColor;

    private Drawable mIcon;
    private String mTitle;
    private int mId;
    private MenuItem mMenuItem;

    @DrawableRes
    private int mBackground;

    public BottomSheetMenuItem(MenuItem item, @ColorInt int textColor, @DrawableRes int background,
                               @ColorInt int tintColor) {
        mMenuItem = item;
        mIcon = item.getIcon();
        mId = item.getItemId();
        mTitle = item.getTitle().toString();
        mTextColor = textColor;
        mBackground = background;
        mTintColor = tintColor;

        // Check if we have a tint to be applied to an icon
        if (mTintColor != -1 && mIcon != null) {
            mIcon = DrawableCompat.wrap(mIcon);
            DrawableCompat.setTint(mIcon, mTintColor);
        }
    }

    public Drawable getIcon() {
        return mIcon;
    }

    public MenuItem getMenuItem() {
        return mMenuItem;
    }

    @DrawableRes
    public int getBackground() {
        return mBackground;
    }

    public int getId() {
        return mId;
    }

    @ColorInt
    public int getTextColor() {
        return mTextColor;
    }

    @Override
    public String getTitle() {
        return mTitle;
    }
}
