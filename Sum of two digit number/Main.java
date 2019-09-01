#include<stdio.h>
int main()
{
  int num,num2,num3,num1;
  scanf("%d",&num);
  num1=num%10;
  num2=num/10;
  num3=num1+num2;
  printf("%d\n",num3);
  return 0;
}