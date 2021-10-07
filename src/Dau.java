public class Dau {
    private int numeroDado;

    public int getNumeroDado() {
        return numeroDado;
    }

    public void setNumeroDado(int numeroDado) {
        this.numeroDado = numeroDado;
    }

    public Dau(int numeroDado) {
        this.numeroDado = numeroDado;
    }

    @Override
    public String toString() {
        return "NumeroDado=" + numeroDado + " ";
    }
}