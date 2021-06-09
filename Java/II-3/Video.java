import java.util.ArrayList;
import java.util.Date;

public class Video {
    private String titulo;
    private String duracao;
    private Date data_lancamento;
    private String classificacao;
    private String genero_filme;
    private boolean disponibilidade;
    private String sinopse;
    private String url_imagem;

    public Video(String titulo, String duracao, Date data, String classificacao, String genero, boolean disponivel, String sinopse, String url){
        this.titulo = titulo;
        this.duracao = duracao;
        this.data_lancamento = data;
        this.classificacao = classificacao;
        this.genero_filme = genero;
        this.disponibilidade = disponivel;
        this.sinopse = sinopse;
        this.url_imagem = url;
    }

    public ArrayList<Video> listaVideosDisponiveis(){
        ArrayList<Video> videosDisponiveis= new ArrayList<Video>();
        if(this.disponibilidade == true){
            videosDisponiveis.add(this);
        }
        return videosDisponiveis;
    }

    public void imprimir(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Genero: " + this.genero_filme);
    }

}
