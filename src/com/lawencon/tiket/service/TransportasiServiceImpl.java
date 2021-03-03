package com.lawencon.tiket.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import com.lawencon.tiket.constant.Transport;
import com.lawencon.tiket.model.History;
import com.lawencon.tiket.model.Tiket;

/**
 *
 * @author Galih Dika
 *
 */

public class TransportasiServiceImpl implements TransportasiService {
	private List<Tiket> tiket = new ArrayList<Tiket>();
//	private ;
	private int totalHarga = 0;

	@Override
	public void cekValidasiKtp(long ktp) throws Exception {
		if (ktp < 1 || ktp > 999999999) {
			throw new Exception("Maksimal inputan 9 digit !");
		}
	}

	@Override
	public void cekValidasiKursi(int kursi) throws Exception {
		boolean kursiAda = false;
		if (kursi < 1 || kursi > 20) {
//			for (int i = 0; i < kendaraan.g; i++) {
//				
//			}
			throw new Exception("Kursi hanya 1-20");
		}

	}

	@Override
	public void tempatDuduk() throws Exception {
		int number = 0;
		int[][] kursi = new int[11][3];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 2; j++) {
				number++;
				kursi[i][j] = number;
				System.out.print(kursi[i][j] + " ");
			}
			System.out.println();
		}
		throw new Exception("KURSI EROR");
	}

	@Override
	public void getTiket(String nama, String tanggalBerangkat, Long ktp, byte pilihTiket) throws Exception {
		if (pilihTiket == 1) {
			totalHarga = Transport.BUS.getHarga();
		} else if (pilihTiket == 2) {
			totalHarga = Transport.KERETA.getHarga();
		} else if (pilihTiket == 3) {
			totalHarga = Transport.PESAWAT.getHarga();
		}
		Tiket tampungTiket = new Tiket();
		tampungTiket.setNama(nama);
		tampungTiket.setTanggalKeberangkatan(tanggalBerangkat);
		tampungTiket.setNoKtp(ktp);
		tampungTiket.setTotalHarga(totalHarga);
		tiket.add(tampungTiket);
		throw new Exception("Tiket EROR");
	}

	@Override
	public void getHistory(List<History> historyList, String tanggalBerangkat, byte pilihTiket) throws Exception {
		History history = new History();
		if (pilihTiket == 1) {
			history.setJenis(Transport.BUS.getNama());
			history.setNoTransaksi("TRXBUS" + (historyList.size() + 1));
		} else if (pilihTiket == 2) {
			history.setJenis(Transport.KERETA.getNama());
			history.setNoTransaksi("TRXKRT" + (historyList.size() + 1));
		} else if (pilihTiket == 3) {
			history.setJenis(Transport.PESAWAT.getNama());
			history.setNoTransaksi("TRXPSWT" + (historyList.size() + 1));
		}
		history.setTotalHarga(totalHarga);
		history.setTanggalKeberangkatan(tanggalBerangkat);
		historyList.add(history);
//		String abc = "Apri";
//		abc.
	}

	@Override
	public void cekValidasiTanggal(String tgl) throws Exception {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		LocalDateTime dateTime = LocalDateTime.parse(tgl, format);
		String formattedDate = dateTime.format(format);
		LocalDateTime dateTimeNow = LocalDateTime.now();
		long daysBetween = ChronoUnit.DAYS.between(dateTimeNow, dateTime);
		if (daysBetween < 7 || dateTime.isBefore(dateTimeNow)) {
			throw new Exception("tanggal mulai dari h+7 gabisa tanggal sekarang");
		}
		System.out.println("Tanggal keberangkatan : " + dateTime);

	}

	@Override
	public void cetakTiket() throws Exception {
		// TODO Auto-generated method stub

	}
}
