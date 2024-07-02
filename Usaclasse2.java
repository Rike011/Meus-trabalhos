public class Usaclasse2{
    public static void main(String[] args) {
     Carro c;
    c= new Carro();
    

    c.marca ="Fiat";
    c.modelo ="Uno";
    c.ano = 2010;
    c.km = 45000;
    c.preco = 57000;
    c.anoAtual= 2024;
    c.anoFabricacao = 2015;
    c.anoCompra = 2024;
    c.anoAtualizacao = 2023;
    c.anoVenda= 2022;

    System.out.println("Marca:"  + c.marca);
    System.out.println("Modelo:"  + c.modelo);
    System.out.println("Ano:"  + c.ano);
    System.out.println("Km:"  + c.km);
    System.out.println("Preço:"  + c.preco);
    System.out.println("Ano atual:"  + c.anoAtual);
    System.out.println("Ano de fabricação:"  + c.anoFabricacao);
    System.out.println("Ano de compra:"  + c.anoCompra);
    System.out.println("Ano de atualização:"  + c.anoAtualizacao);
    System.out.println("Ano de venda:"  + c.anoVenda);
    
    

}
}


