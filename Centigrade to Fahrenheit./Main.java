#include<stdio.h>
int main()
{
  	//type your code here
  float fahrenheit,centigrade;
  scanf("%f",&centigrade);
  fahrenheit = (centigrade * 9/5) + 32;
  printf("%0.2f",fahrenheit);
}