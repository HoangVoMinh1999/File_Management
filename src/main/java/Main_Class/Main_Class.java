/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;
import FileManagement.FileManagement;
//---Import class java
import java.util.Scanner;
/**
 *
 * @author vomin
 */
public class Main_Class {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] agrs){
        boolean isExisted = false;
        FileManagement file = new FileManagement();
        String inputPath = inputPath();
        file.setPath(inputPath);
        while(!isExisted){
            int choice = Choices();
            switch(choice){
                case 1:
                    file.getPath();
                case 2:
                    file.createNewFolder(file.getPath());
                    break;
                case 3:
                    file.deleteFile(file.getPath());
                    break;
                case 4:
                    String newPath=file.renameFile(file.getPath());
                    file.setPath(newPath);
                    break;
                case 0:
                    isExisted=true;
                    break;
                default:
                    System.out.print("Khong co lenh thich hop");
            }
        }
        
        
    }
    //---Private methods
    private static String inputPath(){
        System.out.print("Nhap duong dan thu muc: ");
        return scanner.nextLine();
    }
    private static int Choices(){
        System.out.println("//-------------//");
        System.out.println("1/-Xem duong dan");
        System.out.println("2/-Tao file moi");
        System.out.println("3/-Xoa file");
        System.out.println("4/-Doi ten thu muc");
        System.out.println("0/-Thoat chuong trinh");
        System.out.print("Nhap lua chon muon thuc hien: ");
        return scanner.nextInt();
    }
}
