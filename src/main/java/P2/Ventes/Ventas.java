package P2.Ventes;

public class Ventas {
    private double[] ventMensual;

    public Ventas(double[] ventMensual) {
        this.ventMensual = ventMensual;
    }

    public double[] getVentMensual() {
        return ventMensual;
    }

    public void setVentMensual(double[] ventMensual) {
        this.ventMensual = ventMensual;
    }

    public double ventAnual() {
        double totalVentas = 0;
        for (double ventas : ventMensual) {
            totalVentas += ventas;
        }
        return totalVentas / 12;
    }

    public String menosVentas() {
        int MenosVentas = 0;
        String Mes = null;
        for (int i = 1; i < ventMensual.length; i++) {
            if (ventMensual[i] < ventMensual[MenosVentas]) {
                MenosVentas = i;
                
                if (MenosVentas == 0){
                    Mes = "Enero";
                    
                }else{
                    if (MenosVentas == 1){
                    Mes = "Febrero";
                    
                     }else{
                        if (MenosVentas == 2){
                    Mes = "Marzo";
                    
                         }else{
                            if (MenosVentas == 3){
                    Mes = "Abril";
                    
                                 }else{
                                if (MenosVentas == 4){
                    Mes = "Mayo";
                    
                                }else{
                                    if (MenosVentas == 5){
                    Mes = "Junio";
                    
                                     }else{
                                        if (MenosVentas == 6){
                    Mes = "Julio";
                    
                                      }else{
                                            if (MenosVentas == 7){
                    Mes = "Agosto";
                    
                                            }else{
                                                if (MenosVentas == 8){
                    Mes = "Septiembre";
                    
                                               }else{
                                                    if (MenosVentas == 9){
                    Mes = "Octubre";
                    
                                                     }else{
                                                        if (MenosVentas == 10){
                    Mes = "Noviembre";
                    
                                                        }else{
                                                            if (MenosVentas == 11){
                    Mes = "Diciembre";
                    
                                                             }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                 }
                
            }
        }
        
       
        
        return Mes;
    }

    public String masVentas() {
        int MasVentas = 0;
        String Mes = null;
        for (int i = 1; i < ventMensual.length; i++) {
            if (ventMensual[i] > ventMensual[MasVentas]) {
                MasVentas = i;
                
                if (MasVentas == 0){
                    Mes = "Enero";
                    
                }else{
                    if (MasVentas == 1){
                    Mes = "Febrero";
                    
                     }else{
                        if (MasVentas == 2){
                    Mes = "Marzo";
                    
                         }else{
                            if (MasVentas == 3){
                    Mes = "Abril";
                    
                                 }else{
                                if (MasVentas == 4){
                    Mes = "Mayo";
                    
                                }else{
                                    if (MasVentas == 5){
                    Mes = "Junio";
                    
                                     }else{
                                        if (MasVentas == 6){
                    Mes = "Julio";
                    
                                      }else{
                                            if (MasVentas == 7){
                    Mes = "Agosto";
                    
                                            }else{
                                                if (MasVentas == 8){
                    Mes = "Septiembre";
                    
                                               }else{
                                                    if (MasVentas == 9){
                    Mes = "Octubre";
                    
                                                     }else{
                                                        if (MasVentas == 10){
                    Mes = "Noviembre";
                    
                                                        }else{
                                                            if (MasVentas == 11){
                    Mes = "Diciembre";
                    
                                                             }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                 }
            }
        }
        
        
        return Mes;
    }

    public double totalAnuales() {
        double acumuladoVentas = 0;
        for (double ventas : ventMensual) {
            acumuladoVentas += ventas;
        }
        return acumuladoVentas;
    }
}
