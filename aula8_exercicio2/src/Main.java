import ex2.Fogao;
import ex2.Geladeira;

public class Main {
    public static void main(String[] args) {

        Geladeira geladeira = new Geladeira();
        geladeira.setCodigo(2376);
        geladeira.setDescricao("Geladeira");
        geladeira.setTamanho(4);
        geladeira.setQuantidadePortas(1);
        geladeira.setTipo("FrostFree");
        geladeira.setFabricante("Brastemp");
        geladeira.setValor(1700);

        Fogao fogao = new Fogao();
        fogao.setDescricao("Fogao");
        fogao.setQuantidadeBocas(5);
        fogao.setCodigo(7864);
        fogao.setFabricante("Mueller");
        fogao.setValor(700);
        fogao.setTipoAcendimento("gas");
    }

}