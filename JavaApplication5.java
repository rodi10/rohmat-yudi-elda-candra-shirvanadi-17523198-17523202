/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import javax.swing.JOptionPane;/* untuk menampilakan dialog dan di gunakan untuk mengambil input*/


public class JavaApplication5 {

   public static void main(String[]args)
{
System.out.println("Matriks A : \n");
int baris=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan Banyak Baris Untuk Matrik : "));/*mengambil input jumlah baris matriks */
int kolom=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan Banyak Kolom Untuk Matrik: "));/*mengambil input jumlah kolom matriks */
int A[][]=new int[baris][kolom];
for(int i=0;i<baris;i++)
{
System.out.print("|");
for(int j=0;j<kolom;j++)
{
A[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Nilai A Baris Ke-"+(i+1)+", KolomKe-"+(j+1)+" = "));/* mengambil input isi dari matrika A*/
System.out.print(" "+A[i][j]+" ");/* menampilkan bentuk matriks A*/
}
System.out.println("|");
}
System.out.println("\n");
System.out.println("Matriks B : \n");
int B[][]=new int[baris][kolom];
for(int i=0;i<baris;i++)
{
System.out.print("|");
for(int j=0;j<kolom;j++)
{
B[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Nilai B Baris Ke-"+(i+1)+", KolomKe-"+(j+1)+" = "));/* mengambil input isi dari matrika B*/
System.out.print(" "+B[i][j]+" ");/* menampilkan bentuk matriks B*/
}
System.out.println("|");
}
System.out.println("\n");
System.out.println("Operasi Matrik Penjumlahan :");

for(int i=0;i<baris;i++)/*pembentuk susunan baris*/
{
System.out.print("|");
for(int j=0;j<kolom;j++)/*pembentuk susunan kolom*/
{
System.out.print(" "+(A[i][j]+B[i][j])+" ");/*menampilkan hasil penjumlahan matriks A+B*/
}
System.out.println("|");
}
System.out.println("");
System.out.println("Operasi Matrik Pengurangan :");

for(int i=0;i<baris;i++)/*pembentuk susunan baris*/
{
System.out.print("|");
for(int j=0;j<kolom;j++)/*pembentuk susunan kolom*/
{
System.out.print(" "+(A[i][j]-B[i][j])+" ");/*menampilkan hasil pengurangan*/
}
System.out.println("|");
}
System.out.println("");
System.out.println("Operasi Perkalian Matriks A x Matriks B :");

for(int i=0;i<baris;i++)/*pembentuk susunan baris*/
{
System.out.print("|");
for(int j=0;j<kolom;j++)/*pembentuk susunan kolom*/
{
int x = (i+1)%baris;
int y = (j+1)%kolom;
if((y==0)&&(x==0))
{
System.out.print(" "+((A[i][j*0]*B[i*0][j])+(A[i][y+(kolom-1)]*B[x+(baris-1)][j]))+" ");
}
else if(y==0)
{
System.out.print(" "+((A[i][j*0]*B[i*0][j])+(A[i][y+(kolom-1)]*B[x][j]))+" ");
}
else if(x==0)
{
System.out.print(" "+((A[i][j*0]*B[i*0][j])+(A[i][y]*B[x+(baris-1)][j]))+" ");
}
else
{
System.out.print(" "+((A[i][j*0]*B[i*0][j])+(A[i][y]*B[x][j]))+" ");
}
}
System.out.println("|");
}
System.out.println("");
int skalara=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan Angka Skalar A: "));
System.out.println("Operasi Matrik Perkalian skalar A :");

for(int i=0;i<baris;i++)/*pembentuk susunan baris*/
{
System.out.print("|");
for(int j=0;j<kolom;j++)/*pembentuk susunan kolom*/
{
System.out.print(" "+(A[i][j]*skalara)+" ");/* operasi saat matriks di kalikan dengan skalar*/
}
System.out.println("|");
}
System.out.println("");

System.out.println("");
int skalarb=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan Angka Skalar B: "));
System.out.println("Operasi Matrik Perkalian skalar B :");

for(int i=0;i<baris;i++)/*pembentuk susunan baris*/
{
System.out.print("|");
for(int j=0;j<kolom;j++)/*pembentuk susunan kolom*/
{
System.out.print(" "+(B[i][j]*skalarb)+" ");
}
System.out.println("|");
}
System.out.println("");
}

}

