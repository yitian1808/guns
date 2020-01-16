package cn.stylefeng.guns.modular.business.service;

import cn.stylefeng.guns.modular.system.model.Creditinfo;
import com.baomidou.mybatisplus.service.IService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 信用信息表 服务类
 * </p>
 *
 * @author tangyansheng
 * @since 2020-01-16
 */
public interface ICreditinfoService extends IService<Creditinfo> {
    List<Creditinfo> selectCustomerList(HashMap<String, Object> mapParam);
}
