package com.example.cloudstorage;

import android.util.Log;
import java.io.File;


public class CloudClass {
    private static CloudClass instance;
    private CloudProvider cloudProvider;
    private static final String TAG = "CloudClass"; // Тег для отладочных логов

    // Приватный конструктор для реализации синглтона
    private CloudClass() {
        // Инициализация облачного провайдера
        cloudProvider = new CloudProvider();
    }

    public static CloudClass getInstance() {
        if (instance == null) {
            instance = new CloudClass();
        }
        return instance;
    }

    public void uploadFile(File file) {
        Log.d(TAG, "Загрузка файла: " + file.getName());
        cloudProvider.uploadFile(file);
    }

    public void downloadFile(String fileName) {
        Log.d(TAG, "Скачивание файла: " + fileName);
        cloudProvider.downloadFile(fileName);
    }

    public void deleteFile(String fileName) {
        Log.d(TAG, "Удаление файла: " + fileName);
        cloudProvider.deleteFile(fileName);
    }

    public void renameFile(String oldFileName, String newFileName){
        Log.d(TAG, "Переименование файла: " + oldFileName + " в " + newFileName);
        cloudProvider.renameFile(oldFileName, newFileName);
    }

    public void previewFile(String fileName){
        Log.d(TAG, "Предпросмотр файла: " + fileName);
        cloudProvider.previewFile(fileName);
    }

    public void createFolder(String folderName) {
        Log.d(TAG, "Создание папки: " + folderName);
        cloudProvider.createFolder(folderName);
    }

    public void deleteFolder(String folderName) {
        Log.d(TAG, "Удаление папки: " + folderName);
        cloudProvider.deleteFolder(folderName);
    }

    public void renameFolder(String oldFolderName, String newFolderName) {
        Log.d(TAG, "Переименование папки: " + oldFolderName + " в " + newFolderName);
        cloudProvider.renameFolder(oldFolderName, newFolderName);
    }
}
