import com.aos.mapper.SysUserMapper;
import com.aos.pojo.SysUser;
import com.aos.pojo.SysUserExample;
import com.aos.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author：bingfeng
 * @Date：2024/11/24 10:31
 */
public class generatorMethodTest {
    @Test
    public void insertTest(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        SysUserMapper mapper=sqlSession.getMapper(SysUserMapper.class);
        SysUser user=new SysUser("a",null,"email","186xxxxxxxx","acc_dept","role",1,"李四");
        mapper.insert(user);
    }

    @Test
    public void selectByPrimaryKeyTest(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        SysUserMapper mapper=sqlSession.getMapper(SysUserMapper.class);
        SysUser user=mapper.selectByPrimaryKey(1);
        System.out.println(user);
    }

    @Test
    public void selectByExampleTest(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        SysUserMapper mapper=sqlSession.getMapper(SysUserMapper.class);
        SysUserExample sysUserExample=new SysUserExample();
        sysUserExample.createCriteria().andUserNameEqualTo("张三").andEmailEqualTo("email");//SQL图形界面的操作他都有
        sysUserExample.or().andPhoneEqualTo("177xxxxxxxx");//与上面的条件形成or的关系
        List<SysUser> list = mapper.selectByExample(sysUserExample);
        list.forEach(System.out::println);
    }

    @Test
    public void updateByPrimaryKeyTest() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
        SysUser sysuser = new SysUser(null,1,"email", "133xxxxxxxx", null, null, null, "李四");
//普通修改
//        mapper.updateByPrimaryKey(sysuser);//实体类默认是null将表里的属性也改成null,即将age,dept_id都改成null
//选择性修改
        mapper.updateByPrimaryKeySelective(sysuser);///实体类是null的，表里的属性值不改动
    }



}
