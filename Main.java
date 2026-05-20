public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua A", "CidadeX", "EstadoY", "PaisZ", "00000-000", "1", "");
        Data fundacao = new Data(1, 1, 2000);

        Shopping shopping = new Shopping("MeuShopping", endereco, 10);

        Informatica inf = new Informatica("InfoShop", 5, 2000.0, endereco, fundacao, 150.0, 10);
        Alimentacao ali = new Alimentacao("FoodShop", 8, 1500.0, endereco, fundacao, new Data(1,1,2025), 10);

        shopping.insereLoja(inf);
        shopping.insereLoja(ali);

        System.out.println("Shopping criado: " + shopping.getNome());
        System.out.println("Quantidade de lojas do tipo Informatica: " + shopping.quantidadeLojasPorTipo("Informatica"));
        Informatica maisCaro = shopping.lojaSeguroMaisCaro();
        System.out.println("Loja de Informatica com maior seguro: " + (maisCaro == null ? "nenhuma" : maisCaro.getNome()));
    }
}
