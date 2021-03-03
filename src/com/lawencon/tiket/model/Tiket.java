package com.lawencon.tiket.model;

/**
 *
 * @author Galih Dika
 *
 */

public class Tiket {
	private String nama;
	private Long noKtp;
	private String tanggalKeberangkatan;
	private int totalHarga;

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Long getNoKtp() {
		return noKtp;
	}

	public void setNoKtp(Long noKtp) {
		this.noKtp = noKtp;
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
}
