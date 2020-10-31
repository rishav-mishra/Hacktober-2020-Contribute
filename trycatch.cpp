#include <iostream>
using namespace std;
int main()
{
  int n1,n2;
  cout<<"Enter the two numbers : \n";
  cin>>n1>>n2;
  try
  {
    if(n2!=0)
    {
      float rem = (float) n1/n2;
      cout<<"\nResult : "<<rem;
    }
    else
    throw (n2);
  }

  catch (int n2)
{
  cout<<"Division by zero has been attempted. \n\n";
}
cout<<"Exiting main. \n";

return 0;
}
