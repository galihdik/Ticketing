package com.lawencon.tiket.constant;

/**
 *
 * @author Galih Dika
 *
 */

public enum Transport {
	BUS("Bus", 10000), KERETA("Kereta", 15000), PESAWAT("Pesawat", 20000);

	private String nama;
	private int harga;

	Transport(String nama, int harga) {
		this.nama = nama;
		this.harga = harga;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}
}
