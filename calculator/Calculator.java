package calculator;

public class Calculator {

  //add(1, 4, 5, 2, .... , 4) ---> int
  public int add(int...numbers) {
    int sum = 0;

    for (int number : numbers) {
      if(number > 0) {
        if (sum + number < 0) {
          throw new OverflowException("Invalid operation");
        }
      }

      if(number < 0) {
        if (sum + number > 0) {
          throw new OverflowException("Invalid operation");
        }
      }

      sum += number;
    }

    return sum;
  }

  public int sub(int a, int b) {
    return a - b;
  }
}
