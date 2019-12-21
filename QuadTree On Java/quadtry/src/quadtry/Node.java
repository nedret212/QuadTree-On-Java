/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadtry;
import javax.swing.JFrame;

public class Node {
    
    int nokta_x;
    int nokta_y;
    
    Node xy1;
    Node Xy2;
    Node xY3;
    Node XY4;
    
    Node(int nokta_x,int nokta_y){
    
        this.nokta_x=nokta_x;
        this.nokta_y=nokta_y;
        
    }
    public String toString(){
    
        return "x degeri: "+nokta_x+" , y degeri: "+nokta_y;
    }
    public static void main(String[] args) {
        
        MouseControl calistir=new MouseControl();
        calistir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calistir.setSize(620, 550);
        calistir.setVisible(true);      
    }
    
}
