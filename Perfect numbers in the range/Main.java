#include <iostream>
using namespace std;
int main()
{
  int u,h;
  std::cin>>u>>h;
  int i = u, sum = 0;
  while (i <= h)
  {
    while (u <= h)
    {
      if (u < i)
      {
        if (i % u == 0)
          sum = sum + u;
      }
      u++;
    }
    if (sum == i) {
      cout << i << " ";
    }
    i++;
    u = 1;
    sum = 0;
  }
}
