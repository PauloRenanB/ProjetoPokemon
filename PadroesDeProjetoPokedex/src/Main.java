import Model.Pokemon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pokemon pokemon = new Pokemon();
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo a Pokedex");
        System.out.println("Digite 0 para ver Charizard, 1 para ver Blastoise e 2 para ver Venusaur.");
        int escolha = sc.nextInt();
        switch (escolha){
            case 0:
                pokemon.setNome("Charizard");
                pokemon.setVida(200);
                pokemon.setAtaque(40);
                pokemon.setDefesa(40);

                System.out.println("POKEDEX");
                System.out.printf("Nome: %s%n", pokemon.getNome());
                System.out.printf("Vida: %d%n", pokemon.getVida());
                System.out.printf("Ataque: %d%n", pokemon.getAtaque());
                System.out.printf("Defesa: %d%n", pokemon.getDefesa()
                );

                System.out.println("*******************");
                System.out.println("Status Mega Evoluido:");
                pokemon.megaEvoluir();
                System.out.printf("Nome: %s%n", pokemon.getNome());
                System.out.printf("Vida: %d%n", pokemon.getVida());
                System.out.printf("Ataque: %d%n", pokemon.getAtaque());
                System.out.printf("Defesa: %d%n", pokemon.getDefesa());
                System.out.printf("Ataque especial: %s%n", pokemon.getAtaqueEspecial());
                break;
            case 1:
                pokemon.setNome("Blastoise");
                pokemon.setVida(250);
                pokemon.setAtaque(25);
                pokemon.setDefesa(50);

                System.out.println("POKEDEX");
                System.out.printf("Nome: %s%n", pokemon.getNome());
                System.out.printf("Vida: %d%n", pokemon.getVida());
                System.out.printf("Ataque: %d%n", pokemon.getAtaque());
                System.out.printf("Defesa: %d%n", pokemon.getDefesa()
                );

                System.out.println("*******************");
                System.out.println("Status Mega Evoluido:");
                pokemon.megaEvoluir();
                System.out.printf("Nome: %s%n", pokemon.getNome());
                System.out.printf("Vida: %d%n", pokemon.getVida());
                System.out.printf("Ataque: %d%n", pokemon.getAtaque());
                System.out.printf("Defesa: %d%n", pokemon.getDefesa());
                System.out.printf("Ataque especial: %s%n", pokemon.getAtaqueEspecial());
                break;
            case 2:
                pokemon.setNome("Venusaur");
                pokemon.setVida(300);
                pokemon.setAtaque(30);
                pokemon.setDefesa(30);

                System.out.println("POKEDEX");
                System.out.printf("Nome: %s%n", pokemon.getNome());
                System.out.printf("Vida: %d%n", pokemon.getVida());
                System.out.printf("Ataque: %d%n", pokemon.getAtaque());
                System.out.printf("Defesa: %d%n", pokemon.getDefesa()
                );

                System.out.println("*******************");
                System.out.println("Status Mega Evoluido:");
                pokemon.megaEvoluir();
                System.out.printf("Nome: %s%n", pokemon.getNome());
                System.out.printf("Vida: %d%n", pokemon.getVida());
                System.out.printf("Ataque: %d%n", pokemon.getAtaque());
                System.out.printf("Defesa: %d%n", pokemon.getDefesa());
                System.out.printf("Ataque especial: %s%n", pokemon.getAtaqueEspecial());
                break;
            default:
                System.out.println("Opção invalida!");
        }
    }
}