#include<stdio.h>
int main()
{
  int dividend=365,divisor=4;
  int quotient,remainder;
  quotient=dividend/divisor;
  remainder=dividend%divisor;
  printf("Quotient: %d\n",quotient);
  printf("Remainder: %d\n",remainder);
  return 0;
}