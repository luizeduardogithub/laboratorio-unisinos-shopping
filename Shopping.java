import java.text.Normalizer;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int capacidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[capacidadeLojas];
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public Loja[] getLojas() {
        return this.lojas;
    }

    public boolean insereLoja(Loja loja) {
        if (loja == null) return false;
        for (int i = 0; i < this.lojas.length; i++) {
            if (this.lojas[i] == null) {
                this.lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        if (nomeLoja == null) return false;
        for (int i = 0; i < this.lojas.length; i++) {
            if (this.lojas[i] != null && this.lojas[i].getNome().equals(nomeLoja)) {
                this.lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    private String normalize(String s) {
        if (s == null) return null;
        String n = Normalizer.normalize(s, Normalizer.Form.NFD);
        n = n.replaceAll("\\p{M}", "");
        return n.toLowerCase();
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        if (tipoLoja == null) return 0;
        String alvo = normalize(tipoLoja);
        int count = 0;
        for (int i = 0; i < this.lojas.length; i++) {
            Loja l = this.lojas[i];
            if (l == null) continue;
            String tipoClasse = normalize(l.getClass().getSimpleName());
            if (tipoClasse.equals(alvo)) count++;
        }
        return count;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica mais = null;
        for (int i = 0; i < this.lojas.length; i++) {
            Loja l = this.lojas[i];
            if (l == null) continue;
            if (l instanceof Informatica) {
                Informatica inf = (Informatica) l;
                if (mais == null || inf.getSeguroEletronicos() > mais.getSeguroEletronicos()) {
                    mais = inf;
                }
            }
        }
        return mais;
    }
}
