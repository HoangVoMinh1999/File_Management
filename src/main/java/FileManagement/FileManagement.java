/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileManagement;

import java.io.File;
import java.util.Scanner;
/**
 *
 * @author vomin
 */
public class FileManagement {
    
    public static Scanner scanner = new Scanner(System.in);
    private String pathFile;
    //---Constructor & Getter Setter
    public FileManagement(){
    }
    public FileManagement(String pathFile){
        this.pathFile=pathFile;
    }
    public String getPath(){
        return this.pathFile;
    }
    public void setPath(String Path){
        this.pathFile=Path;
    }
    //---Create New Folder
    public void createNewFolder() {
        FileManagement file = new FileManagement();
        file.pathFile=file.inputPath();
        System.out.println(file.pathFile);
        File apath = new File(file.pathFile);
        System.out.println(apath);
        if (!apath.exists()){
            apath.mkdirs();
            System.out.println("Create new folder successfully !!!");
        }
        else{
            System.out.println("Folder exists !!!");
        }
    }
    //---Private
    private String inputPath(){
        System.out.print("Input the File Path : ");
        return scanner.nextLine();
    }
}
