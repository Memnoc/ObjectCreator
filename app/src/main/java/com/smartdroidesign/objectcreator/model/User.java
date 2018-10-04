package com.smartdroidesign.objectcreator.model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    private String name, createdBy, publisher;
    private String abilities;

    public User(String name, String createdBy, String publisher, String abilities) {
        this.name = name;
        this.createdBy = createdBy;
        this.publisher = publisher;
        this.abilities = abilities;
    }

    protected User(Parcel in) {
        name = in.readString();
        createdBy = in.readString();
        publisher = in.readString();
        abilities = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(createdBy);
        dest.writeString(publisher);
        dest.writeString(abilities);
    }
}
