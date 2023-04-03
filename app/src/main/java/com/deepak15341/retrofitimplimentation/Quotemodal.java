package com.deepak15341.retrofitimplimentation;

import com.google.gson.annotations.SerializedName;

public class Quotemodal {
    @SerializedName("author")
    private String author;

    @SerializedName("en")
    private String en;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }
}
