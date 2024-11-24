import com.aos.mapper.SysUserMapper;
import com.aos.pojo.SysUser;
import com.aos.utils.SqlSessionUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author：bingfeng
 * @Date：2024/11/24 10:28
 */
public class pagehelperTest {
    @Test
    public void pagehelperTest(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        SysUserMapper mapper=sqlSession.getMapper(SysUserMapper.class);
        //查询功能之前先开启分页功能
        PageHelper.startPage(1,4); //pagenum=1,pagesize=4
        List<SysUser> list=mapper.selectByExample(null);//查询所有数据
        list.forEach(System.out::println);
        Page<Object> page=PageHelper.startPage(1,4); //pagenum=1,pagesize=4
        //查询功能之后可以获取分页相关的所有数据
        PageInfo<SysUser> pageInfo = new PageInfo<>(list,5);//navigatePages=5即导航分页页码数显示数量为5
        System.out.println(pageInfo);
    }

}
