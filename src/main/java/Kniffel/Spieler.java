package Kniffel;

public class Spieler {

    private String name;
    private int nummer;
    private int pkt_1er;
    private int pkt_2er;
    private int pkt_3er;
    private int pkt_4er;
    private int pkt_5er;
    private int pkt_6er;
    private int pkt_3er_pash;
    private int pkt_4er_pash;
    private int pkt_fullhouse;
    private int pkt_kleinestr;
    private int pkt_grosstr;
    private int pkt_kniffel;
    private int pkt_chance;


    public Spieler(String name, int nummer) {
        this.name = name;
        this.nummer = nummer;

    }

    public void setPunkte(int pkt_1er, int pkt_2er, int pkt_3er, int pkt_4er, int pkt_5er, int pkt_6er, int pkt_3er_pash, int pkt_4er_pash, int pkt_fullhouse, int pkt_kleinestr, int pkt_grosstr, int pkt_kniffel, int pkt_chance) {
        this.pkt_1er = pkt_1er;
        this.pkt_2er = pkt_2er;
        this.pkt_3er = pkt_3er;
        this.pkt_4er = pkt_4er;
        this.pkt_5er = pkt_5er;
        this.pkt_6er = pkt_6er;
        this.pkt_3er_pash = pkt_3er_pash;
        this.pkt_4er_pash = pkt_4er_pash;
        this.pkt_fullhouse = pkt_fullhouse;
        this.pkt_kleinestr = pkt_kleinestr;
        this.pkt_grosstr = pkt_grosstr;
        this.pkt_kniffel = pkt_kniffel;
        this.pkt_chance = pkt_chance;
    }

    public int getPkt_1er() {
        return pkt_1er;
    }

    public int getPkt_2er() {
        return pkt_2er;
    }

    public int getPkt_3er() {
        return pkt_3er;
    }

    public int getPkt_4er() {
        return pkt_4er;
    }

    public int getPkt_5er() {
        return pkt_5er;
    }

    public int getPkt_6er() {
        return pkt_6er;
    }

    public int getPkt_3er_pash() {
        return pkt_3er_pash;
    }

    public int getPkt_4er_pash() {
        return pkt_4er_pash;
    }

    public int getPkt_fullhouse() {
        return pkt_fullhouse;
    }

    public int getPkt_kleinestr() {
        return pkt_kleinestr;
    }

    public int getPkt_grosstr() {
        return pkt_grosstr;
    }

    public int getPkt_kniffel() {
        return pkt_kniffel;
    }

    public int getPkt_chance() {
        return pkt_chance;
    }
}