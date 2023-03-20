package one.digitalinnovation;

public class No {

    private int Dado;
    private No RefNo;

    public No() {
    }

    public No(int dado) {
        this.Dado = dado;
    }

    public int getDado() {
        return Dado;
    }

    public void setDado(int dado) {
        Dado = dado;
    }

    public No getRefNo() {
        return RefNo;
    }

    public void setRefNo(No refNo) {
        this.RefNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "Dado=" + Dado +
                '}';
    }
}
