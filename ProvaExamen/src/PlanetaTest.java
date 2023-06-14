import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetaTest {

    int temperaturaMitjana;
    int quantitatAigua;
    int radiacio;
    int gravetat;
    int distanciaSol; 

    public void antequera(int temperaturaMitjana, int quantitatAigua, int radiacio, int gravetat, int distanciaSol){
        this.temperaturaMitjana = temperaturaMitjana;
        this.quantitatAigua = quantitatAigua;
        this.radiacio = radiacio;
        this.gravetat = gravetat;
        this.distanciaSol = distanciaSol;
        }

    public void setTemperaturaMitjana(int temperaturaMitjana) 
    {
        this.temperaturaMitjana = 30;
    }

    public int getTemperaturaMitjana() 
    {
        return temperaturaMitjana;
    }

    @Test
    public void conversioKelvin()
    {
        this.temperaturaMitjana = this.temperaturaMitjana + 273;
        assertEquals(temperaturaMitjana, 272);          
    }

    @Test 
    public void testConversioKelvin()
    {
        //assertEquals(expected, actual);
    }    


    @Test 
    public void testPlanetaHabitable()
    {
        //assertEquals(expected, actual);
        //assertEquals(expected, actual);
        //assertEquals(expected, actual);
        //assertEquals(expected, actual);
    }


    @Test 
    public void testCalculPes()
    {
        //assertEquals(expected, actual);
    }  
    

    @Test 
    public void testPlanetaEquilibrat()
    {
        //assertEquals(expected, actual);
        //assertEquals(expected, actual);
    }  
}
