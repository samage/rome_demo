package com.example;

import java.io.File;
import java.util.List;

import com.sun.syndication.feed.synd.SyndEntryImpl;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws Exception{
      
        
        SyndFeedInput input = new SyndFeedInput();
        SyndFeed feed = input.build(new XmlReader(new File("./demo_rss.xml")));
        List<SyndEntryImpl> entrys =  feed.getEntries();
            for(SyndEntryImpl entry:entrys ){
                System.out.println( entry.getForeignMarkup() ); 
            }       
        
    }
}
