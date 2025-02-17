package ao.sga.modelo;

import java.util.ArrayList;

public class Aluno  {

    private int id;
    private String name;
    private String cargo;
    private String username;
    private String password;
    private String date;
    private Turma turma;
    private RendEscola rendEscolar;//esquece
    public ArrayList<Disc> discs;

    
    public Aluno(String name, String username, String password) {
        this.name = name;
        this.password = password;
        this.username = username;
        
        this.rendEscolar = null;
        this.turma = null;
        discs = new ArrayList<Disc>();
    }
    
    public Aluno(String name, String cargo, String date, String username, String password) {
        this.id = this.id + 1;
        this.name = name;
        this.password = password;
        this.username = username;
        this.date = date;
        this.cargo = cargo;
        
        this.rendEscolar = null;
        this.turma = null;
        discs = new ArrayList<Disc>();
    }

    

    public void setRendEscola(RendEscola rendEscolar){
        this.rendEscolar = rendEscolar;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getCargo() {
        return this.cargo;
    }
    public void addDisc(Disc d){
        discs.add(d);
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Turma getTurma() {
        return this.turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void mostraAluno() {
        System.out.println(
                "\n Nome: " + this.getName() +
                "\n Nome: " + this.getUsername() +
                "\n");
    }

    public void mostra(int aux) {

        System.out.println("ID-" + (aux + 1) + " Nome: " + this.getName());
    }

    

    public void MenuAluno1() {

        System.out.println(" \n                     ESCOLHE UMA OPCÄO\n" + //
                "                        1 - EDITAR PASSWORD\n" + //
                "                        2 - VOLTAR\n" + //
                "                        3 - TERMINAR SECCAO");
    }

}
