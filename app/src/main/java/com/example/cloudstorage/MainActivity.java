package com.example.cloudstorage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import java.io.File;



public class MainActivity extends AppCompatActivity {
    private CloudClass cloudStorage;
    private static final String TAG = "MainActivity"; // Тег для отладочных логов

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализация CloudStorage
        cloudStorage = CloudClass.getInstance();
    }

    // Методы для взаимодействия с пользовательским интерфейсом

    public void onUploadButtonClick(View view) {
        Log.d(TAG, "Нажата кнопка загрузки файла");
        // Обработка нажатия на кнопку загрузки файла
        // Пример: загрузка файла "example.txt"
        cloudStorage.uploadFile(new File("example.txt"));
    }

    public void onDownloadButtonClick(View view) {
        Log.d(TAG, "Нажата кнопка скачивания файла");
        // Обработка нажатия на кнопку скачивания файла
        // Пример: скачивание файла с именем "example.txt"
        cloudStorage.downloadFile("example.txt");
    }

    public void onDeleteButtonClick(View view) {
        Log.d(TAG, "Нажата кнопка удаления файла");
        // Обработка нажатия на кнопку удаления файла
        // Пример: удаление файла с именем "example.txt"
        cloudStorage.deleteFile("example.txt");
    }

    public void onRenameButtonClick(View view) {
        Log.d(TAG, "Нажата кнопка переименования файла");
        // Обработка нажатия на кнопку переименования файла
        // Пример: переименование файла "example.txt" в "example2.txt"
        cloudStorage.renameFile("example.txt", "example2.txt");
    }

    public void onPreviewButtonClick(View view) {
        Log.d(TAG, "Нажата кнопка предпросмотра файла");
        // Обработка нажатия на кнопку предпросмотра файла
        // Пример: предпросмотр файла "example.txt"
        cloudStorage.previewFile("example.txt");
    }

    public void onCreateFolderButtonCLick(View view) {
        Log.d(TAG, "Нажата кнопка создания папки");
        // Обработка нажатия на кнопку создания папки
        // Пример: создание папки "example"
        cloudStorage.createFolder("example");
    }

    public void onDeleteFolderButtonCLick(View view) {
        Log.d(TAG, "Нажата кнопка удаления папки");
        // Обработка нажатия на кнопку удаления папки
        // Пример: удаление папки "example"
        cloudStorage.deleteFolder("example");
    }

    public void onRenameFolderButtonCLick(View view) {
        Log.d(TAG, "Нажата кнопка переименования папки");
        // Обработка нажатия на кнопку переименования папки
        // Пример: переименование папки "example" в "example2"
        cloudStorage.renameFolder("example", "example2");
    }
}