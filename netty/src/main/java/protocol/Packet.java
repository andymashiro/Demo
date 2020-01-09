package protocol;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author DengWei
 * @date 2019/12/6 15:42
 */
@Data
public abstract class Packet {

    /**
     * 协议版本
     */
    @JSONField(deserialize = false, serialize = false)
    private Byte version = 1;

    @JSONField(serialize = false)
    public abstract Byte getCommand();
}
