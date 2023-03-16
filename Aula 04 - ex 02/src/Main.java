import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa();

        empresa1.cnpj = "566274";
        empresa1.endereco = "São Paulo";

        empresa1.contatos[0] = new Contato();
        empresa1.contatos[0].nome = "Carlos";
        empresa1.contatos[0].email = "carlos@hotmail.com";
        empresa1.contatos[0].telefone = "(11)9 9835-8667";
        empresa1.contatos[0].dataNascimento = "11/12/2001";

        empresa1.contatos[1] = new Contato();
        empresa1.contatos[1].nome = "Maria";
        empresa1.contatos[1].email = "maria@gmail.com";
        empresa1.contatos[1].telefone = "(35)9 9867-3445";
        empresa1.contatos[1].dataNascimento = "23/04/2000";

        empresa1.exibirInfos();
    }
}