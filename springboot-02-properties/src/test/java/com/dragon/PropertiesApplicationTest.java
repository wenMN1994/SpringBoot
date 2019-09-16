package com.dragon;

import com.dragon.domain.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot单元测试：
 * 在测试时，可以直接将对象注入到容器中使用
 *
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2019/9/16 14:04
 * @description：单元测试
 * @modified By：
 * @version: $
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesApplicationTest {
    @Autowired
    Emp emp;
    @Test
    public void contextLoads() {
        System.out.println(emp);
    }
}
