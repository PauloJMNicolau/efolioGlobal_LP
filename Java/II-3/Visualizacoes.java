import java.util.ArrayList;
import java.util.HashMap;

public class Visualizacoes {
    private ArrayList<Visualizacao> visualizacoes;
    private HashMap<Video, Integer> totalVisualizacoesPorVideo;
    private HashMap<Video, Integer> totalGostosPorVideo;

    public Visualizacoes(){
        visualizacoes = new ArrayList<Visualizacao>();
        totalGostosPorVideo = new HashMap<>();
        totalVisualizacoesPorVideo = new HashMap<>();
    }

    public void addVisualizacao(Visualizacao nova){
        visualizacoes.add(nova);
    }

    public void totalVisualizacoesPorVideo(){
        HashMap<Video, Integer> dados = new HashMap<>();
        for (Visualizacao visual: this.visualizacoes) {
            if(dados.containsKey(visual.getVideo())){
                dados.replace(visual.getVideo(), dados.get(visual.getVideo()).intValue() + visual.totalVisualizacoesPorVideo());
            } else{
                dados.put(visual.getVideo(), visual.totalVisualizacoesPorVideo());
            }
        }
        this.totalVisualizacoesPorVideo=dados;
    }

    public void totalGostosPorVideo(){
        HashMap<Video, Integer> dados = new HashMap<>();
        for (Visualizacao visual: this.visualizacoes) {
            if(dados.containsKey(visual.getVideo())){
                dados.replace(visual.getVideo(), dados.get(visual.getVideo()).intValue() + visual.totalGostosPorVideo());
            } else{
                dados.put(visual.getVideo(), visual.totalGostosPorVideo());
            }
        }
        this.totalGostosPorVideo = dados;
    }

    public void imprimir(Video video){
        if(totalVisualizacoesPorVideo.containsKey(video)) {
            System.out.println("Total Visualizações: " + totalVisualizacoesPorVideo.get(video).intValue());
        } else{
            System.out.println("Total Visualizações: 0");
        }
        if(totalGostosPorVideo.containsKey(video)) {
            System.out.println("Total Gostos: " + totalGostosPorVideo.get(video).intValue());
        } else{
            System.out.println("Total Gostos: 0");
        }
    }
}
