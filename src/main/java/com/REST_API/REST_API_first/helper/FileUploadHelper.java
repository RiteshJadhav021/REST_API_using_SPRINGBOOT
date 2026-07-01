package com.REST_API.REST_API_first.helper;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

@Component
public class FileUploadHelper {
    public final String UPLOAD_DIR="D:\\SpringBoot_learn\\REST_API_first\\src\\main\\resources\\static\\Images";

    public boolean uploadFile(MultipartFile file){
        boolean f=false;

       try {
          InputStream is= file.getInputStream();
          byte data[]=new byte[is.available()];
          is.read(data);

          //write
           FileOutputStream fos=new FileOutputStream(UPLOAD_DIR+File.separator+file.getOriginalFilename());
           fos.write(data);
           fos.flush();
           fos.close();

           f=true;
       }
       catch (Exception e){
           e.getMessage();
       }
        return  f;
    }
}
