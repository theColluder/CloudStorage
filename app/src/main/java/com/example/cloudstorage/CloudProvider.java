package com.example.cloudstorage;
import java.io.File;

public class CloudProvider {

    // Здесь можно использовать конкретный облачный провайдер, такой как AWS, Google Cloud, Dropbox и т. д.

    protected void uploadFile(File file) {
        // Загрузка файла в облачное хранилище
    }

    protected void downloadFile(String fileName) {
        // Скачивание файла из облачного хранилища
    }

    protected void deleteFile(String fileName) {
        // Удаление файла из облачного хранилища
    }

    protected void renameFile(String oldFileName, String newFileName){
        //переименование файла
    }

    protected void previewFile(String fileName){
        //предпросотр файла
    }

    protected void creteFolder(String folderName) {
            // создать папку облачного хранилища
    }

    protected void deleteFolder(String folderName) {
        // создать папку облачного хранилища
    }

    protected void renameFolder(String oldFolderName, String newFolderName) {
        // переименовать папку облачного хранилища
    }


}