package structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SecurityProxy implements InvocationHandler {
    private Object obj;

    private SecurityProxy(Object obj){
        this.obj = obj;
    }

    public static Object newInstance(Object obj){
        return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), new SecurityProxy(obj));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        if(method.getName().startsWith("post")){
            throw new IllegalAccessError("Post to timeline is restricted");
        }
        result = method.invoke(obj, args);
        return result;
    }
}
