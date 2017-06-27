<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/5
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/include.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table id="orderDataGrid"></table>


<!-- datagrid 工具条 -->
<div id="tb">

    <a href="javascript:exportExcelZip()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">导出Excel压缩包</a>

</div>


<script type="application/javascript">
    var showItemDiv=null;
    function exportExcelZip() {
        location.href="<%=request.getContextPath()%>/order/exportExcelZip.ty"
    }
    

    <!--页面加载时 查询userlist集合 -->
    $(function() {
        $("#orderDataGrid").datagrid({
            url: '<%=request.getContextPath()%>/order/selectOrderList.ty',
            method: 'post',
            title: '列表展示',
            pagination: true,
            rownumbers: true,
            selectOnCheck: false,
            checkOnSelect: false,
            pageNumber: 1,
            pageSize: 8,
            pageList: [2, 4, 6, 8, 10],
            striped: true,
            rownumbers: true,
            pagination: true,
            singleSelect: true,
            sortName: 'id',
            sortOrder: 'desc',
            idField: 'id',
            loadMsg: '候着。。。',
            toolbar: '#tb',
            columns: [
                [
                    {field: '', checkbox: true, width: 120},
                    {field: 'orderId', title: '订单ID', width: 120, sortable: true},
                    {
                        field: 'payment', title: '实付价格', width: 120,
                        editor: {
                            type: 'validatebox',
                            options: {
                                required: true,
                            }
                        }
                    },
                    {
                        field: 'paymentType', title: '付款方式', width: 120,
                        formatter: function(value,row,index){
                            if (row.payWork){
                                return row.payWork.describe;
                            } else {
                                return "";
                            }
                        }
                    },
                    {
                        field: 'postFee', title: '邮费', width: 120,
                        editor: {
                            type: 'validatebox',
                            options: {
                                required: true,
                            }
                        }
                    },
                    {
                        field: 'describe', title: '状态', width: 120,
                        formatter: function(value,row,index){
                            if (row.staWork){
                                return row.staWork.describe;
                            } else {
                                return "";
                            }
                        }

                    },
                    {field: 'shippingName', title: '物流名称', width: 120},
                    {field: 'shippingCode', title: '物流单号', width: 120},
                    {field: 'userId', title: '用户id', width: 120},
                    {field: 'buyerMessage', title: '买家留言', width: 120,},
                    {field: 'buyerNick', title: '买家昵称', width: 120,},
                    {field: 'buyerRate', title: '买家是否已经评价', width: 120,},
                    {field: 'createTime', title: '订单创建时间', width: 120,
                        formatter: function (value, row, index) {
                            var unixTimestamp = new Date(value);
                            return unixTimestamp.toLocaleString();
                        },
                    },
                    {field: 'updateTime', title: '订单更新时间', width: 120,
                        formatter: function (value, row, index) {
                            var unixTimestamp = new Date(value);
                            return unixTimestamp.toLocaleString();
                        },
                    },
                    {field: 'paymentTime', title: '付款时间', width: 120,
                        formatter: function (value, row, index) {
                            var unixTimestamp = new Date(value);
                            return unixTimestamp.toLocaleString();
                        },
                    },
                    {field: 'consignTime', title: '发货时间', width: 120,
                        formatter: function (value, row, index) {
                            var unixTimestamp = new Date(value);
                            return unixTimestamp.toLocaleString();
                        },
                    },
                    {field: 'endTime', title: '交易完成时间', width: 120,
                        formatter: function (value, row, index) {
                            var unixTimestamp = new Date(value);
                            return unixTimestamp.toLocaleString();
                        },
                    },
                    {field: 'closeTime', title: '交易关闭时间', width: 120,
                        formatter: function (value, row, index) {
                            var unixTimestamp = new Date(value);
                            return unixTimestamp.toLocaleString();
                        },
                    },
                    {field: 'action', title: '操作', width: 120,
                        formatter: function(value,row,index) {
                            var str = "";
                            str += '<a href="javascript:selcteOrderItem(\'' + row.orderId + '\')" class="easyui-linkbutton" data-options="iconCls:icon-search">查看订单商品</a>'
                            return str;
                        }
                    }

                ]
            ],
            onEndEdit: function (index, row, changes) {
                //alert(row.uName);
                var rowStr = JSON.stringify(row);
                $.post(
                    '<%=request.getContextPath()%>/item/editorUpdate.ty',
                    {'rowStr': rowStr},
                    function (data) {
                        alert(data.msg)
                        $("#itemDataGrid").datagrid('reload');
                    },
                    'json'
                )
            }
        });
    });
    
    
    function selcteOrderItem(id) {
         showItemDiv=$("<div/>").dialog({
            title: '查看订单中的商品',
            width: 600,
            height: 400,
            closed: false,
            cache: false,
            href: '<%=request.getContextPath()%>/order/toOrderItem.ty?id='+id,
            modal: true,
            buttons:[{
                text:'关闭',
                handler:function(){
                    showItemDiv.dialog('destroy')
                }
            }],
            onClose:function () {
                showItemDiv.dialog('destroy')
            },

        })
    }
</script>
</body>
</html>
