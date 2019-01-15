package aula.solu.angoware.sliderbarexemple;

/**
 * Created by Pedro on 13/01/2019.
 */

public class Mensagens {
    public int cover;
    public String nome, mensagem, hora;


    public Mensagens() {

    }

    public Mensagens (int cover, String nome, String mensagem, String hora){
        this.cover    = cover;
        this.nome     = nome;
        this.mensagem = mensagem;
        this.hora     = hora;
    }

    public int getCover (){
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMensagem (){
        return mensagem;
    }

    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }

    public String getHora (){
        return hora;
    }

    public void setHora (String hora){
        this.hora = hora;
    }
}
