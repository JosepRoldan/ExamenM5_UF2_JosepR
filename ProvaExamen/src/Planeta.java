/**
 * @author Josep Roldan Pagador
 * @version 1.0
 * 
 * 
 * @param Per començar tenim les variables que utilitzarem per tot el programa, cadascuna guarda valors segons per a que l'utilitzarem
 * 
 * @param Constructor planeta per poder crear tots els planetes, també tenim totes les variables que fan referencia a diferentes caraceristiques de cada planeta
 * 
 * @param Constructor planeta totalment buit que podem utilitzar per poder posar les dades despres de crear el constructor del planeta
 * 
 * @param Funció de conversor a kelvin, aquesta funció converteix la temperatura mitjana en celcius a kelvin
 * 
 * @param Funció de planeta habitable, en aquesta funció ens diu si un planeta es habitable retornan-nos 1 o 0. 1 = es habitable, 0 = no es habitable
 * 
 * @param Funció de calcul pes, en aquesta funció calculem el pes que tindriem en newtons multiplicant-la per la gravetat del planeta
 * 
 * @param Funció de planeta equilibrat, en aquesta funció mirem que la quantitat d'aigua dona el mateix resultat que dividir la distancia al sol amb la radiació del planeta
 * 
 * @param Getters i setters de les variables del programa
 */


public class Planeta 
{

    int temperaturaMitjana;
    int quantitatAigua;
    int radiacio;
    int gravetat;
    int distanciaSol;    


    
    public Planeta(int temperaturaMitjana, int quantitatAigua, int radiacio, int gravetat, int distanciaSol) 
    {
        this.temperaturaMitjana = temperaturaMitjana;
        this.quantitatAigua = quantitatAigua;
        this.radiacio = radiacio;
        this.gravetat = gravetat;
        this.distanciaSol = distanciaSol;
    } 

    

    public Planeta(){

    }



    public void conversioKelvin()
    {
        this.temperaturaMitjana = this.temperaturaMitjana + 273;          
    }



    public int planetaHabitable() {
        if(temperaturaMitjana > 20 && temperaturaMitjana < 45){}
        else{return 0;} 

        if(quantitatAigua > 40){}
        else{return 0;}

        if(radiacio < 25){}
        else{return 0;}
        return 1;
    }



    public int calculPes(int pesPersona)
    {
        int PersonaNewtons = pesPersona * gravetat;  

        return PersonaNewtons;        
    }



    public int planetaEquilibrat()
    {
        if(quantitatAigua == distanciaSol / radiacio){}
        else{return 0;}

        return 1;   
    }



    public int getTemperaturaMitjana() 
    {
        return temperaturaMitjana;
    }

    public void setTemperaturaMitjana(int temperaturaMitjana) 
    {
        this.temperaturaMitjana = temperaturaMitjana;
    }

    public int getQuantitatAigua() 
    {
        return quantitatAigua;
    }

    public void setQuantitatAigua(int quantitatAigua) 
    {
        this.quantitatAigua = quantitatAigua;
    }

    public int getRadiacio()
    {
        return radiacio;
    }

    public void setRadiacio(int radiacio) 
    {
        this.radiacio = radiacio;
    }

    public int getGravetat() {
        return gravetat;
    }

    public void setGravetat(int gravetat) {
        this.gravetat = gravetat;
    }

    public int getDistanciaSol() 
    {
        return distanciaSol;
    }

    public void setDistanciaSol(int distanciaSol) 
    {
        this.distanciaSol = distanciaSol;
    }    
}