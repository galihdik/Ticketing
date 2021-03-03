package com.lawencon.tiket.model;

/**
 *
 * @author Galih Dika
 *
 */

public class History {
	private String noTransaksi;
	private String jenis;
	private String tanggalKeberangkatan;
	private int totalHarga;
	private int bangku;

	public String getNoTransaksi() {
		return noTransaksi;
	}

	public void setNoTransaksi(String noTransaksi) {
		this.noTransaksi = noTransaksi;
	}

	public String getJenis() {
		return jenis;
	}

	public void setJenis(String jenis) {
		this.jenis = jenis;
	}

	public String getTanggalKeberangkatan() {
		return tanggalKeberangkatan;
	}

	public void setTanggalKeberangkatan(String tanggalKeberangkatan) {
		this.tanggalKeberangkatan = tanggalKeberangkatan;
	}

	public int getTotalHarga() {
		return totalHarga;
	}

	public void setTotalHarga(int totalHarga) {
		this.totalHarga = totalHarga;
	}

	public int getBangku() {
		return bangku;
	}

	public void setBangku(int bangku) {
		this.bangku = bangku;
	}
}
