#include<stdio.h>
int main(){
char *text = "HelloWorld";
char res[12];
int i = 0;
while(text[i]!='\0'){
    printf("%c",text[i]^0);
    i++;
}
res[i]='\0';
printf("%s\n",text);
printf("%s",res);
return 0;
}
