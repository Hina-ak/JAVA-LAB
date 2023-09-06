import java.util.Scanner;
public class matrix_add{  
public static void main(String args[]){      
int i,j,r1,r2,c1,c2;
Scanner s=new Scanner(System.in);
System.out.print("Number of rows and columns should be SAME \n");
System.out.print("Enter number of rows in first matrix:");
r1 = s.nextInt();
System.out.print("Enter number of columns in first matrix:");
c1 = s.nextInt();
System.out.print("Enter number of rows in second matrix:");
r2 = s.nextInt();
System.out.print("Enter number of columns in second matrix:");
c2 = s.nextInt();
int mat1[][]=new int[r1][c1];
int mat2[][]=new int[r2][c2];
int res[][]=new int[r2][c2];
System.out.println("Enter the elements of the First matrix: ");
for(i=0;i<r1;i++)
{
	for(j=0;j<c1;j++)
	{
	mat1[i][j]=s.nextInt();
	}
}
System.out.println("First matrix :\n");
for(i=0;i<r1;i++)
{    
	for(j=0;j<c1;j++)
	{    
		System.out.print(mat1[i][j]+" ");   		
	} 
	System.out.println(""); 	
}
System.out.println("Enter the elements of the Second matrix\n");
for(i=0;i<r2;i++)
{
	for(j=0;j<c2;j++)
	{
	mat2[i][j]=s.nextInt();
	}
}
System.out.println("Second matrix :\n");
for(i=0;i<r2;i++)
{    
	for(j=0;j<c2;j++)
	{    
		System.out.print(mat2[i][j]+" ");   		
	} 
	System.out.println(""); 	
}
System.out.println("The addition of the 2 matrix are :\n");
for(i=0;i<r2;i++)
{    
	for(j=0;j<c2;j++)
	{    
		res[i][j]=mat1[i][j]+mat2[i][j]; 
		System.out.print(res[i][j]+" ");   		
	} 
	System.out.println(""); 	
}    
}
}