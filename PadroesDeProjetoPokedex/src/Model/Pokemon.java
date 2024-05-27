package Model;

import Interfaces.MegaEvoluir;

public class Pokemon implements MegaEvoluir {


    private String nome;
    private Integer vida;
    private Integer ataque;
    private Integer defesa;
    private Integer ataqueEspecial;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Integer getDefesa() {
        return defesa;
    }

    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }

    public Integer getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(Integer ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    @Override
    public void megaEvoluir() {

        if (this.nome == "Charizard" || this.nome == "Blastoise" || this.nome == "Venusaur"){
            this.ataque = this.ataque * 2;
            this.defesa = this.defesa * 2;
            this.vida = this.vida * 2;

            if (this.nome == "Charizard"){
                this.ataqueEspecial = 100;
            }
            if (this.nome == "Blastoise"){
                this.ataqueEspecial = 70;
            }
            if (this.nome == "Venusaur"){
                this.ataqueEspecial = 80;
            }
        } else {
            System.out.println("Este pokémon não possui mega evolução!");
        }
    }
}
