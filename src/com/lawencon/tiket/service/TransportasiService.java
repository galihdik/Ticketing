package com.lawencon.tiket.service;

import java.util.List;

import com.lawencon.tiket.model.History;

/**
 *
 * @author Galih Dika
 *
 */

public interface TransportasiService {

	void cekValidasiKtp(long ktp) throws Exception;

	void cekValidasiKursi(int tanggal) throws Exception;

	void tempatDuduk() throws Exception;

	void cekValidasiTanggal(String tgl) throws Exception;

	void getTiket(String nama, String tanggalBerangkat, Long ktp, byte pilihTiket) throws Exception;

	void getHistory(List<History> historyList, String tanggalBerangkat, byte pilihTiket) throws Exception;

	void cetakTiket() throws Exception;

}
