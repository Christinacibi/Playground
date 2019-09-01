#include<stdio.h>
int main()
{
  float p,r,t,SI=0,amount=0,discount,final;
  scanf("%f%f%f",&p,&r,&t);
  SI=(p*t*r)/100;
  amount=p+SI;
  discount=0.02*SI;
  final=amount-discount;
  printf("%.2f\n%.2f\n%.2f\n%.2f\n",SI,amount,discount,final);
}