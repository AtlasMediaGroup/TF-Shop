package dev.totalfreedom.api;

public interface Serializable<T> {
    String serialize(T object);

    T deserialize(String serialized);
}
