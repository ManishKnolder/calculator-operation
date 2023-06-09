package com.knoldus

//A trait for validate the operand
trait Validator {

  def validate(operands: Seq[Double]): Boolean

}

//Operator trait for performing and validating the operation on operand
trait Operator extends Validator {
  /* This method is inherited by all the class to perform the validation the operand */
  def validateAndExecute(operands: Seq[Double]): Seq[Double] = {
    if (validate(operands)) execute(operands)
    else throw new CalculatorException
  }
  /* This method is used by all the classes to perform the operations */
  protected def execute(operands: Seq[Double]): Seq[Double]

}







