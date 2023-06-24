#include<stdio.h>
void main()
{
	int i,n;
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		if(i%3==0)
		printf("Fizz\t");
		else if(i%5==0)
		printf("Buzz\t");
		else if(i%15==0)
		printf("FizzBuzz\t");
		else
		printf("%d\t",i);
	}
}
