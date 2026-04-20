package com.codingkiddo.javalibrariesdata.caffine;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;

public class CaffeineUnitTest {

	@Test
    public void givenCache_whenPopulate_thenValueStored() {
		
		Cache<String, DataObject> cache = 
				Caffeine.newBuilder().expireAfterWrite(1, TimeUnit.MINUTES).maximumSize(100).build();
		
	}
}
