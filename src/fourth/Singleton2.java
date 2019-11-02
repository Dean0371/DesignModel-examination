package fourth;

import java.io.Serializable;

// 修改后的单例模式

// 使用线程同步创建，防止进程切换重复创建线程，
// 设置volatile关键字修饰，使读取singleton对象时能够获取最新状态
// 修改构造方法，防止反射创建对象
// 修改readResolve方法，防止反序列化对象时重新创建对象
// 重写克隆方法，防止对象克隆
public class Singleton2 implements Serializable, Cloneable {
    private static volatile Singleton2 singleton;

    private Singleton2() {
        if (singleton != null) {
            throw new RuntimeException("对象已被创建");
        }
    }

    public static Singleton2 getInstance() {
        if (singleton == null) {
            synchronized (singleton) {
                if (singleton == null)
                    singleton = new Singleton2();
            }
        }
        return singleton;
    }

    private Object readResolve() {
        return singleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
