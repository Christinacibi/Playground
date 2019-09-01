#include<stdio.h>
int main()
{
  float a;
  scanf("%f",&a);
  float d=(int)a;
  float b=floor(a);
  float c=ceil(a);
  printf("%.0f\n",d);
  printf("%.1f\n",c);
  printf("%.1f\n",b);
}