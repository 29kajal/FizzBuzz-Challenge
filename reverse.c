#include<stdio.h>
#include<string.h>
void main()
{
	int l,i;
	char st[30],s;
	printf("Enter String:");
    gets(st);
    l=strlen(st);
    for(i=0;i<l/2;i++)
    {
    	s=st[i];
    	st[i]=st[l-i-1];
    	st[l-i-1]=s;
    	
	}
	printf("%s",st);
	
}

