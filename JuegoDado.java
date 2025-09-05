
/**
 * Write a description of class JuegoDado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JuegoDado
{
private Dado d1;
private Dado d2;
private Dado d3;
private int dadosSumados=0;

public JuegoDado(){
    d1=new Dado();
    d2=new Dado();
    d3=new Dado();
}

public void lanzar3Dados(){
    d1.lanzar();
    d2.lanzar();
    d3.lanzar();
}
public boolean sonLos3Iguales(){
    if(d1.getCaraActual()==d2.getCaraActual() && d1.getCaraActual()==d3.getCaraActual()
    && d2.getCaraActual()==d3.getCaraActual())
    return true;
    else {
    return false;
}
}
public int suma3Dados(){
    dadosSumados= d1.getCaraActual()+d2.getCaraActual()+d3.getCaraActual();
    return dadosSumados;
}
public int getSuma(){
    return dadosSumados;
}
public boolean Ganador(){
    if(getSuma()>14 || sonLos3Iguales())
    return true;
    else{
        return false;
    }
}
public void jugar(){
    lanzar3Dados();
    System.out.println("Tus dados son: ");
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);
    System.out.println("La suma es: "+suma3Dados());
    String resultado=Ganador()?"Felicidades es un ganador":"Has perdido";
    System.out.println(resultado);
    
}
}
