import java.util.List;

public class Capitol {
    String titlu;
    List <Sectiune> sectiuni;

    public Capitol() {
    }

    public Capitol(String titlu, List<Sectiune> sectiuni) {
        this.titlu = titlu;
        this.sectiuni = sectiuni;
    }

    @Override
    public String toString() {
        return "Capitol{" +
                "titlu='" + titlu + '\'' + "\n" +
                ", sectiuni=" + sectiuni +
                '}';
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public List<Sectiune> getSectiuni() {
        return sectiuni;
    }

    public void setSectiuni(List<Sectiune> sectiuni) {
        this.sectiuni = sectiuni;
    }
}
