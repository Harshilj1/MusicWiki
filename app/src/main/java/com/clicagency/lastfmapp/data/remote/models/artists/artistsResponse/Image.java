
package com.clicagency.lastfmapp.data.remote.models.artists.artistsResponse;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image implements Serializable
{

    @SerializedName("size")
    @Expose
    private String size;
    @SerializedName("#text")
    @Expose
    private String text;
    private final static long serialVersionUID = 8461661586560227492L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Image() {
    }

    /**
     * 
     * @param size
     * @param text
     */
    public Image(String size, String text) {
        super();
        this.size = size;
        this.text = text;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
