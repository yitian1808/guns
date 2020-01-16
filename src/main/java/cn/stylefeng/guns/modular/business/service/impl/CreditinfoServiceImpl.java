package cn.stylefeng.guns.modular.business.service.impl;

import cn.stylefeng.guns.modular.system.model.Creditinfo;
import cn.stylefeng.guns.modular.system.dao.CreditinfoMapper;
import cn.stylefeng.guns.modular.business.service.ICreditinfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 信用信息表 服务实现类
 * </p>
 *
 * @author tangyansheng
 * @since 2020-01-16
 */
@Service
public class CreditinfoServiceImpl extends ServiceImpl<CreditinfoMapper, Creditinfo> implements ICreditinfoService {
    @Override
    public List<Creditinfo> selectCustomerList( HashMap<String, Object> mapParam) {
        return this.baseMapper.selectCreditList( mapParam);
    }
}
