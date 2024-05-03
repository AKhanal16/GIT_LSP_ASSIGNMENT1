package org.howard.edu.lsp.oopfinal.question1;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
class SongsDatabaseTest {


	@Test
	@DisplayName("Test for addSongs")
	public void testAddSong() {
		SongsDatabase database1= new SongsDatabase();
		database1.addSong("Pop","Dangerous");
		assertTrue(database1.getSongs("Pop").contains("Dangerous"));
		
		database1.addSong("Rock","Beautiful Day");
		assertFalse(database1.getSongs("Rock").contains("Counting Stars"));
	}
	
	@Test
	@DisplayName("Test for getSong")
	public void testGetSong() {
		SongsDatabase database1= new SongsDatabase();
		database1.addSong("Pop","Dangerous");
		assertEquals(1, database1.getSongs("Pop").size());
		assertTrue(database1.getSongs("Pop").contains("Dangerous"));
		
		database1.addSong("Rock","Beautiful Day");
		assertFalse(database1.getSongs("Rock").contains("Counting Stars"));
		
		database1.addSong("Pop","Chhori magna jada");
		assertTrue(database1.getSongs("Pop").contains("Chhori magna jada"));
		
		Set<String> Songs = new HashSet<>();
		Songs.add("Dangerous");
		Songs.add("Chhori magna jada");
		
		assertEquals(Songs, database1.getSongs("Pop"));
		
	}
	


	@Test
	@DisplayName("Test for getGenreOfSong")
	public void testGetGenreOfSong() {
		SongsDatabase database1= new SongsDatabase();
		database1.addSong("Pop","Dangerous");
		database1.addSong("Rock","Counting Stars");
		database1.addSong("Pop","Chhori magna jada");
		
		assertEquals("Rock",database1.getGenreOfSong("Counting Stars"));
		assertEquals("Pop",database1.getGenreOfSong("Chhori magna jada"));
		assertEquals("Song not present in SongDatabase",database1.getGenreOfSong("Smooth Criminals"));
		
		
	}

}