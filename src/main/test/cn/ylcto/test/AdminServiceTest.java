package cn.ylcto.test;

import cn.ylcto.student.service.IAdminService;
import cn.ylcto.student.vo.Admin;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/**
 * Created by jigao on 2018/2/27.
 */
public class AdminServiceTest {
    @Resource
    private static ApplicationContext ctx;
    private static IAdminService  adminService;

    static{
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        adminService = ctx.getBean("adminServiceImpl",IAdminService.class);
    }
    @Test
    public void login() throws Exception {
        Admin admin = new Admin();
        admin.setEmail("ylcto@163.com");
        admin.setPassword("22BB09850349B763292456715CC5E25F");
       // TestCase.assertTrue(this.adminService.login(admin));
        Admin databaseAdmin = this.adminService.login(admin);

        System.out.println(databaseAdmin);
        System.out.println(databaseAdmin .getEmail());
        System.out.println(databaseAdmin.getPassword());
        System.out.println(databaseAdmin.getLastdate());
    }
}
