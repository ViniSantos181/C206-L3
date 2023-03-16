public class Main {
    public static void main(String[] args) {
        Restaurante restaurante1 = new Restaurante();

        restaurante1.cnpj = "163478";
        restaurante1.endereco = "Santa Rita do Sapucaí";
        restaurante1.nome = "Toca da raposa";

        restaurante1.fornecedores[0] = new Fornecedor();
        restaurante1.fornecedores[0].tipo = "Arroz";
        restaurante1.fornecedores[0].quantidade = 20;

        restaurante1.fornecedores[1] = new Fornecedor();
        restaurante1.fornecedores[1].tipo = "Feijão";
        restaurante1.fornecedores[1].quantidade = 10;

        restaurante1.fornecedores[2] = new Fornecedor();
        restaurante1.fornecedores[2].tipo = "Carne";
        restaurante1.fornecedores[2].quantidade = 5;

        restaurante1.exibirInfos();
    }
}