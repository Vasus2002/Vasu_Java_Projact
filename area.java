class Area
{
    double l;
    double b;
    void setDim(double l,double b){
        this.l=l;
        this.b=b;
    }
    
    double getArea(){
        return l * b;
    }
	
}
public class Main{
    public static void main(String[] args) {
		Area ar = new Area();
		ar.setDim(4.5,6.7);
		System.out.println("Area of Rectangle is :"+ar.getArea());
        
    }
}
