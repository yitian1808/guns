/**
 * 信用信息管理初始化
 */
var Creditinfo = {
    id: "CreditinfoTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
Creditinfo.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
            {title: '主键id', field: 'id', visible: false, align: 'center', valign: 'middle'},
            {title: '企业名称', field: 'qiyename', visible: true, align: 'center', valign: 'middle'},
            {title: '经营状态', field: 'jingyingstatus', visible: true, align: 'center', valign: 'middle'},
            {title: '法定代表人', field: 'faren', visible: false, align: 'center', valign: 'middle'},
            {title: '注册资本', field: 'zhucejiben', visible: false, align: 'center', valign: 'middle'},
            {title: '成立日期', field: 'createtime', visible: true, align: 'center', valign: 'middle'},
            {title: '所属省份', field: 'provice', visible: true, align: 'center', valign: 'middle'},
            {title: '所属城市', field: 'city', visible: true, align: 'center', valign: 'middle'},
            {title: '电话', field: 'tel', visible: true, align: 'center', valign: 'middle'},
            {title: '更多电话', field: 'moretel', visible: false, align: 'center', valign: 'middle'},
            {title: '邮箱', field: 'email', visible: false, align: 'center', valign: 'middle'},
            {title: '统一社会信用代码', field: 'xinyongcode', visible: false, align: 'center', valign: 'middle'},
            {title: '纳税人识别号', field: 'nashuicode', visible: false, align: 'center', valign: 'middle'},
            {title: '注册号', field: 'zhucecode', visible: false, align: 'center', valign: 'middle'},
            {title: '组织机构代码', field: 'zhuzhijigoucode', visible: false, align: 'center', valign: 'middle'},
            {title: '参保人數', field: 'canbaonumber', visible: false, align: 'center', valign: 'middle'},
            {title: '企业类型', field: 'qiyetype', visible: false, align: 'center', valign: 'middle'},
            {title: '所属行业', field: 'hangye', visible: true, align: 'center', valign: 'middle'},
            {title: '网址', field: 'site', visible: false, align: 'center', valign: 'middle'},
            {title: '企业地址', field: 'qiyedizhi', visible: true, align: 'center', valign: 'middle'},
            {title: '经营范围', field: 'jingyingfanwei', visible: false, align: 'center', valign: 'middle'}
    ];
};

/**
 * 检查是否选中
 */
Creditinfo.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        Creditinfo.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加信用信息
 */
Creditinfo.openAddCreditinfo = function () {
    var index = layer.open({
        type: 2,
        title: '添加信用信息',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/creditinfo/creditinfo_add'
    });
    this.layerIndex = index;
};


/**
 * 打开查看信用信息详情
 */
Creditinfo.openCreditinfoDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '信用信息详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/creditinfo/creditinfo_update/' + Creditinfo.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除信用信息
 */
Creditinfo.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/creditinfo/delete", function (data) {
            Feng.success("删除成功!");
            Creditinfo.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("creditinfoId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询信用信息列表
 */
Creditinfo.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    Creditinfo.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = Creditinfo.initColumn();
    var table = new BSTable(Creditinfo.id, "/creditinfo/list", defaultColunms);
    table.setPaginationType("client");
    Creditinfo.table = table.init();
});
