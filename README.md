
首次从SVN上Check代码
====
1) 下载jar包，编译代码
mvn clean install (maven请自行安装）

2) 生成eclipse工程
mvn eclipse:eclipse

此时，可以在Eclipse中进行开发。


常用Maven命令
====
* mvn test: 运行所有测试
* mvn install: 在本地Repository中安装jar
* mvn package: 打包。能够同时生成jar包和zip包