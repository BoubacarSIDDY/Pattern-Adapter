package com.isi;

import com.isi.adapter.HdmiVgaAdapter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       UniteCentrale uniteCentrale = new UniteCentrale();
       uniteCentrale.setVga(new Ecran());
       uniteCentrale.print("Hello");
       uniteCentrale.setVga(new Projecteur());
       uniteCentrale.print("Hello world !!!");
       uniteCentrale.setVga(new VP());
       uniteCentrale.print("Bonjour");

        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentrale.setVga(hdmiVgaAdapter);
        uniteCentrale.print("Test Convertisseur HDMI VGA");
    }
}