package com.kardelencetin.bottomdialog.adapter;

import androidx.annotation.ColorInt;

class BottomSheetHeader implements BottomSheetItem {

    private String mTitle;

    @ColorInt
    private int mTextColor;

    public BottomSheetHeader(String title, @ColorInt int color) {
        mTitle = title;
        mTextColor = color;
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
