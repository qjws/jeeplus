package com.jeeplus.weixin.api.core.req.model.interfacesummary;

import com.jeeplus.weixin.api.core.annotation.ReqType;
import com.jeeplus.weixin.api.core.req.model.WeixinReqParam;

/**
 * 参数类--获取接口分析数据
 * Created by yuzp17311 on 2016/8/22.
 */
@ReqType("getinterfacesummary")
public class InterfaceSummaryParam extends WeixinReqParam {
    // 开始时间
    private String begin_date = null;

    // 结束时间
    private String end_date = null;

    public String getBegin_date() {
        return begin_date;
    }

    public void setBegin_date(String begin_date) {
        this.begin_date = begin_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }
}