package njau.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.njau.dao.OrdersDao;
import com.njau.dao.UsersDao;
import com.njau.entity.Orders;
import com.njau.entity.Product;
import com.njau.entity.Users;
import com.njau.service.OrdersService;
import com.njau.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/7/241:02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestService {
    @Autowired
    private ProductService productService;

    @Autowired
    private OrdersService ordersService;

    @Autowired
    private OrdersDao ordersDao;

    @Autowired
    private UsersDao usersDao;



    @Test
    public void testfindOne(){
        Users byId = usersDao.findById(1);
        System.out.println(byId.getStatus());

    }

    @Test
    public void testfindOne1(){
        Users byId = usersDao.findById(1);
        System.out.println(byId.getUsername()+"--------------------username");
        System.out.println(byId.getRoles().size()+"--------------------Roles().size");
        System.out.println(byId.getRoles().get(1).getPermissions().size()+"--------------------getPermissions().size");

    }

    @Test
    public void test1() {
        List<Product> list = productService.list();
        for (Product product : list) {
            System.out.println(product);
        }
    }


    @Test
    public void testfindAll1(){
        Page<Orders> page = ordersService.findAllPage(new Page<Orders>(1,2));
        List<Orders> records = page.getRecords();
        for (Orders record : records) {
            System.out.println(record);
        }

    }

}
