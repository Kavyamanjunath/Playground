#include<stdio.h>
int main()
{
  //Type your code here
  int year;
  scanf("%d",&year);
  if(year%4==0)
  {
    if(year%100==0)
    {
      if(year%400==0)
      {
        printf("LEAP YEAR",year);
      }
      else
        printf("NOT LEAP YEAR",year);
    }
    else
        printf("LEAP YEAR",year);
  }
  else
    printf("NOT LEAP YEAR",year);
    
  return 0;
}