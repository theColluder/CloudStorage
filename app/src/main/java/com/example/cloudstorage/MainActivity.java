package com.example.cloudstorage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.io.File;

public class MainActivity extends AppCompatActivity {
    private CloudClass cloudStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализация CloudStorage
        cloudStorage = CloudClass.getInstance();
    }

    // Методы для взаимодействия с пользовательским интерфейсом

    public void onUploadButtonClick(View view) {
        // Обработка нажатия на кнопку загрузки файла
        // Пример: загрузка файла "example.txt"
        cloudStorage.uploadFile(new File("example.txt"));
    }

    public void onDownloadButtonClick(View view) {
        // Обработка нажатия на кнопку скачивания файла
        // Пример: скачивание файла с именем "example.txt"
        cloudStorage.downloadFile("example.txt");
    }

    public void onDeleteButtonClick(View view) {
        // Обработка нажатия на кнопку удаления файла
        // Пример: удаление файла с именем "example.txt"
        cloudStorage.deleteFile("example.txt");
    }

    public void onRenameButtonClick(View view) {
        // Обработка нажатия на кнопку удаления файла
        // Пример: удаление файла с именем "example.txt"
        cloudStorage.renameFile("example.txt", "example2");
    }

    public void onPreviewButtonClick(View view) {
        // Обработка нажатия на кнопку удаления файла
        // Пример: удаление файла с именем "example.txt"
        cloudStorage.previewFile("example.txt");
    }

    public void onCreateFolderButtonCLick(View view) {
        // Обработка нажатия на кнопку создания папки
        // Пример: удаление файла с именем "example.txt"
        cloudStorage.createFolder("example");
    }

    public void onDeleteFolderButtonCLick(View view) {
        // Обработка нажатия на кнопку создания папки
        // Пример: удаление файла с именем "example.txt"
        cloudStorage.deleteFolder("example");
    }

    public void onRenameFolderButtonCLick(View view) {
        // Обработка нажатия на кнопку переименования папки
        // Пример: удаление файла с именем "example.txt"
        cloudStorage.renameFolder("example", "example2");
    }
}
