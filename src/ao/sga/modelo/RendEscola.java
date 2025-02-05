package ao.sga.modelo;
public class RendEscola {
  
    private double[] Ntrab = new double[4];
    private double[] nota = new double[2];
    


    public RendEscola(double nota1, double nota2, double Ntrab1, double Ntrab2, double Ntrab3, double Ntrab4) {
        this.Ntrab[0] = Ntrab1;
        this.Ntrab[1] = Ntrab2;
        this.Ntrab[2] = Ntrab3;
        this.Ntrab[3] = Ntrab4;
        this.nota[0] = nota1;
        this.nota[1] = nota2;
    }
    
    public double getNota1() {
        return this.nota[0];
    }

    public void setNota1(double nota) {
        this.nota[0] = nota;
    }
    public double getNota2() {
        return this.nota[1];
    }

    public void setNota2(double nota) {
        this.nota[1] = nota;
    }

    public double getNtrab1() {
     return this.Ntrab[0];
    }
    public void setNtrab1(double Ntrab) {
        this.Ntrab[0] = Ntrab;
    }
    public double getNtrab2() {
        return this.Ntrab[1];
       }
       public void setNtrab2(double Ntrab) {
           this.Ntrab[1] = Ntrab;
       }
       public double getNtrab3() {
        return this.Ntrab[2];
       }
       public void setNtrab3(double Ntrab) {
           this.Ntrab[2] = Ntrab;
       }
       public double getNtrab4() {
        return this.Ntrab[3];
       }
       public void setNtrab4(double Ntrab) {
           this.Ntrab[3] = Ntrab;
       }

    

   

    public void mostraNota() {
        int d = -1;
        while (++d < 2) {

            System.out.println("Nota" + (d + 1) + "-->" + nota[d]);
        }
    }

    public void mostraNotaTrabalho() {
        int d = -1;
        while (++d < 4) {
            System.out.println("Nota do Trabalho Numero " + (d + 1) + " Nota-->" + Ntrab[d]);
        }
    }

    public void Media( ) {
        double P1, Media, P2;
        P1 = (Ntrab[0] + Ntrab[1]) / 2;
        P2 = (Ntrab[2] + Ntrab[3]) / 2;
        Media = (nota[0] * 0.4 + P1*0.1) + (nota[1] * 0.6 + P2*0.1);
        if (Media > 10) {
            Media = 10;
        }
        if (Media >= 7) {
            System.out.println(" == APROVADO == , MEDIA--> " + Media);
        } else if (Media >= 3 || Media <= 7) {
            System.out.println(" == EXAME == , MEDIA--> " + Media);
        } else {
            System.out.println(" == REPROVADO == , MEDIA--> " + Media);
        }
    
    }

    public void mostraRenEscola() {
        mostraNota();
        mostraNotaTrabalho();

    }
    
 }
