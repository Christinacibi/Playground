#include<stdio.h>
int main()
{
  int num;
  scanf("%d\n",&num);
  if(num%4==0)
    printf("Leap year");
  else 
    printf("Not Leap year");
  return 0;
}