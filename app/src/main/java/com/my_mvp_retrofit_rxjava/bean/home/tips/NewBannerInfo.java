package com.my_mvp_retrofit_rxjava.bean.home.tips;

import java.util.List;

/**
 * Created by TR 105 on 2017/5/16.
 * Email:1241577948@qq.com
 */

public class NewBannerInfo {

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
        private int ID;

        private String Title;

        private String ActionUrl;

        private int ActionTypeID;

        private String LanguageCode;

        private String ImageUrl;

        public void setID(int ID) {
            this.ID = ID;
        }

        public int getID() {
            return this.ID;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public String getTitle() {
            return this.Title;
        }

        public void setActionUrl(String ActionUrl) {
            this.ActionUrl = ActionUrl;
        }

        public String getActionUrl() {
            return this.ActionUrl;
        }

        public void setActionTypeID(int ActionTypeID) {
            this.ActionTypeID = ActionTypeID;
        }

        public int getActionTypeID() {
            return this.ActionTypeID;
        }

        public void setLanguageCode(String LanguageCode) {
            this.LanguageCode = LanguageCode;
        }

        public String getLanguageCode() {
            return this.LanguageCode;
        }

        public void setImageUrl(String ImageUrl) {
            this.ImageUrl = ImageUrl;
        }

        public String getImageUrl() {
            return this.ImageUrl;
        }
    }
}
