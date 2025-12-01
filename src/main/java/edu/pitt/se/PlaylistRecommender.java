package edu.pitt.se;

import java.util.*;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
		if (bpms == null || bpms.isEmpty()) {
			throw new IllegalArgumentException("List cannot be null or empty");
		}
		
		double avg = bpms.stream().mapToInt(Integer::intValue).average().orElse(0);
		
		if (avg >= 140) {
			return "HIGH";
		} else if (avg >= 100) {
			return "MEDIUM";
		} else {
			return "LOW";
		}
    }

	public boolean isValidTrackTitle(String title) {
		if (title == null) {
			return false;
		}
		if (title.isEmpty() || title.length() > 30) {
			return false;
		}
		for (char c : title.toCharArray()) {
			if (!Character.isLetter(c) && c != ' ') {
				return false;
			}
		}
		return true;
	}

	public int normalizeVolume(int volumeDb) {
		if (volumeDb < 0) {
			return 0;
		} else if (volumeDb > 100) {
			return 100;
		}
		return volumeDb;
	}
}
