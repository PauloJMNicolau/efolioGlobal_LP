import java.util.ArrayList;

public class Videos {
    private ArrayList<Video> videos;

    public Videos(){
        this.videos = new ArrayList<Video>();
    }

    public void addVideo(Video filme){
        this.videos.add(filme);
    }

    public ArrayList<Video> listaVideosDisponiveis(){
        ArrayList<Video> lista = new ArrayList<Video>();
        for (Video filme: this.videos) {
            ArrayList<Video> res = filme.listaVideosDisponiveis();
            if(res != null){
                lista.addAll(res);
            }
        }
        return lista;
    }

}
