package serializer.imp;

import com.alibaba.fastjson.JSON;
import serializer.Serializer;
import serializer.SerializerAlgorithm;

/**
 * @author DengWei
 * @date 2019/12/6 15:32
 */
public class JSONSerializer implements Serializer {

    public byte getSerializerAlgoritm() {
        return SerializerAlgorithm.JSON;
    }

    public byte[] serialize(Object object) {
        return JSON.toJSONBytes(object);
    }

    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        return JSON.parseObject(bytes, clazz);
    }
}
