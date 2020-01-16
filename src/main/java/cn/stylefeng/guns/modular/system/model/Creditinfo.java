package cn.stylefeng.guns.modular.system.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 信用信息表
 * </p>
 *
 * @author tangyansheng
 * @since 2020-01-16
 */
@TableName("creditinfo")
public class Creditinfo extends Model<Creditinfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 企业名称
     */
    private String qiyename;
    /**
     * 经营状态
     */
    private String jingyingstatus;
    /**
     * 法定代表人
     */
    private String faren;
    /**
     * 注册资本
     */
    private String zhucejiben;
    /**
     * 成立日期
     */
    private Date createtime;
    /**
     * 所属省份
     */
    private String provice;
    /**
     * 所属城市
     */
    private String city;
    /**
     * 电话
     */
    private String tel;
    /**
     * 更多电话
     */
    private String moretel;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 统一社会信用代码
     */
    private String xinyongcode;
    /**
     * 纳税人识别号
     */
    private String nashuicode;
    /**
     * 注册号
     */
    private String zhucecode;
    /**
     * 组织机构代码
     */
    private String zhuzhijigoucode;
    /**
     * 参保人數
     */
    private Integer canbaonumber;
    /**
     * 企业类型
     */
    private String qiyetype;
    /**
     * 所属行业
     */
    private String hangye;
    /**
     * 网址
     */
    private String site;
    /**
     * 企业地址
     */
    private String qiyedizhi;
    /**
     * 经营范围
     */
    private String jingyingfanwei;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQiyename() {
        return qiyename;
    }

    public void setQiyename(String qiyename) {
        this.qiyename = qiyename;
    }

    public String getJingyingstatus() {
        return jingyingstatus;
    }

    public void setJingyingstatus(String jingyingstatus) {
        this.jingyingstatus = jingyingstatus;
    }

    public String getFaren() {
        return faren;
    }

    public void setFaren(String faren) {
        this.faren = faren;
    }

    public String getZhucejiben() {
        return zhucejiben;
    }

    public void setZhucejiben(String zhucejiben) {
        this.zhucejiben = zhucejiben;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getProvice() {
        return provice;
    }

    public void setProvice(String provice) {
        this.provice = provice;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMoretel() {
        return moretel;
    }

    public void setMoretel(String moretel) {
        this.moretel = moretel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getXinyongcode() {
        return xinyongcode;
    }

    public void setXinyongcode(String xinyongcode) {
        this.xinyongcode = xinyongcode;
    }

    public String getNashuicode() {
        return nashuicode;
    }

    public void setNashuicode(String nashuicode) {
        this.nashuicode = nashuicode;
    }

    public String getZhucecode() {
        return zhucecode;
    }

    public void setZhucecode(String zhucecode) {
        this.zhucecode = zhucecode;
    }

    public String getZhuzhijigoucode() {
        return zhuzhijigoucode;
    }

    public void setZhuzhijigoucode(String zhuzhijigoucode) {
        this.zhuzhijigoucode = zhuzhijigoucode;
    }

    public Integer getCanbaonumber() {
        return canbaonumber;
    }

    public void setCanbaonumber(Integer canbaonumber) {
        this.canbaonumber = canbaonumber;
    }

    public String getQiyetype() {
        return qiyetype;
    }

    public void setQiyetype(String qiyetype) {
        this.qiyetype = qiyetype;
    }

    public String getHangye() {
        return hangye;
    }

    public void setHangye(String hangye) {
        this.hangye = hangye;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getQiyedizhi() {
        return qiyedizhi;
    }

    public void setQiyedizhi(String qiyedizhi) {
        this.qiyedizhi = qiyedizhi;
    }

    public String getJingyingfanwei() {
        return jingyingfanwei;
    }

    public void setJingyingfanwei(String jingyingfanwei) {
        this.jingyingfanwei = jingyingfanwei;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Creditinfo{" +
        ", id=" + id +
        ", qiyename=" + qiyename +
        ", jingyingstatus=" + jingyingstatus +
        ", faren=" + faren +
        ", zhucejiben=" + zhucejiben +
        ", createtime=" + createtime +
        ", provice=" + provice +
        ", city=" + city +
        ", tel=" + tel +
        ", moretel=" + moretel +
        ", email=" + email +
        ", xinyongcode=" + xinyongcode +
        ", nashuicode=" + nashuicode +
        ", zhucecode=" + zhucecode +
        ", zhuzhijigoucode=" + zhuzhijigoucode +
        ", canbaonumber=" + canbaonumber +
        ", qiyetype=" + qiyetype +
        ", hangye=" + hangye +
        ", site=" + site +
        ", qiyedizhi=" + qiyedizhi +
        ", jingyingfanwei=" + jingyingfanwei +
        "}";
    }
}
