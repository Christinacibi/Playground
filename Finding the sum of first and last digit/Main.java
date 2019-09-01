#include <stdio.h>
int main()
{
  int num,sum=0,first_digit,last_digit;
  scanf("%d",&num);
  last_digit=num%10;
  first_digit=num;
  while(num>=10)
  {
    num=num/10;
  }
  first_digit=num;
  sum=first_digit+last_digit;
  printf("%d\n",sum);
	return 0;
}