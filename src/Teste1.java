public class Teste1 {
    public static void main(String[] args){
        
        //CLASSE 1
        Classe1 c1 = new Classe1();
        c1.saldo = 1000;
        c1.numero = "1001";
        c1.agencia = "1584";
        c1.titular = "Theo";
        
        Classe1 c2 = new Classe1();
        c2.saldo = 1500;
        c2.numero = "1002";
        c2.agencia = "1754";
        c2.titular = "Allan";
        
        Classe1 c3 = new Classe1();
        c3.saldo = 1200;
        c3.numero = "1003";
        c3.agencia = "1964";
        c3.titular = "Hader";
        
        System.out.println("Saldo de c1 "+c1.saldo);
        System.out.println("Nome de c2 "+c2.titular);
        System.out.println("Agencia de c3 "+c3.agencia);
        
        //CLASSE 2
        
        Classe2 f1 = new Classe2();
        f1.filme = "Aquaman";
        f1.genero = "Açao";
        f1.duraçao = "2:30";
       
        
        Classe2 f2 = new Classe2();
        f2.filme = "Hulk";
        f2.genero = "Açao";
        f2.duraçao = "2:00";
        
        
        Classe2 f3 = new Classe2();
        f3.filme = "Anaconda";
        f3.genero = "Ficcçao";
        f3.duraçao = "1:50";
        
        
        System.out.println("Nome de f1 "+f1.filme);
        System.out.println("Genero de f2 "+f2.genero);
        System.out.println("Duraçao de f3 "+f3.duraçao);
        
        //CLASSE 3
        
        Classe3 p1 = new Classe3();
        p1.nome = "Edmilson";
        p1.CPF = "14785693703";
        p1.idade = 25;
       
        
        Classe3 p2 = new Classe3();
        p2.nome = "Matheus";
        p2.CPF = "87542369985";
        p2.idade = 21;
        
        Classe3 p3 = new Classe3();
        p3.nome = "Rodrigo";
        p3.CPF = "69874521325";
        p3.idade = 38;
        
        
        System.out.println("Nome de p1 "+p1.nome);
        System.out.println("CPF de p2 "+p2.CPF);
        System.out.println("Idade de f3 "+p3.idade);
    }
}
