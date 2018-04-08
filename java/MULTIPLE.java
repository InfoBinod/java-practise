class Student{
    int m1;
    int m2;
void getmarks(int x, int y){
    m1=x;
    m2=y;
    
}
void display(){
System.out.println("m1 is :"+m1);
System.out.println("m2 is :"+m2);

}
}
interface Sport{
    int N=10;
    void disp();
    
}
class Multiple extends Student implements Sport
{
 public void disp(){
 System.out.println("the value is :"+N);
 }
 void show(){
    display();
    disp();
    int total=m1+m2+N;
    System.out.println("the total is :"+total);
 
 }
}
class MULTIPLE{
    public static void main(String []args)
    {
    Multiple obj=new Multiple();
    obj.getmarks(20,30);
    obj.show();
    
    }
}


