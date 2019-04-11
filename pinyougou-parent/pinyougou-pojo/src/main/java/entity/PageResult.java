package entity;

import java.io.Serializable;
import java.util.List;

/**
 * 分页查询返回结果
 * @Auther: invokersun
 * @Date: 2019/3/20   20:21
 * @Desription:
 */
public class PageResult implements Serializable{
    private long totals;
    private List list;

    public PageResult() {
    }

    public PageResult(long totals, List list) {
        this.totals = totals;
        this.list = list;
    }

    public long getTotals() {
        return totals;
    }

    public void setTotals(long totals) {
        this.totals = totals;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
