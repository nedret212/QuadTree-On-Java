/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadtry;


public class Quadtry{

    Node root;
    
    public void ekle(int nokta_x,int nokta_y){
    
        Node yeni=new Node(nokta_x,nokta_y); /// mouse event x ve y gelecek
        
        if(root==null){
        
            root=yeni;
        }else{
            Node focus=root;
            Node parent;
            
            while(true){
                parent = focus;
                
                if(nokta_x<focus.nokta_x && nokta_y<focus.nokta_y){
                    focus=focus.xy1;
                    if(focus==null)
                    {
                        parent.xy1=yeni;
                        return;
                    }
                }
                else if(nokta_x>focus.nokta_x && nokta_y<focus.nokta_y){
                
                    focus=focus.Xy2;
                    
                    if(focus==null){
                    
                        parent.Xy2=yeni;
                        return;
                    }
                }
                 else if(nokta_x<focus.nokta_x && nokta_y>focus.nokta_y){
                
                    focus=focus.xY3;
                    if(focus==null){
                    
                        parent.xY3=yeni;
                        return;
                    }
                }
                else if(nokta_x>focus.nokta_x && nokta_y>focus.nokta_y){
                
                    focus=focus.XY4;
                    if(focus==null){
                    
                       parent.XY4=yeni;
                       return;
                    }
                } 
            }
        }      
    }
    public void dolas(Node focus){
    
        if(focus!=null)
        {
            dolas(focus.xy1);
            System.out.println(focus);
            dolas(focus.Xy2);
            dolas(focus.xY3);
            dolas(focus.XY4);  
        }
    }
       
}
