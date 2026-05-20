public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return this.dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return this.mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return this.ano;
    }

    @Override
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    public boolean verificaAnoBissexto() {
        int a = this.ano;
        return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
    }
}
