public class FilmManager {

    protected String[] films = new String[0];
    protected int limit;

    public FilmManager(){
        this.limit = 10;
    }

    public FilmManager(int limit){
        this.limit = limit;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length >= limit) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }
        String[] result = new String[10];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }

}
