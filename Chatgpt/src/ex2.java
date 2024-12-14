import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ex2 
{
   public static void main(String[] args) 
   {
     String fileName = "test.txt"; // 測試檔案名稱（需放在專案目錄下）

     try (BufferedReader br = new BufferedReader(new FileReader(fileName))) 
     {
       int lineCount = 0;
       while (br.readLine() != null) 
       {
         lineCount++;
       }
       System.out.println("檔案 " + fileName + " 中共有 " + lineCount + " 行。");
     } 
     catch (IOException e) 
     {
       System.out.println("檔案讀取錯誤！");
       e.printStackTrace();
     }
   }
}


