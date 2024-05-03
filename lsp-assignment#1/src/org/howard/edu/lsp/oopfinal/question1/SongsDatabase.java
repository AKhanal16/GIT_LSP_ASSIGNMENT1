package org.howard.edu.lsp.oopfinal.question1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SongsDatabase {
	/* Key is the genre, HashSet contains associated songs */
    		private Map<String, HashSet<String>> map = 
    				new HashMap<String, HashSet<String>>();

    		/* Add a song title to a genre */
    		public void addSong(String genre, String songTitle) {
	    		Set<String> set = getSongs(genre);
	    		if (set==null) {
	    			set=new HashSet<>();
	    			map.put(genre, (HashSet<String>) set);
	    		}
	    		map.get(genre).add(songTitle);   
    		}
    
    		/* Return the Set that contains all songs for a genre */
	 		public Set<String> getSongs(String genre) {
	        	// Code it!!
				return map.get(genre);
	    	}
	 		

    		/* Return genre, i.e., jazz, given a song title */
    		public String getGenreOfSong(String songTitle) {
        			// Code it!!
        		for (Entry<String, HashSet<String>> entry : map.entrySet()) {
        		    if (entry.getValue().contains(songTitle)) {
        		    	return entry.getKey();
        		    }
        		}
    			return ("Song not present in SongDatabase");

        	} 		
}

