/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;

import FileManagement.FolderManagement;
//---Import class java
import java.util.Scanner;

/**
 *
 * @author vomin
 */
public class Main_Class {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] agrs) {
        boolean isExisted = false;
        while (!isExisted) {
            String input = inputPath();
            int choice = Choices();
            switch (choice) {
                case 1:
                    ProcessOfFolder(input);
                    break;
                case 2:
                    ChoicesOfFile();
                    break;
                case 0:
                    isExisted = true;
                default:
                    System.out.println("No option available");
            }
        }
    }

    //---Private methods
    private static String inputPath() {
        System.out.print("Please input path: ");
        return scanner.nextLine();
    }

    private static int Choices() {
        System.out.println("//---OPTION---//");
        System.out.println("1/-Folder");
        System.out.println("2/-File");
        System.out.println("0/-Thoat chuong trinh");
        System.out.print("Nhap lua chon muon thuc hien: ");
        return scanner.nextInt();
    }

    private static int ChoicesOfFolder() {
        System.out.println("//---FOLDER---//");
        System.out.println("1/-Tao folder moi");
        System.out.println("2/-Xoa folder");
        System.out.println("3/-Doi ten folder");
        System.out.println("4/-Copy folder");
        System.out.println("0/-Quay lai");
        System.out.print("Nhap lua chon muon thuc hien: ");
        return scanner.nextInt();
    }

    private static int ChoicesOfFile() {
        System.out.println("//---FILE---//");
        System.out.println("1/-Tao file moi");
        System.out.println("2/-Xoa file");
        System.out.println("3/-Doi ten file");
        System.out.print("Nhap lua chon muon thuc hien: ");
        return scanner.nextInt();
    }

    private static void ProcessOfFolder(String inputPath) {
        FolderManagement folder = new FolderManagement();
        String new_path;
        folder.setPath(inputPath);
        boolean isExisted = false;
        while (!isExisted) {
            int choice = ChoicesOfFolder();
            switch (choice) {
                case 1:
                    new_path = folder.createNewFolder(folder.getPath());
                    folder.setPath(new_path);
                    break;
                case 2:
                    folder.deleteFolder(folder.getPath());
                    break;
                case 3:
                    new_path = folder.renameFolder(folder.getPath());
                    folder.setPath(new_path);
                    break;
                case 4:
                    break;
                case 0:
                    isExisted = true;
                    break;
                default:
                    System.out.println("No option available !!!");
            }
        }
    }
}
