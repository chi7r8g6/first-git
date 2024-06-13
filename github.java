
class github{
    public static void main(String[] args) {
        //D

        int i,j;
        for(i = 0; i<7; i++){
            for(j = 0; j<4; j++ ){
                if((i == 0 || i == 6) && j < 4){
                    System.out.print("*");
                }else if(j == 0|| j == 3 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
 
    
     //E
        for(i = 0;i < 7;i++){
            for(j = 0;j < 5;j++){
                                if(i == 0 || i == 3 || i == 6 || j == 0){
                                    System.out.print("*");
                                }
                                else{
                                    System.out.print(" ");
                                }
                            
                              
                            }
                            System.out.println();
        }
       
  
    //E
    for( i = 0; i < 7;i++){
        for(j = 0; j < 5; j++){
                              if(i == 0 || i == 3|| i == 6 || j == 0 ){
                                 System.out.print("*");
                              }else{
                                  System.out.print(" ");
                                }
                            }
                            System.out.println();
    }

    
//P
int size =7;

       for ( i = 0; i < size; i++) {

           for ( j = 0; j <= size / 2; j++) {
               if (j == 0 || (i == 0 || i == size / 2) && j < size / 2 || (j == size / 2 && i <= size / 2)) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
System.out.println();
             
      //A
       
       
       for(i = 0; i<7; i++){
          for(j=0; j<5; j++){
                          if((i==0|| i==3) && j <=5){
                              System.out.print("*");   
                          } 
                          else if(j == 0 || j == 4){
                              System.out.print("*");   
                          } 
                          else{
                              System.out.print(" ");   
                          }    
                      } 
                      System.out.println();   
       


    }
System.out.println();
//K


int siz = 5;


for ( i = 0; i < siz; i++) {
   
    for ( j = 0; j < siz; j++) {
      
        if (j == 0 || i + j == siz - 1 || i == j && i >= siz / 2)
            System.out.print("*");
        else
            System.out.print(" ");
    }
    
    System.out.println();
}
}
}

