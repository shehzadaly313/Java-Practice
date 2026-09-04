package week2;

public class assignemntQ2 {
    public static void main( String [] args){
        int landWidth=50;
        int landLength=100;
        int totalLand=(landWidth * landLength);
        int circleDiameter=2;
        int squareLength=4;
        int circleRadius=circleDiameter/2;
        float circleArea=(3.14f) * (circleRadius*circleRadius);
        int squareArea=4*squareLength;
        float grassLandArea= circleArea + squareArea;
        System.out.println("The Land Area: "+totalLand);
        System.out.println("The Radius of Circle: "+circleRadius);
        System.out.println("the area of Circle: "+circleArea);
        System.out.println("The Area of Square: "+squareArea);
        System.out.println("The grass Land: "+grassLandArea);
    }
    
}
