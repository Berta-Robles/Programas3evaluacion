#include<stdio.h>
int main(){
	int vector[4];
	int cont;
	vector[0]=3;
	vector[1]=1;
	vector[2]=4;
	vector[3]=2;
	for(cont=0;cont<4;cont++){
		printf("\nvector[%i]=%i",cont,vector[cont]);
	}
	//que es la variable vector realmente
	printf("\nvector= %x",vector);
	printf("\nvector[0]= %x",&vector[0]);
	printf("\nvector[1]= %x",&vector[1]);
	printf("\nvector[2]= %x",&vector[2]);
	printf("\nvector[3]= %x",&vector[3]);
	
	return(0);

}
