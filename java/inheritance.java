class inheritance {
int students;
int rollno;
inheritance(){
students=0;
rollno=0;
}
void display(){
System.out.println("students are =" +students);
System.out.println("roll no is  =" +rollno);
}
}
class hllo extends inheritance{
int fee;
hllo(){
students=0;
rollno=0;
fee=0;
}
}
class lale extends hllo{
int activity;
lale(){
super.students=0;
super.rollno=0;
fee=0;
activity=0;
}

public static void main(String []args)
{
hllo h= new hllo();
h.display();
}
}





