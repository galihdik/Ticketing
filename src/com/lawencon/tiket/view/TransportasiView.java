package com.lawencon.tiket.view;

import java.util.List;
import java.util.Scanner;

import com.lawencon.tiket.constant.Transport;
import com.lawencon.tiket.model.History;
import com.lawencon.tiket.model.Pesanan;
import com.lawencon.tiket.service.TransportasiServiceImpl;
import com.lawencon.tiket.util.CallBack;

/**
 *
 * @author Galih Dika
 *
 */

public class TransportasiView {
	private Scanner input = new Scanner(System.in);
	private Scanner input2 = new Scanner(System.in);
	private TransportasiServiceImpl serviceImpl = new TransportasiServiceImpl();
	private List<Pesanan> pesan;

	void show(List<History> historyList, CallBack cb) {
		System.out.println("Ingin membeli tiket apa ");
		System.out.println("1. Bus ");
		System.out.println("2. Kereta ");
		System.out.println("3. Pesawat ");
		System.out.println("Pilih tiket : ");
		byte pilihTiket = input.nextByte();
		// input.next();
		System.out.println("Masukan nama anda : ");
		String nama = input2.nextLine();
		int kursi = 0;
		long ktp = 0;
		try {
			System.out.println("Masukan Nomer KTP anda : ");
			ktp = input.nextLong();
			serviceImpl.cekValidasiKtp(ktp);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			ktp = input.nextLong();
		}
		System.out.println("Masukan tanggal keberangkatan ");
		System.out.println("Format [01-02-2000 19:00]");
		String tanggalBerangkat = input2.nextLine();
		try {
			serviceImpl.cekValidasiTanggal(tanggalBerangkat);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tanggalBerangkat = input2.nextLine();
		}

		if (pilihTiket == 1) {
			System.out.println("Tempat duduk : ");
			try {
				serviceImpl.tempatDuduk();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				System.out.println("Silahkan pilih kursi : ");
				kursi = input.nextInt();
				serviceImpl.cekValidasiKursi(kursi);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				kursi = input.nextInt();
			}
			System.out.println("Anda memilih :" + Transport.BUS.getNama());
			System.out.println("Harganya : " + Transport.BUS.getHarga());
			try {
				serviceImpl.getTiket(nama, tanggalBerangkat, ktp, pilihTiket);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Data berhasil di input");
			try {
				serviceImpl.getHistory(historyList, tanggalBerangkat, pilihTiket);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			// pesan.add(kursi, Transport.BUS.getNama(), historyList);
			System.out.println("Data berhasil masuk History");
			System.out.println("======= Cetak TIKET ===== ");
			System.out.println("Nama Pemesanan : " + nama);
			System.out.println("No. Ktp : " + ktp);
			System.out.println("Jenis Transportasi : " + Transport.BUS.getNama());
			System.out.println("Bangku : " + kursi);
			System.out.println("Harga Tiket : " + Transport.BUS.getHarga());
			System.out.println("Tanggal Pemesanan : " + tanggalBerangkat);
			cb.onDone("");
		} else if (pilihTiket == 2) {
			System.out.println("Tempat duduk : ");
			try {
				serviceImpl.tempatDuduk();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				System.out.println("Silahkan pilih kursi : ");
				kursi = input.nextInt();
				serviceImpl.cekValidasiKursi(kursi);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				kursi = input.nextInt();
			}
			System.out.println("Anda memilih :" + Transport.KERETA.getNama());
			System.out.println("Harganya : " + Transport.KERETA.getHarga());
			try {
				serviceImpl.getTiket(nama, tanggalBerangkat, ktp, pilihTiket);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Data berhasil di input");
			try {
				serviceImpl.getHistory(historyList, tanggalBerangkat, pilihTiket);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Data berhasil masuk History");
			System.out.println("======= Cetak TIKET ===== ");
			System.out.println("Nama Pemesanan : " + nama);
			System.out.println("No. Ktp : " + ktp);
			System.out.println("Jenis Transportasi : " + Transport.KERETA.getNama());
			System.out.println("Bangku : " + kursi);
			System.out.println("Harga Tiket : " + Transport.KERETA.getHarga());
			System.out.println("Tanggal Pemesanan : " + tanggalBerangkat);
			cb.onDone("otw balik");
		} else if (pilihTiket == 3) {
			System.out.println("Tempat duduk : ");
			try {
				serviceImpl.tempatDuduk();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				System.out.println("Silahkan pilih kursi : ");
				kursi = input.nextInt();
				serviceImpl.cekValidasiKursi(kursi);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				kursi = input.nextInt();
			}
			System.out.println("Anda memilih :" + Transport.PESAWAT.getNama());
			System.out.println("Harganya : " + Transport.PESAWAT.getHarga());
			try {
				serviceImpl.getTiket(nama, tanggalBerangkat, ktp, pilihTiket);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				serviceImpl.getHistory(historyList, tanggalBerangkat, pilihTiket);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Data berhasil masuk History");
			System.out.println("======= Cetak TIKET ===== ");
			System.out.println("Nama Pemesanan : " + nama);
			System.out.println("No. Ktp : " + ktp);
			System.out.println("Jenis Transportasi : " + Transport.PESAWAT.getNama());
			System.out.println("Bangku : " + kursi);
			System.out.println("Harga Tiket : " + Transport.PESAWAT.getHarga());
			System.out.println("Tanggal Pemesanan : " + tanggalBerangkat);
			cb.onDone("otw balik");
		}
	}
}
