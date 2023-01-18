package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/ders") // ders ile ilgili baslayan web isteklerini buraya yonlendiricez.
public class UniversiteDersApi {

	public static final List<String> DERSLER = new ArrayList<String>();
	{
		DERSLER.add("Arkeoloji");
		DERSLER.add("Tarih");
		DERSLER.add("Felsefe");
	}// elimizde veri olması için kendim veri giriyorum

	/**
	 * GET http://localhost:8080/ders adresinden erisicez
	 * 
	 * @return ders listesini doner
	 */

	@GetMapping("/listele")
	public List<String> listele() {
		return DERSLER;
	}

	/**
	 * POST http://localhost:8080/ekle adresinden erisicez
	 * 
	 * @param dersAd
	 * @return
	 */

	@PostMapping("/ekle") // Ders eklemek icin method olusturuyoruz
	public boolean ekle(@RequestBody String dersAd) {
		DERSLER.add(dersAd);
		return true;
	}

	/**
	 * POST http://localhost:8080/sil adresinden erisicez
	 * 
	 * @param dersAd
	 * @return 
	 * @return
	 */
	
	@PostMapping("/sil")
	public boolean sil(@RequestBody String dersAd) {
		DERSLER.remove(dersAd);
		return true;
	}


}
