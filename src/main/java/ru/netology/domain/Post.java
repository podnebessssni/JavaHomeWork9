package ru.netology.domain;

public class Post {
    public String ownerTitleUrl;
    private String imageUrl;
    private int view;
    private UserAction useraction;
    private Comments comments;
    private int id;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getOwnerTitleUrl() {
        return ownerTitleUrl;
    }

    public void setOwnerTitleUrl(String ownerTitleUrl) {
        this.ownerTitleUrl = ownerTitleUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }


    public UserAction getUseraction() {
        return useraction;
    }

    public void setUseraction(UserAction useraction) {
        this.useraction = useraction;
    }

    public Comments getComments() {
        return comments;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }


}
