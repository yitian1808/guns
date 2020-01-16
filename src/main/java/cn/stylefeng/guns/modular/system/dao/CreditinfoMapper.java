package cn.stylefeng.guns.modular.system.dao;

import cn.stylefeng.guns.modular.system.model.Creditinfo;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 信用信息表 Mapper 接口
 * </p>
 *
 * @author tangyansheng
 * @since 2020-01-16
 */
public interface CreditinfoMapper extends BaseMapper<Creditinfo> {
    List<Creditinfo> selectCreditList( @Param("item") HashMap<String, Object> mapParam);
}
