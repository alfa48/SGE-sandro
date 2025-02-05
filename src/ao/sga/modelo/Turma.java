package ao.sga.modelo;

import java.util.ArrayList;

public class Turma {
    private static int id;
    private ArrayList<Disc> discs;
    private ArrayList<Aluno> alunos;
    private ArrayList<Prof> profs;
    private String name;
    private int cap;

    public Turma(int cap, String name) {
        id = id + 1;
        this.name = name;
        this.cap = cap;
        this.discs = new ArrayList<Disc>();
        this.profs = new ArrayList<Prof>();
        this.alunos = new ArrayList<Aluno>();
    }

    public int getCap() {
        return this.cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Disc> getDisc() {
        return this.discs;
    }

    public void setDisc(ArrayList<Disc> discs) {
        this.discs = discs;
    }

    public void setAluno(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Aluno> getAluno() {
        return this.alunos;
    }

    public void setProf(ArrayList<Prof> profs) {
        this.profs = profs;
    }

    public ArrayList<Prof> getProf() {
        return this.profs;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void AddAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public void AddProf(Prof prof){
        prof.AddTurma(this);
        profs.add(prof);
    }

    public void AddDisc(Disc disc) {

        discs.add(disc);
    }

    public void RemoverDisc(int idd) {
        System.out.println("DISCIPLINA " + discs.get(idd).getName() + " FOI REMOVIDO COM SUCESSO ");
        discs.remove(idd);
    }

    public void mostraDisc() {
        System.out.println("DISCPLINA");
        int i = -1;
        while (++i < getDisc().size()-2) {
            System.out.println("Cod_" + (i + 1) + " | NOME: " + getDisc().get(i).getName() + "| EMENDA: "
                    + getDisc().get(i).getEmenda());

        }
    }
    public void mostra() {
        int i = -1;
        while (++i < 10) {
            System.out.println("Cod_" + (i + 1) + " | NOME: " + getDisc().get(i).getName() + "| EMENDA: "
                    + getDisc().get(i).getEmenda());

        }
    }
}