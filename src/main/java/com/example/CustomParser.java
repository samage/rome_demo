package com.example;

import org.jdom.Element;

import com.sun.syndication.feed.rss.Item;
import com.sun.syndication.io.WireFeedParser;
import com.sun.syndication.io.impl.DateParser;
import com.sun.syndication.io.impl.RSS20Parser;

public class CustomParser extends RSS20Parser implements WireFeedParser {
	
	public CustomItem parseItem(Element rssRoot, Element eItem) {
        CustomItem customItem = new CustomItem();

        // Standard elements
        Item standardItem = super.parseItem(rssRoot, eItem);
        customItem.setTitle(standardItem.getTitle());
        customItem.setDescription(standardItem.getDescription());

        // Non-standard elements
        Element e = eItem.getChild("customString", getRSSNamespace());
        if (e != null) {
            customItem.setCustomString(e.getText());            
        }
        
        e = eItem.getChild("customDate", getRSSNamespace());
        if (e != null) {
            customItem.setCustomDate(DateParser.parseDate(e.getText()));
        }

        return customItem;
    }
}
