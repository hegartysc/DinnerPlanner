package org.example.Elements;

import java.util.ArrayList;

public class Recipe extends Object {
    private String name;
    private String servings;
    private String source;
    private String rating;
    private String image;
    private String on_favorites;
    private String favorite;
    private String prep_time;
    private String cook_time;
    private String other_time;
    private String images;
    private String cookcount;
    private String lastcook;
    private String tags;
    private String nutritional_info;
    private String notes;
    private String video;
    private String ingredients;
    private String directions;
    private String created;

    public Recipe() {
        super();
    }

    public Recipe(String name, String servings, String source, String rating, String image, String on_favorites, String favorite, String prep_time, String cook_time, String other_time, String images, String cookcount, String lastcook, String tags, String nutritional_info, String notes, String video, String ingredients, String directions, String created) {
        this.name = name;
        this.servings = servings;
        this.source = source;
        this.rating = rating;
        this.image = image;
        this.on_favorites = on_favorites;
        this.favorite = favorite;
        this.prep_time = prep_time;
        this.cook_time = cook_time;
        this.other_time = other_time;
        this.images = images;
        this.cookcount = cookcount;
        this.lastcook = lastcook;
        this.tags = tags;
        this.nutritional_info = nutritional_info;
        this.notes = notes;
        this.video = video;
        this.ingredients = ingredients;
        this.directions = directions;
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServings() {
        return servings;
    }

    public void setServings(String servings) {
        this.servings = servings;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getOn_favorites() {
        return on_favorites;
    }

    public void setOn_favorites(String on_favorites) {
        this.on_favorites = on_favorites;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public String getPrep_time() {
        return prep_time;
    }

    public void setPrep_time(String prep_time) {
        this.prep_time = prep_time;
    }

    public String getCook_time() {
        return cook_time;
    }

    public void setCook_time(String cook_time) {
        this.cook_time = cook_time;
    }

    public String getOther_time() {
        return other_time;
    }

    public void setOther_time(String other_time) {
        this.other_time = other_time;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getCookcount() {
        return cookcount;
    }

    public void setCookcount(String cookcount) {
        this.cookcount = cookcount;
    }

    public String getLastcook() {
        return lastcook;
    }

    public void setLastcook(String lastcook) {
        this.lastcook = lastcook;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getNutritional_info() {
        return nutritional_info;
    }

    public void setNutritional_info(String nutritional_info) {
        this.nutritional_info = nutritional_info;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}