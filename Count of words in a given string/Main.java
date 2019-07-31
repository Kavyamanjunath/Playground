#include<stdio.h>

int main()
{
  //Type your code here
  char str[100];
  int i,word=0;
  scanf("%[^\n]s",str);
  for(i=0;str[i]!='\0';i++)
  {
    if(str[i]==' ' || str[i]=='\n')
    {
      word++;
    }
  }
  word++;
  printf("%d",word);
  
  
}