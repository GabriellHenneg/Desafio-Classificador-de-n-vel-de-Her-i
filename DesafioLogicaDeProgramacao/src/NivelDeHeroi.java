import java.util.Scanner;

public class NivelDeHeroi {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o nome do seu herói");
        String nome = leitor.next();

        System.out.println("Informe o nivel do seu herói");
        int xpHeroi = leitor.nextInt();

        String nivelHeroi = "";

        if(xpHeroi < 1000){
            nivelHeroi = "Ferro";
        } else if ( xpHeroi >= 1000 && xpHeroi < 2000) {
            nivelHeroi = "Bronze";
        }else if ( xpHeroi >= 2000 && xpHeroi < 5000) {
            nivelHeroi = "Prata";
        }else if ( xpHeroi >= 5000 && xpHeroi < 7000) {
            nivelHeroi = "Ouro";
        }else if ( xpHeroi >= 7000 && xpHeroi < 8000) {
            nivelHeroi = "Platina";
        }else if ( xpHeroi >= 8000 && xpHeroi < 9000) {
            nivelHeroi = "Ascendente";
        }else if ( xpHeroi >= 9000 && xpHeroi < 10000) {
            nivelHeroi = "Imortal";
        }else if ( xpHeroi > 10000) {
            nivelHeroi = "Radiante";
        }
        System.out.println("O Herói de nome " + nome + " está no nivel de " + nivelHeroi);
    }
}
