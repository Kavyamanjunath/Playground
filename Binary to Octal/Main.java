#include<stdio.h>
#include<math.h>
int main()
{
  int binary,sum=0,rem,exp=0;
  scanf("%d",&binary);
  while(binary!=0)
  {
    rem=binary%10;
    sum=sum+rem*pow(2,exp);
    exp++;
    binary=binary/10;
  }
  int array[100],i=0,j;
  while(sum!=0)
  {
    array[i++]=sum%8;
    sum=sum/8;
  }
  for(j=i-1;j>=0;j--)
    printf("%d",array[j]);
  
	  

}