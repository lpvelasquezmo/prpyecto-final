/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wabisabinomina;

/**
 *
 * @author Maicol Velasquez
 */
public class Turno {
    private float hoini;
    private int id;
    private float hofin;
    private int horaDiur;
    private int horaNoct;

    public Turno() {
        this.hofin = 0;
        this.hoini = 0;
        this.horaDiur =0;
        this.horaNoct =0;
        this.id =0;
     
    }
    
    public boolean Turno(float hoini, float hofin, int id) {
                           int hoDiur=0, hoNoct=0;
                           this.id= id;
      boolean aux = false;
       float tot =hofin- hoini; 
        if (tot == 8){
            this.hoini = hoini;
            this.hofin = hofin;
             if  (hoini>= 6 && hofin <= 21){
            this.horaDiur= 8;
            this.horaNoct =0;
        }else if (hoini > 21 && hofin <6){
            this.horaNoct = 8;
            this.horaDiur=0;
        }else if ( this.hofin >= 6 && this.hofin <= 21){
                for (int i= 1; i<16; i++){
                    float aux1 = this.hofin ;
                            aux1 -=i;
                            if(aux1 >21 && aux1<6){
                               this.horaDiur =i;
                               this.horaNoct = 8-i;
                                i=30;                                
                            }
                                     }
                
            }
          else  if (this.hofin<6 || this.hofin >21){
                for(int j =1; j<10; j++){
                    float aux2 = this.hofin;
                    aux2-=j;
                    if (aux2>=6 && aux2 <=21){
                        this.horaDiur = j;
                        this.horaNoct = 8-j;
                        j=30;
                    }
                }
                
            
                 System.out.println("Horas Diurnas :    " +  hoDiur  + "\n" + "Horas Nocturnas :    "  + hoNoct + "\n" );
        } aux = true;
        }else{
            System.out.println("El turno no es de 8 horas, como dicta la ley");
            aux= false;
        }
        
       return aux;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getHoini() {
        return hoini;
    }

    public void setHoini(float hoini) {
        this.hoini = hoini;
    }

    public float getHofin() {
        return hofin;
    }

    public void setHofin(float hofin) {
        this.hofin = hofin;
    }

    public int getHoraDiur() {
        return horaDiur;
    }

    public void setHoraDiur(int horaDiur) {
        this.horaDiur = horaDiur;
    }

    public int getHoraNoct() {
        return horaNoct;
    }

    public void setHoraNoct(int horaNoct) {
        this.horaNoct = horaNoct;
    }

  
     
    
    
}
