 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        
        
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
       String smallMultiplcation="";
//        int saveValue=0;
        
        for(int i=1; i<=tableSize ; i++)
        {
            for(int j=1;j<=tableSize;j++)
            {
                                    
              if (i*j > 99)
              { 
               smallMultiplcation= smallMultiplcation+  i*j+" |";
               }
               else
               
              if (i*j < 10)
              { 
               smallMultiplcation= smallMultiplcation + "  "+ i*j +" |";
               }
               else
               {
                   smallMultiplcation= smallMultiplcation+ " "+ i*j +" |";
                }
                            
     
            }
            smallMultiplcation= smallMultiplcation + "\n" ;
        }
        
        return smallMultiplcation;
    }
}
