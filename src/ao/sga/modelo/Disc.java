package ao.sga.modelo;

import java.util.ArrayList;
public class Disc {
    private static int id;
    private String name, emenda;
    private ArrayList<Prof>  profs;
    private ArrayList<Aluno> alunos;
    private ArrayList<RendEscola> rendEscolar;

    public Disc(String name, String emenda) {
        this.id = this.id + 1;
        this.name = name;
        this.emenda = emenda;
        this.alunos = new ArrayList<Aluno>(); 
        this.profs = new ArrayList<Prof>();
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
    public void AddProf( Prof prof){
        prof.AddDisc(this);
        profs.add(prof);
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

}
