package org.example.mathmirzakhani.maths.basic.numbersAndBasicOperations.impclass;

import org.example.mathmirzakhani.maths.basic.numbersAndBasicOperations.interfaces.MainOperationAlgebra;
import org.example.mathmirzakhani.utils.exception.MathByZeroException;


/**
 * @ Author : milad.r
 *
 * the class MainOperationAlgebraImp are  four the main  operation in algebra Math
 *
 * */

public class MainOperationAlgebraImp implements MainOperationAlgebra {


    @Override
    public double additionNumbers(double a, double b) {
        return a + b;
    }

    @Override
    public double subtractionNumbers(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicationNumbers(double a, double b) {
        return a * b;
    }

    @Override
    public double divisionNumbers(double a, double b) {

        if (b == 0){
            throw new MathByZeroException("Division by zero have not allowed.");
        }
       else {
            return a / b;
        }
    }
}
