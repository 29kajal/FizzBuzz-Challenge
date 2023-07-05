#include<stdio.h>
int main()
{
	int i,j,n;
	printf("Enter The Number:");
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<i;j++)
		{
			if(a[i]==a[j])
			{
				printf("The Duplicate Number Is : %d\n" ,a[i]);
			}
		}
	}
	return 0;
}
