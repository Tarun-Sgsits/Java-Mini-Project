import java.util.Scanner;


class project{
   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int [][] matric = new int [row][column];
        //Transpose t = new Transpose();
        for(int i = 0 ; i<row ; i++){
            for(int j = 0 ; j<column ; j++){
                matric[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i<row ; i++){
            for(int j = 0 ; j<column ; j++){
                System.out.print(matric[i][j] + " ");
            }
            System.out.println();
        }
        //FOLLOWING OPERATION EXECUTED ON THE ABOVE MATRIC
        Transpose(matric);
        AdditionOfMatric(matric);
        Multiplication(matric);
        MultiplyByInteger(matric);
        DivideByInteger(matric);
        Determinant(matric);
        AdjointOfMatric(matric);
        InverseOfMatric(matric);
        SumOfDiagonalElements(matric);
        IdentityMatric(matric);
        DiagonalMatric(matric);
     

    }   

    static void Transpose(int [][] matric ){
         //Transpose of a matric
        System.out.println("Transpose is:");
        for(int j = 0 ; j<2 ; j++){
            for(int i = 0 ; i<2 ; i++){
                System.out.print(matric[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void AdditionOfMatric(int [][] matric){
         // ADDITION OF A MATRIC
         Scanner sc =new Scanner(System.in);

        System.out.println("Enter 1 for addition of matric: ");
        int add = sc.nextInt();
        if(add == 1){
            System.out.println("Enter row and column of matrix");
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int matric1 [][] = new int [r1][c1];
            int AddMatric[][] = new int[r1][c1];

            for(int i = 0 ; i<r1 ;i++){
                for(int j = 0 ;j<c1 ; j++){
                    matric1[i][j] = sc.nextInt();

                }
            }
            System.out.println("Addition of matric is : ");
            for(int i = 0 ; i<r1 ; i++){
                for(int j = 0 ; j<c1 ; j++){
                    AddMatric[i][j] = matric[i][j] + matric1[i][j] ;
                    System.out.print(AddMatric[i][j] + " ");

                }
                System.out.println();
            }

          }// IF ENDS

    }

    static void Multiplication(int [] [] matric){

        // MULTIPLICATION OF MATRICES
        System.out.println("Multiplication of Matric is :");

        int MultiMatric [][]  = new int[2][2];
        for(int i = 0 ; i<2 ; i++){
            for(int j = 0 ;j<2 ; j++){
               
                MultiMatric[i][j] = 0 ;
                for(int k = 0; k<2 ; k++){
                    MultiMatric[i][j] += matric[i][k] * matric[k][j] ;
                }
                System.out.print(MultiMatric[i][j] + " ");
            }
            System.out.println();
        } // for loop ends

    }

    static void Determinant(int [][] matric){

        //Determinant of Matric
        int DeterminantMatric[][] = new int [2][2];
        System.out.println("Determinant of a matric is : ");
        int Determinant = ( matric[0][0] * matric[1][1]) - (matric[0][1] * matric[1][0]) ;
        System.out.println(Determinant);

    }


    static void MultiplyByInteger(int [][] matric){

        //MULTIPLICATION OF A INTEGER IN MATRIC

        Scanner sc = new Scanner(System.in);
        int MultiplyIntergerMatric[][] = new int [2][2];
        System.out.println("Enrter interger to be multuplied in matric");
        int x = sc.nextInt();
        for(int i = 0 ;i<2 ; i++){
            for(int j = 0; j<2 ; j++){
                matric[i][j] = matric[i][j] * x ;
                System.out.print(matric[i][j] + " ");
            }
            System.out.println();
        }

    }

     static void IdentityMatric(int [][]matric){

        //CHECKING MATRIC IS IDENTITY OR NOT
        for(int i = 0 ; i<2;i++){
            for(int j= 0 ; j<2 ; j++){
                if(i == 1)
                return;
                if(i == j){
                 if(matric[i][j] == matric[i+1][j+1]){
                    System.out.println("Matric is identity");
                }else{
                    System.out.println("Matric is not Identity");
                }
            }
        }
   } //FOR LOOPS ENDS HERE

    }

    static void AdjointOfMatric(int [][]matric){

         //ADJOINT OF A MATRIC
         System.out.println("Adjoint Of Matric : ");
         int AdjointOfMatric[][]= new int[2][2];
         AdjointOfMatric[0][0] = matric[1][1];
         AdjointOfMatric[0][1] = - matric[1][0];
         AdjointOfMatric[1][0] = - matric[0][1];
         AdjointOfMatric[1][1] = matric[0][0];
          for(int i = 0 ; i<2 ; i++){
            for(int j = 0 ;j<2 ; j++){
             System.out.print(AdjointOfMatric[i][j] + " ");
          }
             System.out.println();
        }
    }

    static void InverseOfMatric(int [][]matric){

              //ADJOINT OF A MATRIC

         int AdjointOfMatric[][]= new int[2][2];
         AdjointOfMatric[0][0] = matric[1][1];
          AdjointOfMatric[0][1] = - matric[1][0];
          AdjointOfMatric[1][0] = - matric[0][1];
         AdjointOfMatric[1][1] = matric[0][0];

    //Determinant of Matric
        int DeterminantMatric[][] = new int [2][2];

        int Determinant = ( matric[0][0] * matric[1][1]) - (matric[0][1] * matric[1][0]) ;
        System.out.println(Determinant);
   

        //INVERSE OF A MATRIC
        int InverseOfMatric[][] = new int [2][2];
         System.out.println("Inverse of matric : ");
       for(int i = 0 ; i<2 ; i++){
           for(int j = 0 ; j<2 ; j++){
        InverseOfMatric[i][j] = AdjointOfMatric[i][j] / Determinant;
        System.out.print(InverseOfMatric[i][j] + " ");
     }
     System.out.println();
   }
    }

    static void SumOfDiagonalElements(int [][] matric){
        // ADDITON OF DIAGONAL ELEMENTS 
        int add = 0;

        System.out.println("Sum of Diagonal Elements is : ");
        for(int i= 0 ; i<2 ; i++){
            for(int j = 0 ;j<2 ; j++){
                if(i==j){
                    add += matric[i][j];
                }
            }
        }
        System.out.println(add);
    }

    static void DivideByInteger(int [][]matric){
        //DIVISION BY A NUMBER IN MATRIC

        Scanner sc = new Scanner(System.in);
        int [][] divide = new int [2][2];
        System.out.println("Enter an integer to divide each element of matric: ");
        int x = sc.nextInt();
        for(int i= 0 ; i<2 ; i++){
            for(int j = 0 ; j<2 ; j++){
                divide[i][j] = matric[i][j] / x ;
                
            }
        }//FOR LOOP ENDS HERE

        for(int i = 0 ;i <2 ; i++){
            for(int j = 0 ;j<2 ;j++){
                System.out.print(divide[i][j]);
            }
            System.out.println();
        }
        
    }

    static void DiagonalMatric(int [][] matric){
        //CHECK EITHER MATRIC IS DIAGONAL MATRIC OR NOT
        int count = 0;

        for(int i =0 ;i<2 ; i++){
            for(int j = 0 ;j<2 ;j++){
                if(i != j && matric[i][j] != 0){
                    count++;
                }
            }
        }
        if(count == 2){
            System.out.println("Matric is not a Diagonal matric");
        }

    }
}