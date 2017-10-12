package com.my_mvp_retrofit_rxjava.bean.home.tips;

import java.util.List;

/**
 * Created by TR 105 on 2017/5/16.
 * Email:1241577948@qq.com
 */

public class PushArticleInfo {

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

        private String imageUrls;

        private String introduction;

        private String coverImage;

        private String time;

        private int type;

        private String typeName;

        private String htmlUrl;

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

        public void setImageUrls(String imageUrls) {
            this.imageUrls = imageUrls;
        }

        public String getImageUrls() {
            return this.imageUrls;
        }

        public void setIntroduction(String introduction) {
            this.introduction = introduction;
        }

        public String getIntroduction() {
            return this.introduction;
        }

        public void setCoverImage(String coverImage) {
            this.coverImage = coverImage;
        }

        public String getCoverImage() {
            return this.coverImage;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTime() {
            return this.time;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getType() {
            return this.type;
        }

        public void setTypeName(String typeName) {
            this.typeName = typeName;
        }

        public String getTypeName() {
            return this.typeName;
        }

        public void setHtmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
        }

        public String getHtmlUrl() {
            return this.htmlUrl;
        }

    }
}
