// this is the manual backendn working of stack methord like -:push ,pop,display etc;
public class Arraystack {
    int a[];
    int top,max;
    
    Arraystack(int size){
        max=size;
        top=-1;
        a=new int[size];

    }
    void push(int x){

        if(top==max-1){
            System.out.print("Stack OverFlow Error");
            return;
        }
        top++;
        a[top]=x;
        
    }
    void pop(int x){
        if(top==-1){
            System.out.print("Stack UnderFlow Error");
            return;

        }
        top--;

    }
    void Display(){
        if(top==-1){
            System.out.print("Stack UnderFlow Error");
            return;
        }
        int i=top;
        while(i !=-1)
        {
            System.out.println(a[i]);
            i--;

        }
    }


    
    public static void main(String[] args){
        Arraystack b=new Arraystack(5);
        b.push(1);
        b.push(2);
        b.push(3);
        b.push(4);
        b.push(5);
        b.Display();
    
    
    }
}
