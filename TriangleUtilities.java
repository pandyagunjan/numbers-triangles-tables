 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String starOutput="";
      for(int i=0 ;i<numberOfStars;i++)
      {
          starOutput=starOutput+"*";
          
      }
        return starOutput;
    }
    
    public static String getTriangle(int numberOfRows) {
        String triangleOutput="";
      for(int i=1 ;i <= numberOfRows;i++)
      {
          for(int j=1;j<=i;j++)
          {
            triangleOutput=triangleOutput+"*";
          }
          triangleOutput=triangleOutput+"\n";
      }
        return triangleOutput;
    }


    public static String getSmallTriangle() {
        String smalltriangleOutput="";
     
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
     
        return getTriangle(9);
    }
}
