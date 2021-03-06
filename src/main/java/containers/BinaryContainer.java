package containers;

/**
 * A container class for storing two instances of the same class.
 *
 * @param <T> stored class instance.
 * @author anywaythanks
 * @version 0.1
 */
public class BinaryContainer<T> {
    private T userT, absoluteT;

    public BinaryContainer(T userT, T absoluteT) {
        this.userT = userT;
        this.absoluteT = absoluteT;
    }

    public void setUserT(T userT) {
        this.userT = userT;
    }

    public void setAbsoluteT(T absoluteT) {
        this.absoluteT = absoluteT;
    }

    public T getAbsoluteT() {
        return absoluteT;
    }

    public T getUserT() {
        return userT;
    }

    @Override
    public String toString() {
        return "BinaryContainer{" +
                "userT=" + userT +
                ", absoluteT=" + absoluteT +
                '}';
    }
}
