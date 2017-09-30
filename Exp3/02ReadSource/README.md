#### 练习2：阅读给出的源码
##### 要求：说出OOP特性和功能
CompareableList：
     OOP特性：封装
     批量构造员工信息，乱序将员工编号姓名和年龄加入表中，每个员工信息封装成一个对象。再按员工编号对员工信息排序。
Employee:
       OOP特性：继承
        功能：经理是一种特殊的雇员，所以经理Manager继承自Employee,拥有雇员的属性如姓名工号入厂时间工资，又有雇员所没有的奖金。
GraphicArea:
     OOP特性：抽象继承 功能圆和矩形都继承自Shape，通过Override抽象父类的getArea方法来计算各自面积
LocalInner:
     OOP特性：封装
     功能：每隔1秒打印当前时间，用图形界面让用户选择是否退出（使用动作监听的方法）
MerchandiseSales：
      OOP特性：封装
       功能：随机销售3类商品，统计销售商品的总数
xiaomi:
       OOP特性：封装
      功能：创建一个个小米手机的对象，具有名称型号价格和颜色等属性
TemperatureConverter：
      OOP特性： 封装
       功能：华氏温度和摄氏温度转换
Student:
      OOP特性：封装
     功能：打印学生姓名性别和年龄
StrategyPattern：
     OOP特性： 多态
     功能：根据用户选择的模式，分别对应获得保存图片为GIF类型的对象,获得保存图片为JPEG类型的对象
和获得保存图片为PNG类型的对象
