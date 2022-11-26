public class Sectiune {
    String titlu;
    int numar_pagini;

    public Sectiune() {
    }

    public Sectiune(String titlu, int numar_pagini) {
        this.titlu = titlu;
        this.numar_pagini = numar_pagini;
    }

    @Override
    public String toString() {
        return "Sectiune{" +
                "titlu='" + titlu + '\'' +
                ", numar_pagini=" + numar_pagini +
                '}';
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public int getNumar_pagini() {
        return numar_pagini;
    }

    public void setNumar_pagini(int numar_pagini) {
        this.numar_pagini = numar_pagini;
    }
}
