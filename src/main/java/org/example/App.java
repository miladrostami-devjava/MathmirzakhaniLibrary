package org.example;

import org.example.mathmirzakhani.maths.basic.numbersAndBasicOperations.impclass.MainOperationAlgebraImp;
import org.example.mathmirzakhani.maths.basic.numbersAndBasicOperations.interfaces.MainOperationAlgebra;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        MainOperationAlgebra math1 = new MainOperationAlgebraImp();




  //      System.out.println( math1.additionNumbers(3,6));
       // System.out.println(math1.subtractionNumbers(3,6));
    //   System.out.println( math1.multiplicationNumbers(3,6));
        System.out.println(math1.divisionNumbers(3,9000));





    }
}
