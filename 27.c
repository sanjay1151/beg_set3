#include <stdio.h>
#include<string.h>

int main(void) 
{
	char st[10];
	int n,i;
	printf("enter the string:");
	scanf("%s",st);
	n=strlen(st);
	for(i=0;i<n;i++)
	{
		if(st[i]>='0' && st[i]<='9')
		{
			printf("\n YES");
		}
		else
		printf("\n NO");
	}
	return 0;
}
