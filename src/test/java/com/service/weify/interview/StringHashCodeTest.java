package com.service.weify.interview;

import cn.hutool.json.JSONObject;
import com.google.gson.Gson;
import com.service.weify.utils.FileUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Set;

@SpringBootTest
public class StringHashCodeTest {




    @Test
    public void testHashCode(){
        Set<String> wordSet = FileUtil.readWordList("D:\\code\\java\\weify\\src\\main\\java\\com\\service\\weify\\interview\\103976个英语单词库.txt");
        List<RateInfo> rateInfos = StringHashCode.collisionRateList(wordSet, 2, 3, 5, 7, 17,
                31, 32, 33, 39, 41, 199);

        Gson gson = new Gson();

        for (RateInfo rateInfo :
                rateInfos) {
            String s = gson.toJson(rateInfo);
            System.out.println(s);
        }
    }
}
