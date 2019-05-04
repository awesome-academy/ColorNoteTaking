package com.sun.colornotetaking.data.model;

public class Label {
    private int mId;
    private String mName;
    private int mColor;

    public Label(String name) {
        mName = name;
    }

    public Label(int id, String name, int Color) {
        mId = id;
        mName = name;
        mColor = Color;
    }

    public int getId() {
        return mId;
    }

    public int getColor() {
        return mColor;
    }

    public void setColor(int color) {
        mColor = color;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}