import java.util.List;

public class Carte {
    String nume;
    String autor;
    List<Capitol> capitole;

    public Carte() {
    }

    public Carte(String nume, String autor, List<Capitol> capitole) {
        this.nume = nume;
        this.autor = autor;
        this.capitole = capitole;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "nume='" + nume + '\'' +
                ", autor='" + autor + '\'' + "\n" +
                ", capitole=" + capitole +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public List<Capitol> getCapitole() {
        return capitole;
    }

    public void setCapitole(List<Capitol> capitole) {
        this.capitole = capitole;
    }
}
