package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.sun.syndication.feed.rss.Item;
import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.impl.ConverterForRSS20;

public class CustomConverter extends ConverterForRSS20 {
	
	protected SyndEntry createSyndEntry(Item item) {
        List<HashMap<String,String>> temp = new ArrayList<HashMap<String,String>>();  
        SyndEntry syndEntry = super.createSyndEntry(item);
        CustomItem customItem = (CustomItem)item;         

        List<Object> customList = new ArrayList<Object>();
        customList.add( customItem.getCustomString() );
        customList.add( customItem.getCustomDate() );
        //set to empty attribute ex foreignmarkup
        syndEntry.setForeignMarkup( customList );

        return syndEntry;
    }   
}
