import java.util.ArrayList;
import java.util.Date;

public class Main2 {

    public void imprimir(ArrayList<Video> filmes, Visualizacoes visualizacoes){
        for(Video filme: filmes){
            filme.imprimir();
            visualizacoes.imprimir(filme);
            System.out.println();
        }
    }

    public static void main(String[] arg){
        Videos filmes = new Videos();
        Video temp = new Video("Star Wars", "01:50:00", new Date(1977), "M/16", "Ficção-Cientifica", true, "Guerra espacial", "http://exemplo.com");
        Video temp2 = new Video("Senhor dos Aneis", "02:50:00", new Date(2001), "M/16", "Acção", true, "Guerra Idade media", "http://exemplo.com");
        Video temp3 = new Video("Velocidade Furiosa", "01:30:00", new Date(2002), "M/16", "Acção", false, "Corridas de Carros", "http://exemplo.com");
        Video temp4 = new Video("Star Trek", "01:45:00", new Date(1970), "M/16", "Ficção-Cientifica", false, "Guerra espacial", "http://exemplo.com");
        filmes.addVideo(temp);
        filmes.addVideo(temp2);
        filmes.addVideo(temp3);
        filmes.addVideo(temp4);

        Visualizacoes visualizacoes = new Visualizacoes();
        Visualizacao aux = new Visualizacao(temp, "Paulo", "10-02-2005", true);
        Visualizacao aux2 = new Visualizacao(temp, "Ricardo", "14-09-1998", true);
        Visualizacao aux3 = new Visualizacao(temp, "Raul", "12-05-2004", false);
        Visualizacao aux4 = new Visualizacao(temp2, "Paulo", "12-05-2002", true);
        visualizacoes.addVisualizacao(aux);
        visualizacoes.addVisualizacao(aux2);
        visualizacoes.addVisualizacao(aux3);
        visualizacoes.addVisualizacao(aux4);
        visualizacoes.totalVisualizacoesPorVideo();
        visualizacoes.totalGostosPorVideo();
        ArrayList<Video> lista = filmes.listaVideosDisponiveis();
        Main2 exec = new Main2();
        exec.imprimir(lista, visualizacoes);
    }
}
