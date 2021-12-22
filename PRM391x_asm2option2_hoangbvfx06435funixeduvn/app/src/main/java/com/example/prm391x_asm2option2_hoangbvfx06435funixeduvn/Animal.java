package com.example.prm391x_asm2option2_hoangbvfx06435funixeduvn;


import java.io.Serializable;

public class Animal implements Serializable {
    private final int photo;
//    private final int photoBg;
    private final String name;
//    private final String content;
//    private boolean isFav;

    public Animal(int photo, String name) {
        this.photo = photo;
        this.name = name;
    }

//    public Animal(int photo, int photoBg, String name, String content, boolean isFav) {
//        this.photo = photo;
//        this.photoBg = photoBg;
//        this.name = name;
//        this.content = content;
//        this.isFav = isFav;
//    }

//    public void setFav(boolean fav) {
//        isFav = fav;
//    }
//
//    public boolean isFav() {
//        return isFav;
//    }

    public int getPhoto() {
        return photo;
    }

//    public int getPhotoBg() {
//        return photoBg;
//    }

    public String getName() {
        return name;
    }

//    public String getContent() {
//        return content;
//    }
}
