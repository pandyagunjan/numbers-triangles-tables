 

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
     /* for(int i=1 ;i <= 4;i++)
      {
          for(int j=1;j<=i;j++)
          {
            smalltriangleOutput=smalltriangleOutput+"*";
          }
          smalltriangleOutput=smalltriangleOutput+"\n";
      }*/
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
      /* String largeTriangleOutput="";
      for(int i=1 ;i <= 9;i++)
      {
          for(int j=1;j<=i;j++)
          {
            largeTriangleOutput=largeTriangleOutput+"*";
          }
          largeTriangleOutput=largeTriangleOutput+"\n";
      }*/
        return getTriangle(9);
    }
}
