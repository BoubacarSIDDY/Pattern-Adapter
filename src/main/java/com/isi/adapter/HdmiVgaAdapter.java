package com.isi.adapter;

import com.isi.Hdmi;
import com.isi.Vga;

public class HdmiVgaAdapter implements Vga {

    private Hdmi hdmi;

    @Override
    public void print(String message) {
        byte[] data = message.getBytes();
        System.out.println("+++++++++ Adapter+++++++++");
        hdmi.view(data);
        System.out.println("+++++++++ Adapter+++++++++");
    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
