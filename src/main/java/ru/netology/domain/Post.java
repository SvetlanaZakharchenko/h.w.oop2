package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private String postType;
    private String copy;
    private String reply;
    private String postpone;
    private String suggest;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private int isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private int postponedId;

    private CommentsInfo commentsInfo;
    private CopyRight copyRight;
    private Geo geo;
    private LikesInfo likesInfo;
    private Picture picture;
    private RepostsInfo repostsInfo;
    private Topic topic;
    private ViewsInfo viewsInfo;


    //getter+setter;
}
