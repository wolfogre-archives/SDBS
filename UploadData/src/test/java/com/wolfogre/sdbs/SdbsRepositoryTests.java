package com.wolfogre.sdbs;

import com.wolfogre.sdbs.dao.CnmrRepository;
import com.wolfogre.sdbs.dao.SdbsRepository;
import com.wolfogre.sdbs.domain.CnmrEntity;
import com.wolfogre.sdbs.domain.SdbsEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by wolfogre on 10/27/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SdbsRepositoryTests {
    @Autowired
    SdbsRepository sdbsRepository;

    @Autowired
    CnmrRepository cnmrRepository;

    @Test
    public void testConnection() {
        printlnAllGetter(sdbsRepository.findOne("57ca5d29104727198623aa13"));
        printlnAllGetter(cnmrRepository.findOne("57dfe8058342c66fe07bf665"));
    }

    private void printlnAllGetter(Object object) {
        Method[] cnmrEntityMethods = object.getClass().getMethods();
        for(Method m : cnmrEntityMethods)
            if(m.getName().contains("get")) {
                try {
                    System.out.println(object.getClass().getName() + "." + m.getName() + ":" + m.invoke(object));
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
    }
}
