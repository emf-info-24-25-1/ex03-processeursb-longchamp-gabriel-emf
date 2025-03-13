package processeur.models;

public class CPU {
    public static final double UNKNOM_MIPS = -1.0;
    private String nom;
    private int annee;
    private long transistors;
    private double mips;

    public CPU(String nom, int annee, long transistors, double mips) {
        this.nom = nom;
        this.annee = annee;
        this.transistors = transistors;
        this.mips = mips;
    }

    public CPU(String nom, long transistors) {
        this(nom,0, transistors, UNKNOM_MIPS);
    }

    public int getAnnee() {
        return annee;
    }

    public String getNom() {
        return nom;
    }

    public double getMips() {
        return mips;
    }

    public long getTransistors() {
        return transistors;
    }
    @Override
    public String toString() {
        return nom + " (" + annee + ") - " + transistors + " transistors, " + (mips != UNKNOM_MIPS ? mips + " MIPS" : "MIPS inconnu");
    }
}
