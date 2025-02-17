package ao.sga.modelo;

import java.util.ArrayList;
public class Disc {
    private int id;
    private String name, emenda;
    private ArrayList<Prof>  profs;
    private ArrayList<Aluno> alunos;
    private ArrayList<RendEscola> rendEscolar;
    private double n1, n2, n3,media;

    public Disc(String name, String emenda) {
        this.name = name;
        this.emenda = emenda;
        this.alunos = new ArrayList<Aluno>(); 
        this.profs = new ArrayList<Prof>();
        n1 = 0;
        n2 = 0;
        n3 = 0;
    }

    public void setRendEscola( ArrayList<RendEscola> rendEscolas){
        this.rendEscolar= rendEscolas;
    }
    public ArrayList<RendEscola> getRendEscola(){
        return this.rendEscolar;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmenda() {
        return this.emenda;
    }

    public void setEmenda(String emenda) {
        this.emenda = emenda;
    }
    public void setAluno( ArrayList<Aluno> alunos){
        this.alunos= alunos;
    }
    public ArrayList<Aluno> getAluno(){
        return this.alunos;
    }
    public void AddAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public void AddProf(Prof prof){
        if (!this.profs.contains(prof))
        {
            this.profs.add(prof);
            prof.AddDisc(this);
        }
    }
    
    
     public void RemoveProf( int idd){
        
        System.out.println("PROFESSOR "+alunos.get(idd).getName()+" FOI REMOVIDO COM SUCESSO ");
        alunos.get(idd).discs.remove(idd);
        this.profs.remove(idd);
      }

    public void setProf( ArrayList<Prof> Profs){
        this.profs= Profs;
    }
    public ArrayList<Prof>  getProf(){
        return this.profs;
    }

    public int getId() {
        return this.id;
    }

    public void mostraDisciplina() {
        System.out.println(
                        "\n Nome: " + this.getName() +
                        "\n USUARIO: " + this.getEmenda());
    }
   

    public void mostra() {

        System.out.println("DISCIPLICA: "+this.getName());
    }
    public void mostraP(int k) {

        System.out.println( " PROFESSOR: " +getProf().get(k).getName());
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double getMedia() {
        return (((n1 + n2)/2)*0.4) + (n3*0.6);
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
}
