import ch.aplu.turtle.Turtle;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yeison
 */
public class Escena {
    private Turtle tortuga;
    
    public Escena(){
        tortuga = new Turtle();
    }
    
    public void cuadrado(int pixeles){
        for (int i = 0; i < 4; i++) {
            tortuga.forward(pixeles);
            tortuga.right(90);
        }
    }
    
    public void triangulo(int pixeles, int posX, int posY){
        tortuga.setX(posX);
        tortuga.setY(posY);
        for (int i = 0; i < 4; i++) {
            if(i==0){
                tortuga.right(90);
            }
            else if(i==1 || i==2){
                tortuga.forward(50);
                tortuga.left(120);
            }
            else{
                tortuga.forward(50);
                tortuga.right(150);
            }
        }
    }
    
    public void patron(){
        for (int i = 0; i < 8; i++) {
            cuadrado(50);
            tortuga.right(45); 
        }
    }
}
