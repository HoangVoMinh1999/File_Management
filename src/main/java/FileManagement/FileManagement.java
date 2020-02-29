/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileManagement;

import java.io.File;
import java.util.Scanner;
//import java.util.StringJoiner;

/**
 *
 * @author vomin
 */
public class FileManagement {

    private String pathFile;
    public Scanner scanner = new Scanner(System.in);

    //---Constructor & Getter Setter
    public FileManagement() {
    }

    public FileManagement(String pathFile) {
        this.pathFile = pathFile;
    }

    public String getPath() {
        return this.pathFile;
    }

    public void setPath(String Path) {
        this.pathFile = Path;
    }

    //---Create New Folder
    public void createNewFolder(String inputPath) {
        FileManagement file = new FileManagement();
        file.pathFile = inputPath;
        File apath = new File(file.pathFile);
        System.out.println(apath);
        if (!apath.exists()) {
            apath.mkdirs();
            System.out.println("Create new folder successfully !!!");
        } else {
            System.out.println("Folder exists !!!");
        }
    }

    public void deleteFile(String inputPath) {
        FileManagement file = new FileManagement();
        file.pathFile = inputPath;
        File apath = new File(file.pathFile);
        if (apath.exists()) {
            apath.delete();
            System.out.println("Delete file successfully !!!");
        } else {
            System.out.println("Folder not exists !!!");
        }
    }

    public String renameFile(String inputPath) {
        File srcFile = new File(inputPath);
        FileManagement file=new FileManagement();
        file.pathFile=inputPath;
        if (srcFile.exists()) {
            String[] arrayOfString = inputPath.split("/", 0);
            System.out.print("New file's name: ");
            String input = scanner.nextLine();
            arrayOfString[arrayOfString.length - 1] = input;
            String destPath = String.join("/", arrayOfString);
            System.out.println(destPath);
            File destFile = new File (destPath);
            srcFile.renameTo(destFile);
            file.pathFile=destPath;
            System.out.println(file.pathFile);
            System.out.println("Rename successfully !!!");
        }
        else{
            System.out.println("File not exist !!!");
        }
        return file.pathFile;
    }
}
