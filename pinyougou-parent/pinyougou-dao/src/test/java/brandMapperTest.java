import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Auther: invokersun
 * @Date: 2019/1/17   20:10
 * @Desription:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class brandMapperTest {
    @Autowired
    TbBrandMapper brandMapper;
    @Test
    public void t1(){
        List<TbBrand> list = brandMapper.selectByExample(null);
        System.out.println(list);
    }
}
