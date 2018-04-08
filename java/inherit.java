class box {
int length;
int height;
int breadth;
box(int x, int y, int z)
{
length=x;
breadth=y;
height=z;
}
box(){
length=breadth=height=0;
}
void display(){
System.out.println("the length is="+length);
System.out.println("the breadth is="+breadth);
System.out.println("the height is="+height);
}
}
class rectangle extends box{
int weight;
rectangle(int x,int y, int z, int w){
super(x,y,z);
weight=w;
}
rectangle(){
weight=0;
}
void display(){
super.display();
System.out.println("the weight is="+weight);
}
}
class inherit{
public static void main(String []args)
{
rectangle r = new rectangle(10,20,30,40);
r.display();
}
}






