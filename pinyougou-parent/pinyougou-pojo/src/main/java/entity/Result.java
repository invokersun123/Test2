package entity;

import java.io.Serializable;

/**
 * 操作执行结果
 * @Auther: invokersun
 * @Date: 2019/3/21   19:28
 * @Desription:
 */
public class Result implements Serializable{
    private boolean isSuccess;
    private String resultMessage;

    public Result() {
    }

    public Result(boolean isSuccess, String resultMessage) {
        this.isSuccess = isSuccess;
        this.resultMessage = resultMessage;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

}
