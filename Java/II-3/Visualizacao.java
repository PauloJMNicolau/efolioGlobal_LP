import java.util.Date;

public class Visualizacao {
    private Video filme;
    private String subscritor;
    private String data_visualizacao;
    private boolean avaliacao;

    public Visualizacao(Video filme, String subscritor, String data, boolean avaliacao) {
        this.filme = filme;
        this.subscritor = subscritor;
        this.data_visualizacao = data;
        this.avaliacao = avaliacao;
    }

    public int totalVisualizacoesPorVideo(){
        if(this.data_visualizacao != ""){
            return 1;
        }
        return 0;
    }

    public Video getVideo(){
        return this.filme;
    }

    public int totalGostosPorVideo(){
        if(this.avaliacao){
            return 1;
        }
        return 0;
    }

}
