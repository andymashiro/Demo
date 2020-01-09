package serializer;

import serializer.imp.JSONSerializer;

/**
 * @author DengWei
 * @date 2019/12/6 15:23
 */
public interface Serializer {


    /**
     * 默认序列化算法
     */
    Serializer DEFAULT = new JSONSerializer();
    /**
     * 序列化算法
     */
    byte getSerializerAlgoritm();
    /**
     * java 对象转换成二进制
     */
    byte[] serialize(Object object);
    /**
     * 二进制转换成 java 对象
     */
    <T> T deserialize(Class<T> clazz,byte[] bytes);
}
