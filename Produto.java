public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = null;
    }

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Data getDataValidade() {
        return this.dataValidade;
    }

    @Override
    public String toString() {
        return (this.nome == null ? "" : this.nome) + " - " + this.preco + (this.dataValidade == null ? "" : (" - " + this.dataValidade.toString()));
    }

    public boolean estaVencido(Data data) {
        if (this.dataValidade == null || data == null) {
            return false;
        }
        if (data.getAno() > this.dataValidade.getAno()) {
            return true;
        } else if (data.getAno() < this.dataValidade.getAno()) {
            return false;
        }
        if (data.getMes() > this.dataValidade.getMes()) {
            return true;
        } else if (data.getMes() < this.dataValidade.getMes()) {
            return false;
        }
        if (data.getDia() > this.dataValidade.getDia()) {
            return true;
        }
        return false;
    }
}
