import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

class P36
{
  public static void main(String[]args)
  {
	try
	{
	  BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
	  
	  String str1=br.readLine();
	  String str2=br.readLine();
	  
	  System.out.println("寫入到檔案中的兩個字串是");
	  System.out.println(str1);
	  System.out.println(str2);
	  
	  br.close();
	}
	catch(IOException e)
	{
		System.out.println("輸出入錯誤");
	}
  }
}
