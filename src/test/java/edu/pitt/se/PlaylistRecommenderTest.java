package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class PlaylistRecommenderTest {

	private PlaylistRecommender recommender = new PlaylistRecommender();
	
    @Test
    public void placeholder() {
        assertTrue(true);
    }
	
	// For 1st method
	@Test
    void testClassifyEnergyHigh() {
		assertEquals("HIGH", recommender.classifyEnergy(Arrays.asList(150, 160, 140)));
    }
	
	@Test
    void testClassifyEnergyNullThrows() {
        assertThrows(IllegalArgumentException.class, () -> recommender.classifyEnergy(null));
    }
	
	//for 2nd method
	@Test
    void testInvalidTitleWithNumbers() {
        assertFalse(recommender.isValidTrackTitle("im not surprised28"));
    }
	
	@Test
    void testInvalidTitleNull() {
        assertFalse(recommender.isValidTrackTitle(null));
    }
	
	//for 3rd method
	@Test
    void testNormalizeVolumeTooHigh() {
        assertEquals(100, recommender.normalizeVolume(120));
    }
	
}
