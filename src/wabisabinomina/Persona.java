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
public abstract class Persona {
  private String nomb;
  private String ape;
  private String ti;
  private fecha Fnacimi;
  private FechaActual actual;
  private int edad;
  private String LTi;
  private String dire;
  private String tel;
  
  public Persona (){
      
  }

    public Persona(int dia, int mes, int anio, String nomb, String ape, String ti, String LTi, String dire, String tel) {
        this.nomb = nomb;
        int mesactual = 0, diaactual = 0,  anoactual = 0;
        this.Fnacimi = new fecha (dia,mes,anio);
        actual = new FechaActual();
        this.edad = edad (actual.getMes(), actual.getDia(),actual.getAño(), dia,  mes,  anio);
        this.ape = ape;
        this.ti = ti;
        this.LTi = LTi;
        this.dire = dire;
        this.tel = tel;
    }

    private int edad (int mesactual, int diaactual, int anoactual,int dia, int mes,  int ano){
        int anofinal = 0, dias, diafinal = 0, meses = 0, mesfinal = 0;
        if (mes<=mesactual && dia<diaactual) {
			anofinal = (anoactual-ano);
		}
		if (dia<diaactual && mes>mesactual) {
			anofinal = (anoactual-ano)-1;
		} else {
			if (mes<mesactual && dia>=diaactual) {
				anofinal = (anoactual-ano);
			}
		}
		if (mesactual<mes && diaactual==dia) {
			anofinal = (anoactual-ano)-1;
		}
		if (mes==mesactual && dia==diaactual) {
			anofinal = anoactual-ano;
		}
		if (mes>=mesactual && dia>=diaactual) {
			anofinal = anoactual-ano;
		}
		if (mes>mesactual && dia>diaactual) {
			anofinal = (anoactual-ano)-1;
		}
		if (mes>=1 && mes<=12) {
			switch (mes) {
			case 1 :
				dias = 31;
				if (dia==diaactual) {
					dia = dia+1;
				}
				diafinal = (dias-diaactual)-dia;
				if (mes>meses && mes<1) {
					System.out.println("esta fuera del rango de los meses");
				} else {
					if (mes<=meses && mes>=1) {
						if (mes>mesactual) {
							mesfinal = (meses+mesactual)-mes;
						}
						if (mes<mesactual) {
							mesfinal = mesactual-mes;
						}
					}
				}
				break;
			case 2:
				dias = 28;
				if (dia==diaactual) {
					dia = dia+1;
				}
				diafinal = (dias-diaactual)-dia;
				if (mes>meses && mes<1) {
					System.out.println("esta fuera del rango de los meses");
				} else {
					if (mes<=meses && mes>=1) {
						mesfinal = (meses+mesactual)-mes;
					}
					if (mes<mesactual) {
						mesfinal = mesactual-mes;
					}
				}
				break;
			case 3:
				dias = 31;
				if (dia==diaactual) {
					dia = dia+1;
				}
				diafinal = (dias-diaactual)-dia;
				if (mes>meses && mes<1) {
					System.out.println("esta fuera del rango de los meses");
				} else {
					if (mes<=meses && mes>=1) {
						mesfinal = (meses+mesactual)-mes;
					}
					if (mes<mesactual) {
						mesfinal = mesactual-mes;
					}
				}
				break;
			case 4:
				dias = 30;
				if (dia==diaactual) {
					dia = dia+1;
				}
				diafinal = (dias-diaactual)-dia;
				if (mes>meses && mes<1) {
					System.out.println("esta fuera del rango de los meses");
				} else {
					if (mes<=meses && mes>=1) {
						mesfinal = (meses+mesactual)-mes;
					}
					if (mes<mesactual) {
						mesfinal = mesactual-mes;
					}
				}
				break;
			case 5:
				dias = 31;
				if (dia==diaactual) {
					dia = dia+1;
				}
				diafinal = (dias-diaactual)-dia;
				if (mes>meses && mes<1) {
					System.out.println("esta fuera del rango de los meses");
				} else {
					if (mes<meses && mes>=1) {
						mesfinal = (meses+mesactual)-mes;
					}
					if (mes<=mesactual) {
						mesfinal = mesactual-mes;
					}
				}
				break;
			case 6:
				dias = 30;
				if (dia==diaactual) {
					dia = dia+1;
				}
				diafinal = (dias-diaactual)-dia;
				if (mes>meses && mes<1) {
					System.out.println("esta fuera del rango de los meses");
				} else {
					if (mes<=meses && mes>=1) {
						mesfinal = (meses+mesactual)-mes;
					}
					if (mes<mesactual) {
						mesfinal = mesactual-mes;
					}
				}
				break;
			case 7:
				dias = 31;
				if (dia==diaactual) {
					dia = dia+1;
				}
				diafinal = (dias-diaactual)-dia;
				if (mes>meses && mes<1) {
					System.out.println("esta fuera del rango de los meses");
				} else {
					if (mes<=meses && mes>=1) {
						mesfinal = (meses+mesactual)-mes;
					}
					if (mes<mesactual) {
						mesfinal = mesactual-mes;
					}
				}
				break;
			 case 8:
				dias = 31;
				if (dia==diaactual) {
					dia = dia+1;
				}
				diafinal = (dias-diaactual)-dia;
				if (mes>meses && mes<1) {
					System.out.println("esta fuera del rango de los meses");
				} else {
					if (mes<=meses && mes>=1) {
						mesfinal = (meses+mesactual)-mes;
					}
					if (mes<mesactual) {
						mesfinal = mesactual-mes;
					}
				}
				break;
			 case 9:
				dias = 30;
				if (dia==diaactual) {
					dia = dia+1;
				}
				diafinal = (dias-diaactual)-dia;
				if (mes>meses && mes<1) {
					System.out.println("esta fuera del rango de los meses");
				} else {
					if (mes<=meses && mes>=1) {
						mesfinal = (meses+mesactual)-mes;
					}
					if (mes<mesactual) {
						mesfinal = mesactual-mes;
					}
				}
				break;
			case 10:
				dias = 31;
				if (dia==diaactual) {
					dia = dia+1;
				}
				diafinal = (dias-diaactual)-dia;
				if (mes>meses && mes<1) {
					System.out.println("esta fuera del rango de los meses");
				} else {
					if (mes<=meses && mes>=1) {
						mesfinal = (meses-mesactual)-mes;
					}
					if (mes<mesactual) {
						mesfinal = mesactual-mes;
					}
				}
				break;
			case 11:
				dias = 30;
				if (dia==diaactual) {
					dia = dia+1;
				}
				diafinal = (dias-diaactual)-dia;
				if (mes>meses && mes<1) {
					System.out.println("esta fuera del rango de los meses");
				} else {
					if (mes<=meses && mes>=1) {
						mesfinal = (meses-mesactual)-mes;
					}
					if (mes<mesactual) {
						mesfinal = mesactual-mes;
					}
				}
				break;
			case 12:
				dias = 31;
				if (dia==diaactual) {
					dia = dia+1;
				}
				diafinal = (dias-diaactual)-dia;
				if (mes>meses && mes<1) {
					System.out.println("esta fuera del rango de los meses");
				} else {
					if (mes<=meses && mes>=1) {
						mesfinal = (meses+mesactual)-mes;
					}
					if (mes<mesactual) {
						mesfinal = mesactual-mes;
					}
				}
				break;
			}
		} else {
			System.out.println("el numero del mes no coincide");
		}
               System.out.println(" fecha " + anofinal + " " + mesfinal + " "+ diafinal); 
		return anofinal;
	

        
        
    } 

    public fecha getFnacimi() {
        return Fnacimi;
    }

    public void setFnacimi(fecha Fnacimi) {
        this.Fnacimi = Fnacimi;
    }

    
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
    
    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getTi() {
        return ti;
    }

    public void setTi(String ti) {
        this.ti = ti;
    }

   

    

    public String getLTi() {
        return LTi;
    }

    public void setLTi(String LTi) {
        this.LTi = LTi;
    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

   
 
  
  
}
