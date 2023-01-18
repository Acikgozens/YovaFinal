package com.example.demo;

import java.util.List;

import org.junit.Test;

public class UniversiteDersApiTest {
	
	@Test
	public void testListele() {
		List<String> DERSLER = UniversiteDersApi.DERSLER;
		System.out.println(DERSLER);
		return;
	}

	@Test
	public void testEkle() {
		List<String> DERSLER = UniversiteDersApi.DERSLER;
		DERSLER.add("Sanat");
		return;
	
	}

	@Test
	public void testSil() {
		List<String> DERSLER = UniversiteDersApi.DERSLER;
		DERSLER.remove("Sanat");
		return;
	}

}
