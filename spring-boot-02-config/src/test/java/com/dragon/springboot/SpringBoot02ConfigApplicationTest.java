package com.dragon.springboot;

import com.dragon.springboot.bean.Emp;
import com.dragon.springboot.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
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
public class SpringBoot02ConfigApplicationTest {
    @Autowired
    Emp emp;

    @Autowired
    ApplicationContext context;

    @Test
    public void testXml() {
//        EmpService empService = (EmpService) context.getBean("empService");
//        System.out.println(empService);
//        empService.add();

        EmpService empService2 = (EmpService)context.getBean("empService2");
        System.out.println("empService2: " + empService2);
    }

    @Test
    public void contextLoads() {
        System.out.println(emp);
    }
}
