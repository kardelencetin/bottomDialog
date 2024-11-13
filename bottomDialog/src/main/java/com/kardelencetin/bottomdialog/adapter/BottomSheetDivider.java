package com.kardelencetin.bottomdialog.adapter;

import androidx.annotation.DrawableRes;

class BottomSheetDivider implements BottomSheetItem {

    @DrawableRes
    private int mBackgroundDrawable;

    public BottomSheetDivider(@DrawableRes int background) {
        mBackgroundDrawable = background;
    }

    @DrawableRes
    public int getBackground() {
        return mBackgroundDrawable;
    }

    @Override
    public String getTitle() {
        return "";
    }
}
