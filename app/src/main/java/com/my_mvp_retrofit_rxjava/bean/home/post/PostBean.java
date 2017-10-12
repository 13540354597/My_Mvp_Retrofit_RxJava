package com.my_mvp_retrofit_rxjava.bean.home.post;

import java.util.List;

/**
 * Created by TR 105 on 2017/2/15.
 * Email:1241577948@qq.com
 */
public class PostBean {
    private int reason;

    private String err;

    private List<Rest> rest;

    public void setReason(int reason) {
        this.reason = reason;
    }

    public int getReason() {
        return this.reason;
    }

    public void setErr(String err) {
        this.err = err;
    }

    public String getErr() {
        return this.err;
    }

    public void setRest(List<Rest> rest) {
        this.rest = rest;
    }

    public List<Rest> getRest() {
        return this.rest;
    }

    public class Rest {
        private int id;

        private String title;

        private String content;

        private String imagesUrls;

        private String time;

        private int userID;

        private String userName;

        private String userImageUrl;

        private String userEmail;

        private int isGoodNumber;
        private int isLike;

        public int getIsLike() {
            return isLike;
        }

        public void setIsLike(int isLike) {
            this.isLike = isLike;
        }

        private int commentNumber;

        private int postTypeID;

        private int readNumber;

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return this.id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getContent() {
            return this.content;
        }

        public void setImagesUrls(String imagesUrls) {
            this.imagesUrls = imagesUrls;
        }

        public String getImagesUrls() {
            return this.imagesUrls;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTime() {
            return this.time;
        }

        public void setUserID(int userID) {
            this.userID = userID;
        }

        public int getUserID() {
            return this.userID;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserName() {
            return this.userName;
        }

        public void setUserImageUrl(String userImageUrl) {
            this.userImageUrl = userImageUrl;
        }

        public String getUserImageUrl() {
            return this.userImageUrl;
        }

        public void setUserEmail(String userEmail) {
            this.userEmail = userEmail;
        }

        public String getUserEmail() {
            return this.userEmail;
        }

        public void setIsGoodNumber(int isGoodNumber) {
            this.isGoodNumber = isGoodNumber;
        }

        public int getIsGoodNumber() {
            return this.isGoodNumber;
        }

        public void setCommentNumber(int commentNumber) {
            this.commentNumber = commentNumber;
        }

        public int getCommentNumber() {
            return this.commentNumber;
        }

        public void setPostTypeID(int postTypeID) {
            this.postTypeID = postTypeID;
        }

        public int getPostTypeID() {
            return this.postTypeID;
        }

        public void setReadNumber(int readNumber) {
            this.readNumber = readNumber;
        }

        public int getReadNumber() {
            return this.readNumber;
        }

    }
}