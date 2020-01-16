/**
 * 初始化信用信息详情对话框
 */
var CreditinfoInfoDlg = {
    creditinfoInfoData : {}
};

/**
 * 清除数据
 */
CreditinfoInfoDlg.clearData = function() {
    this.creditinfoInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
CreditinfoInfoDlg.set = function(key, val) {
    this.creditinfoInfoData[key] = (typeof val == "undefined") ? $("#" + key).val() : val;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
CreditinfoInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
CreditinfoInfoDlg.close = function() {
    parent.layer.close(window.parent.Creditinfo.layerIndex);
}

/**
 * 收集数据
 */
CreditinfoInfoDlg.collectData = function() {
    this
    .set('id')
    .set('qiyename')
    .set('jingyingstatus')
    .set('faren')
    .set('zhucejiben')
    .set('createtime')
    .set('provice')
    .set('city')
    .set('tel')
    .set('moretel')
    .set('email')
    .set('xinyongcode')
    .set('nashuicode')
    .set('zhucecode')
    .set('zhuzhijigoucode')
    .set('canbaonumber')
    .set('qiyetype')
    .set('hangye')
    .set('site')
    .set('qiyedizhi')
    .set('jingyingfanwei');
}

/**
 * 提交添加
 */
CreditinfoInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/creditinfo/add", function(data){
        Feng.success("添加成功!");
        window.parent.Creditinfo.table.refresh();
        CreditinfoInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.creditinfoInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
CreditinfoInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/creditinfo/update", function(data){
        Feng.success("修改成功!");
        window.parent.Creditinfo.table.refresh();
        CreditinfoInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.creditinfoInfoData);
    ajax.start();
}

$(function() {

});
