 

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
String tempStorage = "";
int indexLocation;
        
        for(int i=1; i<=tableSize ; i++)
        {
            for(int j=1;j<=tableSize;j++)
            {
                 
               
                 indexLocation=String.valueOf(i*j).length();
                                 
                 switch(indexLocation)
                 {
                     case 1 :
                      smallMultiplcation+="  "+ i*j +" |";
                      break;
                      case 2 :
                      smallMultiplcation+=" "+ i*j +" |";
                      break;
                      case 3 :
                      smallMultiplcation+=i*j +" |";
                      break;
                      default :
                      break;
                 } 
                  
                /* Method 2
                 if(tempStorage.length() == 3 )
                 {
                       smallMultiplcation= smallMultiplcation+ i*j+" |";
                 }
                    else
                    if(tempStorage.length() == 1)
                    {
                           smallMultiplcation= smallMultiplcation+ "  "+ i*j +" |";
                    }
                 
                     else
                    {
                   smallMultiplcation= smallMultiplcation+ " "+ i*j +" |";
                    }  
                 */
                
                //Method 3
              /*if (i*j > 99)
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
     */
            }
            smallMultiplcation= smallMultiplcation + "\n" ;
        }
        
        return smallMultiplcation;
    }
}
