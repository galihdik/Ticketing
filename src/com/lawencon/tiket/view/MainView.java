package com.lawencon.tiket.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lawencon.tiket.model.History;

/**
 *
 * @author Galih Dika
 *
 */

public class MainView {
	private List<History> listHistory = new ArrayList<History>();

	public void show() {
		byte menu = 0;
		System.out.println("============ WELCOME TO TIKETKU ==================");
		System.out.println("1. Beli Tiket");
		System.out.println("2. History");
		System.out.println("3. Keluar");
		Scanner input = new Scanner(System.in);
		System.out.println("Pilih menu : ");
		menu = input.nextByte();
		if (menu == 1) {
			new TransportasiView().show(listHistory, (val) -> {
				show();
			});
		} else if (menu == 2) {
			int totalSize = listHistory.size();
			System.out.println("======== Details History =====");
			System.out.println("No. " + " No Transaksi " + "\tJenis " + "\t\tTotal Harga");
			for (int i = 0; i < totalSize; i++) {
				History hs = listHistory.get(i);

				System.out.println(
						(i + 1) + "\t" + hs.getNoTransaksi() + "\t\t" + hs.getJenis() + "\t  " + hs.getTotalHarga());
			}
			show();
		} else if (menu == 3) {
			System.out.println("Terima kasih telah menggunakan program ini");
		} else {
			System.out.println("Menu tidak ada ! ");
		}
	}
}