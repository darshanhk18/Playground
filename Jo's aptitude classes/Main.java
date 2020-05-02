#include<iostream>
int gcd(int a,int b,int c)
{
  int smaller;
  if(a<b&&a<c)
    smaller=a;
  else if(b<a&&b<c)
    smaller=b;
  else
    smaller=c;
  while(smaller>0)
  {
    if(a%smaller==0&&b%smaller==0&&c%smaller==0)
      return smaller;
    else
      smaller=smaller-1;
  }
}
int main()
{
  int a,b,c,d;
  std::cin>>a>>b>>c>>d;
  int m=gcd(a,b,c);
  if(m==d)
  {
    std::cout<<"Answer is correct.";
  }
  else
  {
    std::cout<<"Answer is wrong.";
  }
}