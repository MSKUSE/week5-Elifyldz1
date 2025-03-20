public class Rectangle {

    private Point topLeft;
    private int sideA, sideB;

    public Rectangle(Point topLeft, int sideA, int sideB){

        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideB);
    }
    public Rectangle(Point topLeft, int sideA){

        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideA);
    }
   
    public Point getTopLeft() {
        return topLeft;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }
    public void setSideA(int sideA) {
        if(sideA < 0){
            this.sideA = 0;
            System.out.println("Side A can't be a negative");
        }else{
            this.sideA = sideA;
        }
        
    }
    public void setSideB(int sideB) {
        if(sideB < 0){
            this.sideB = 0;
            System.out.println("Side B can't be a negative");
        }else{
            this.sideB = sideB;
        }

        
    }
    public int perimeter(){
        return (2*sideA) + (2*sideB);

    }
    public int area(){
        return sideA*sideB;
    }

  


}
