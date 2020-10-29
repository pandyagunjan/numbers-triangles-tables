


public class NumberUtilities {

    public static String getRange(int stop) {
       

        return  getRange(0,stop,1);
    }

    public static String getRange(int start, int stop) {
        
       /* String result="";
        
        for(int i=start ; i < stop ;i++)
        {
            result=result+i;
        }
*/

        return getRange(start,stop,1);
    }


    public static String getRange(int start, int stop, int step) {
       String result="";
        
        for(int i=start ; i < stop;i+=step)
        {
            result=result+i;
//            i=i+step;
        }


        return result;
    }

    public static String getEvenNumbers(int start, int stop) {
      /* String result="";
        
        for(int i=start ; i < stop;i++)
        {
            
          if(i%2 == 0 )
          result=result+i;
        }*/

         if(start %2 !=0)
         {
         start++;
        }
         return  getRange(start,stop,2);
        
//        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        String result="";
       if(start %2 ==0)
         {
         start++;
        }
         return  getRange(start,stop,2);

//        return result;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
      StringBuilder resultForExponent=new StringBuilder();
        for(int i=start ; i <= stop;i++)
        {
            resultForExponent.append((int)Math.pow(i,exponent));
         
        }


        return resultForExponent.toString();
    }
}
