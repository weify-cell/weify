package com.service.weify.controller;


import com.service.weify.service.HelloService;
import com.service.weify.utils.Result;


import com.service.weify.utils.ResultEnum;
import com.service.weify.utils.ResultUtil;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("hello")
public class HelloController {
    Logger logger = LoggerFactory.getLogger(HelloController.class);


    @Autowired
    private HelloService helloService;

    @GetMapping("world")
    public Result hello(){
        try{
            logger.info("访问hello/world接口成功");
            return ResultUtil.success(ResultEnum.OPERATE_SUCCESS,helloService.getExample3());
        }catch (Exception e){
            logger.error("/hello/world异常",e);
            return ResultUtil.failure();
        }
    }




    @GetMapping("sand")
    public String hello2(){
        try{
            logger.info("访问hello/world接口成功");
            return "before1";
        }catch (Exception e){
            logger.error("/hello/world异常",e);
            return "before2";
        }
    }

    @GetMapping("world2")
    public Result getMsg(){
        try{
            logger.info("访问hello/world2接口成功");
            return ResultUtil.success(ResultEnum.OPERATE_SUCCESS,"qwdrwefgrte");
        }catch (Exception e){
            logger.error("/hello/world异常",e);
            return ResultUtil.failure();
        }
    }


    @GetMapping("order")
    public Result myLove(){
        try{
            logger.info("访问hello/world2接口成功");
            return ResultUtil.success(ResultEnum.OPERATE_SUCCESS,helloService.getExample1());
        }catch (Exception e){
            logger.error("/hello/world异常",e);
            return ResultUtil.failure();
        }
    }


    @PostMapping("getFile")
    public String getFile(@RequestParam(value="file",required = true)MultipartFile file,String jsonstr){
        try{
            multipartFileToFile(file);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "success";
    }

    public File multipartFileToFile(MultipartFile file) throws Exception {
        File toFile = null;
        if (file.equals("") || file.getSize() <= 0) {
            file = null;
        } else {
            InputStream ins = null;
            ins = file.getInputStream();
            toFile = new File(file.getOriginalFilename());
            inputStreamToFile(ins, toFile);
            ins.close();
        }
        return toFile;

    }



    private static void inputStreamToFile(InputStream ins, File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.close();
            ins.close();
        } catch (Exception e) {
        }
    }

}
