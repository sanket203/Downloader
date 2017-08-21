package com.test.downloadertest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.test.downloadutils.Downloader;

public class DownloaderTest {
	
	@Test()
	    public void startDownloadNullTest(){
	        Downloader downloader = new Downloader();
	        assertNotNull(downloader.startDownlaod(null,null));
	        
	    }
	 
	 @Test()
	    public void startDownloadTest(){
	        Downloader downloader = new Downloader();
	       downloader.startDownlaod("http://www.colorado.edu/conflict/peace/download/peace_essay.ZIP","D:\\docs");
	    }
	 
	 @Test()
	    public void testUrlValid(){
	        Downloader downloader = new Downloader();
	        String url = "http://www.colorado.edu/conflict/peace/download/peace_essay.ZIP";
	        
	      assertTrue(downloader.verifyURL(url));
	    }
	 @Test()
	    public void testUrlInValidForHttp(){
	        Downloader downloader = new Downloader();
	        String url = "https://ww.colorado.edu/conflict/peace/download/peace_essay.ZIP";
	        
	      assertFalse(downloader.verifyURL(url));
	    }
	 
	 
	 
	 
	 
	 
	 

}
