package ao.sga.modelo;

import java.util.ArrayList;
public class Prof {
  
    private int id;
    private String name;
    private String cargo;
    private  String username;
    private  String password;
    private String date;
    private ArrayList<Turma> turmas;
    private ArrayList<Disc> discs;
   

    
    
    public Prof(String name, String date, String username, String password)
    {
        this.name = name;
        this.password = password;
        this.cargo = "PROFESSOR";
        this.username = username;
        this.date = date;
        this.discs =  new ArrayList<Disc>();
        this.turmas = new ArrayList<Turma>();
       
    }
    


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }


    public ArrayList<Turma> getTurma(){
        return this.turmas;
    }

    public void setTurma( ArrayList<Turma> turmas){
        this.turmas = turmas;
    }

    public ArrayList<Disc> getDisc(){
        return this.discs;
    }

    public void setDisc( ArrayList<Disc> discs){
        this.discs = discs;
    }

    public String getCargo(){
        return this.cargo;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public String getDate(){
        return this.date;
    }
    
    public void setDate(String date){
        this.date = date;
    }

    public String getPassword(){
        return this.password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    public String getUsername(){
        return this.username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }

    public int getId(){
        return this.id;
    }
    public void mostra(int k){
        System.out.println(" Nº do Prof: "+(k+1)+"| Prof: "+this.getName());
        
    }
    public void AddDisc(Disc disc) {

        discs.add(disc);
    }
    public void AddTurma(Turma turma) {
        if(!turmas.contains(turma))
            turmas.add(turma);
    }

    public void mostraTodos(int k){
        System.out.println(" Nº do Prof: "+(k+1)+"| Prof: "+this.getName());
        
    }

    public void mostraAdm(){
        System.out.println("ADMINISTRADOR: "+this.getCargo());
        System.out.println("NOME DO ADMINISTRADOR: "+this.getName());
        System.out.println("NOME DO USERNAME: "+this.getUsername());
        
    }

   
    public void mostraProfessor()
    {
        System.out.println(
                    "\n Nome: "+this.getName()+
                    "\n USUARIO: "+this.getUsername()+
                    "\n CARGO: "+this.getCargo()+
                    "\n DATA DE NASCIMENTO: "+this.getDate()+
                    "\n"
                    );
    }
    public void MenuProfessorAluno1()
    {
    System.out.println("                      ESCOLHE UMA OPCÄO\n" + //
                "                        1 - EDITAR NOTA1\n" + //
                "                        2 - EDITAR NOTA2\n" + //
                "                        3 - SAIR");
    }
    public void MenuProfessorAluno()
    {
    System.out.println("                      ESCOLHE UMA OPCÄO\n" + //
    "                        1 - EDITAR NOTA\n" + //
    "                        2 - EDITAR NOTA DO TRABALHO\n" + //
    "                        3 - SAIR");
    }
    public void MenuProfessorAluno3()
    {
    System.out.println("                      ESCOLHE UMA OPCÄO\n" + //
    "                        1 - EDITAR NOTA DO ALUNO\n" + //
    "                        2 - SAIR");
    }
    public void MenuProfessorAluno2()
    {
    System.out.println("                      ESCOLHE UMA OPCÄO\n" + //
    "                        1 - EDITAR NOTA DO TRABALHO1\n" + //
    "                        2 - EDITAR NOTA DO TRABALHO2\n" + //
    "                        3 - EDITAR NOTA DO TRABALHO3\n" + //
    "                        4 - EDITAR NOTA DO TRABALHO4\n" + //
    "                         - SAIR");
    }

    public void MenuAdm1()
    {
    System.out.println("                      ESCOLHE UMA OPCÄO\n" + //
    "                        1 - PROFESSOR\n" + //
    "                        2 - ALUNO\n" + //
    "                        3 - DISCIPLINA\n" + //
    "                        4 - TURMA \n" + //
    "                        5 - SAIR");
    }
}
