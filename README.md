[简单实现Mybatis案例](https://github.com/mikeygithub/HandWritingMybatis/blob/master)
=======
 简单实现Mybatis案例 
=======

###实现功能
1.简单CRUD功能

2.生成数据库表<-->生成数据表相关实体类

3.动态SQL
###实现思路
1.底层使用JDBC封装

2.自定义注解,XML解析器,代理

3.字段类型和java类型的转换

###具体实现
1.通过读取配置文件mybatis-config.xml获取配置信息

2.根据配置文件的配置信息生成数据库连接对象

3.读取mapper接口,mapper.xml,相关信息