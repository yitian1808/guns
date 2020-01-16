package cn.stylefeng.guns.modular.business.controller;

import cn.stylefeng.roses.core.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import cn.stylefeng.guns.core.log.LogObjectHolder;
import org.springframework.web.bind.annotation.RequestParam;
import cn.stylefeng.guns.modular.system.model.Creditinfo;
import cn.stylefeng.guns.modular.business.service.ICreditinfoService;

import java.util.HashMap;

/**
 * 信用信息控制器
 *
 * @author fengshuonan
 * @Date 2020-01-16 14:09:47
 */
@Controller
@RequestMapping("/creditinfo")
public class CreditinfoController extends BaseController {

    private String PREFIX = "/business/creditinfo/";

    @Autowired
    private ICreditinfoService creditinfoService;

    /**
     * 跳转到信用信息首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "creditinfo.html";
    }

    /**
     * 跳转到添加信用信息
     */
    @RequestMapping("/creditinfo_add")
    public String creditinfoAdd() {
        return PREFIX + "creditinfo_add.html";
    }

    /**
     * 跳转到修改信用信息
     */
    @RequestMapping("/creditinfo_update/{creditinfoId}")
    public String creditinfoUpdate(@PathVariable Integer creditinfoId, Model model) {
        Creditinfo creditinfo = creditinfoService.selectById(creditinfoId);
        model.addAttribute("item",creditinfo);
        LogObjectHolder.me().set(creditinfo);
        return PREFIX + "creditinfo_edit.html";
    }

    /**
     * 获取信用信息列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        HashMap<String,Object> mapParam = new HashMap<String,Object>();
        mapParam.put("condition",condition);
        return creditinfoService.selectCustomerList(mapParam);
    }

    /**
     * 新增信用信息
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(Creditinfo creditinfo) {
        creditinfoService.insert(creditinfo);
        return SUCCESS_TIP;
    }

    /**
     * 删除信用信息
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer creditinfoId) {
        creditinfoService.deleteById(creditinfoId);
        return SUCCESS_TIP;
    }

    /**
     * 修改信用信息
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(Creditinfo creditinfo) {
        creditinfoService.updateById(creditinfo);
        return SUCCESS_TIP;
    }

    /**
     * 信用信息详情
     */
    @RequestMapping(value = "/detail/{creditinfoId}")
    @ResponseBody
    public Object detail(@PathVariable("creditinfoId") Integer creditinfoId) {
        return creditinfoService.selectById(creditinfoId);
    }
}
