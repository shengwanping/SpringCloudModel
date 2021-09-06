//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.demo.config;
import com.example.demo.enums.CodeEnum;
import com.example.demo.enums.CommonResponseEnum;

import java.io.Serializable;

public class RRException extends RuntimeException implements Serializable {
    private int code;
    private String msg;

    public RRException(CommonResponseEnum response) {
        super(response.message());
        this.code = response.code();
        this.msg = response.message();
    }

    public RRException(String message, CommonResponseEnum response) {
        super(message);
        this.code = response.code();
        this.msg = response.message();
    }

    public RRException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public RRException(String message) {
        super(message);
        this.code = CodeEnum.ERROR.code();
        this.msg = CodeEnum.ERROR.message();
    }

    public RRException(String msg, Throwable e) {
        super(msg, e);
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof RRException)) {
            return false;
        } else {
            RRException other = (RRException)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getCode() != other.getCode()) {
                return false;
            } else {
                Object this$msg = this.getMsg();
                Object other$msg = other.getMsg();
                if (this$msg == null) {
                    if (other$msg != null) {
                        return false;
                    }
                } else if (!this$msg.equals(other$msg)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof RRException;
    }


    @Override
    public String toString() {
        return "RRException(code=" + this.getCode() + ", msg=" + this.getMsg() + ")";
    }
}
