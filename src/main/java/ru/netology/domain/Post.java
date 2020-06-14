package ru.netology.domain;

public class Post {
    private int postId;
    private int postData;
    private String postText;
    private String imageUrl;
    private String addPhoto;
    private String addAudio;
    private String addVideo;
    private String addDocument;
    private String addSmile;
    private int numberOfLikes;
    private String postComments;
    private int numberOfComments;
    private String replyToComment;
    private String toComplain;
    private String saveToBookmarks;
    private int numberOfReposts;
    private int numberOfViews;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getPostData() {
        return postData;
    }

    public void setPostData(int postData) {
        this.postData = postData;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAddPhoto() {
        return addPhoto;
    }

    public void setAddPhoto(String addPhoto) {
        this.addPhoto = addPhoto;
    }

    public String getAddAudio() {
        return addAudio;
    }

    public void setAddAudio(String addAudio) {
        this.addAudio = addAudio;
    }

    public String getAddVideo() {
        return addVideo;
    }

    public void setAddVideo(String addVideo) {
        this.addVideo = addVideo;
    }

    public String getAddDocument() {
        return addDocument;
    }

    public void setAddDocument(String addDocument) {
        this.addDocument = addDocument;
    }

    public String getAddSmile() {
        return addSmile;
    }

    public void setAddSmile(String addSmile) {
        this.addSmile = addSmile;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public String getPostComments() {
        return postComments;
    }

    public void setPostComments(String postComments) {
        this.postComments = postComments;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public void setNumberOfComments(int numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    public String getReplyToComment() {
        return replyToComment;
    }

    public void setReplyToComment(String replyToComment) {
        this.replyToComment = replyToComment;
    }

    public String getToComplain() {
        return toComplain;
    }

    public void setToComplain(String toComplain) {
        this.toComplain = toComplain;
    }

    public String getSaveToBookmarks() {
        return saveToBookmarks;
    }

    public void setSaveToBookmarks(String saveToBookmarks) {
        this.saveToBookmarks = saveToBookmarks;
    }

    public int getNumberOfReposts() {
        return numberOfReposts;
    }

    public void setNumberOfReposts(int numberOfReposts) {
        this.numberOfReposts = numberOfReposts;
    }

    public int getNumberOfViews() {
        return numberOfViews;
    }

    public void setNumberOfViews(int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }
}
