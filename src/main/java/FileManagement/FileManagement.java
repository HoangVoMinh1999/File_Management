/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileManagement;

import java.io.File;

/**
 *
 * @author vomin
 */
public class FileManagement {
    private String pathFile;

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
        if (apath.exists()){
            apath.delete();
            System.out.println("Delete file successfully !!!");
        }
        else{
            System.out.println("Folder not exists !!!");
        }
    }

}
