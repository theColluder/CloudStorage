package com.example.cloudstorage;

import java.io.File;

public class CloudClass {
    private static CloudClass instance;
    private CloudProvider cloudProvider;

    // Приватный конструктор для реализации синглтона
    protected CloudClass() {
        // Инициализация облачного провайдера
        cloudProvider = new CloudProvider();
    }

    protected static CloudClass getInstance() {
        if (instance == null) {
            instance = new CloudClass();
        }
        return instance;
    }

    protected void uploadFile(File file) {
        cloudProvider.uploadFile(file);
    }

    protected void downloadFile(String fileName) {
        cloudProvider.downloadFile(fileName);
    }

    protected void deleteFile(String fileName) {
        cloudProvider.deleteFile(fileName);
    }

    protected void renameFile(String oldFileName, String newFileName){
        cloudProvider.renameFile(oldFileName, newFileName);
    }

    protected void previewFile(String fileName){
        cloudProvider.previewFile(fileName);
    }

    protected void createFolder(String folderName) {
        cloudProvider.creteFolder(folderName);
    }

    protected void deleteFolder(String folderName) {
        cloudProvider.deleteFolder(folderName);
    }

    protected void renameFolder(String oldFolderName, String newFolderName) {
        cloudProvider.renameFolder(oldFolderName, newFolderName);
    }
}