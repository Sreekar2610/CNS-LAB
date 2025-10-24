#include<stdio.h>
#include<string.h>
int main(){
char text[100];
int input;

printf("Enter a String : ");
scanf("%s",text);
printf("Enter a Value : ");
scanf("%d",&input);
printf("String : %s\n",text);
printf("Value :%d\n",input);

for(int i=0;i<strlen(text);i++){
    printf("%c",text[i]^input);
}
return 0;
}

