//Exercitiu 4
public class Animal {
    private String nume;
    private String specie;
    private int varsta;

    public Animal(String nume,String specie, int varsta){
        this.nume = nume;
        this.specie = specie;
        this.varsta = varsta;
    }
    public String getNume(){
        return nume;
    }
    public String getSpecie(){
        return specie;
    }
    public int getVarsta(){
        return varsta;
    }

    public void setNume(String nume){
        this.nume = nume;
    }

    public void setSpecie(String specie){
        this.specie = specie;
    }
    public void setVarsta(int varsta){
        this.varsta = varsta;
    }

}
