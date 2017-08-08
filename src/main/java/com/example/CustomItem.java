package com.example;

import java.util.Date;

import com.sun.syndication.feed.rss.Item;

public class CustomItem extends Item {
	private String _customString;
    private Date _customDate;

    public String getCustomString() {
        return _customString;
    }

    public void setCustomString(String customString) {
        _customString = customString;
    }

    public Date getCustomDate() {
        return _customDate;
    }

    public void setCustomDate(Date customDate) {
        _customDate = customDate;
    }

}
