package com.company;

public class Subjects implements Riazi1,Riazi2,Fizik1,Fizik2,Mabani,AdvanceCoding {
    @Override
    public void introR1() {
        System.out.println("Riazi1\ntedad vahed:"+Riazi1.vahed+"\npishniaz:"+Riazi1.pishniaz);
    }
    @Override
    public void introR2() {
        System.out.println("Riazi2\ntedad vahed:"+Riazi2.vahed+"\npishniaz:"+Riazi2.pishniaz);
    }
    @Override
    public void introF1() {
        System.out.println("Fizik1\ntedad vahed:"+Fizik1.vahed+"\npishniaz:"+Fizik1.pishniaz);
    }
    @Override
    public void introF2() {
        System.out.println("Fizik2\ntedad vahed:"+Fizik2.vahed+"\npishniaz:"+Fizik2.pishniaz);
    }

    @Override
    public void introM() {
        System.out.println("Mabani computer\ntedad vahed:"+Mabani.vahed+"\npishniaz:"+Mabani.pishniaz);
    }
    @Override
    public void introAdv() {
        System.out.println("Barname Nevisi Pishrafte\ntedad vahed:"+AdvanceCoding.vahed+"\npishniaz:"+AdvanceCoding.pishniaz);
    }
}
