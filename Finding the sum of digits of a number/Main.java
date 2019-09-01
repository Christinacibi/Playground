#include <stdio.h>
int main() 
{
  int num,sum=0,t,rem;
  scanf("%d",&num);
  t=num;
  while(t!=0)
  {
    rem=t%10;
    sum=sum+rem;
    t=t/10;
  }
  printf("%d\n",sum);
	return 0;
}