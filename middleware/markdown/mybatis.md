## mybatis 

- mybatis 为什么没有用接口实现类
https://blog.csdn.net/puhaiyang/article/details/77418012  
参考MybatisMain 类，跟踪调试mapper代码直接跟踪到
```java
    protected T newInstance(MapperProxy<T> mapperProxy) {
        return Proxy.newProxyInstance(this.mapperInterface.getClassLoader(), new Class[]{this.mapperInterface}, mapperProxy);
    }
```
发现最后用代理模式写的代码

- mybatis一级缓存二级缓存