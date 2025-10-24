#include<stdio.h>
#include<string.h>
int main(){
char *text = "HelloWorld";
for(int i=0;i<strlen(text);i++){
    printf("%c",text[i]^127);
}
printf("\n");
for(int i=0;i<strlen(text);i++){
    printf("%c",text[i]&127);
}
printf("\n");
for(int i=0;i<strlen(text);i++){
    printf("%c",text[i]||127);
}
return 0;
}
