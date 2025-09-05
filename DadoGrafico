
/**
 * Write a description of class DadoGrafico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DadoGrafico
{
private Square cuadrado;
private Circle c1;
private Circle c2;
private Circle c3;
private Circle c4;
private Circle c5;
private Circle c6;

public DadoGrafico(){
    c1= new Circle(20, 0, 0, "green", true);
    c2= new Circle(20, 0, 0, "green", true);
    c3= new Circle(20, 0, 0, "green", true);
    c4= new Circle(20, 0, 0, "green", true);
    c5= new Circle(20, 0, 0, "green", true);
    c6= new Circle(20, 0, 0, "green", true);
    cuadrado= new Square(100,10,20,"yellow",true);
    
}

public void dibujarCara(int cara){
    switch(cara){
        case 1:
            c1=new Circle(20, 0, 0, "green", true);
            int xPos=cuadrado.getXposition()+(cuadrado.getSize()-c1.getDiameter())/2;
            int yPos= cuadrado.getYposition()+(cuadrado.getSize()-c1.getDiameter())/2;
            c1.moveHorizontal(xPos);
            c1.moveVertical(yPos);
            cuadrado.makeVisible();
            c1.makeVisible();
        break;
    
        case 2:
            xPos=cuadrado.getXposition()+(cuadrado.getSize()-c1.getDiameter())/2;
            yPos= cuadrado.getYposition()+(cuadrado.getSize()-c1.getDiameter())/2;
            c1=new Circle(20,0,0,"green", true);
            c2=new Circle(20,0,0,"blue", true);
            c1.moveHorizontal(xPos);
            c1.moveVertical(yPos-20);
            c2.moveHorizontal(xPos);
            c2.moveVertical(yPos);
            cuadrado.makeVisible();
            c1.makeVisible();
            c2.makeVisible();
        break;
        
        
        case 3:
        break;
        case 4:
        break;
        case 5:
        break;
        case 6:
        break;
    }
}

}
