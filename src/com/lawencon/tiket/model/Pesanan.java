package com.lawencon.tiket.model;

import java.util.List;

/**
 *
 * @author Galih Dika
 *
 */

public class Pesanan {
	private int bangku;
	private String jenis;
	private List<Tiket> tiket;

	Pesanan(int bangku, String jenis, List<Tiket> tiket) {
		this.bangku = bangku;
		this.jenis = jenis;
		this.tiket = tiket;
	}

	public int getBangku() {
		return bangku;
	}

	public void setBangku(int bangku) {
		this.bangku = bangku;
	}

	public String getJenis() {
		return jenis;
	}

	public void setJenis(String jenis) {
		this.jenis = jenis;
	}

	public List<Tiket> getTiket() {
		return tiket;
	}

	public void setTiket(List<Tiket> tiket) {
		this.tiket = tiket;
	}

}
