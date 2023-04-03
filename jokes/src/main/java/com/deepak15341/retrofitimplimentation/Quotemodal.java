package com.deepak15341.retrofitimplimentation;

import com.google.gson.annotations.SerializedName;

public class Quotemodal {
    @SerializedName("setup")
    private String setup;

    @SerializedName("punchline")
    private String punchline;

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }
}
