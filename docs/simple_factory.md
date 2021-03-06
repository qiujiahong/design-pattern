## 简单工厂

### 定义

由一个工厂决定创造出哪一个产品的实例；

* 创建型，但是不属于GOF23种设计模式

* 试用场景
  * 工厂类负责创建的对象比较少
  * 客户端只知道传入工厂类的参数，对于如何创造对象逻辑不关心；

### 优缺点

* 优点
  * 只需要传入一个正确的参数就可以获取想要创建的对象，无需知道创建细节；
* 缺点
  * 增加新的产品需要修改原来的工厂类，违背了开闭原则；
  * 增加类的个数，增加了复杂度；
  * 无法基于集成的等级结构；

  
  ### 代码

* 使用一个方法根据传入参数新建对象；

  ![](./assets/2018-11-12-22-10-17.png)

```java
public class VideoFactory {
    public Video getVideo(String type){
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }
}
```

* 使用反射演进

```java
    public Video getVideo(Class c){
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  video;
    }
```

```java
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(video == null){
            return;
        }
        video.produce();
```
