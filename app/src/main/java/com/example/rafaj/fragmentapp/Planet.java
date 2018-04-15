package com.example.rafaj.fragmentapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Planet implements Parcelable{
    private String name;
    private int id;

    public Planet( String name, int id){
        this.name = name;
        this.id = id;
    }

    protected Planet(Parcel in) {
        name = in.readString();
        id = in.readInt();
    }

    public static final Creator<Planet> CREATOR = new Creator<Planet>() {
        @Override
        public Planet createFromParcel(Parcel in) {
            return new Planet(in);
        }

        @Override
        public Planet[] newArray(int size) {
            return new Planet[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(id);
    }
}
