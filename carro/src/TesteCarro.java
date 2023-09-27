public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.ConsumoCombustivel = 0.2 ;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        //System.out.println("A capacidade de passageiros é = "+van.numPassageiros);
        //System.out.println("A capacidade de combustivel é = "+van.capCombustivel);
        //System.out.println("O consumo de combustivel por litro é = "+van.capCombustivel);

        Carro Fusca = new Carro();
        Fusca.marca = "Volkswagen";
        Fusca.modelo = "Fusca";
        Fusca.numPassageiros = 4;
        Fusca.capCombustivel = 30;
        Fusca.ConsumoCombustivel = 0.15 ;

        System.out.println(Fusca.marca);
        System.out.println(Fusca.modelo);
        System.out.println("A capacidade de passageiros é = "+Fusca.numPassageiros);
        System.out.println("A capacidade de combustivel é = "+Fusca.capCombustivel);
        System.out.println("O consumo de combustivel por litro é = "+Fusca.capCombustivel);




    }
}
