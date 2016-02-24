# NHACKJarPro
ack jar for android
爱财客终端SDK文档（for Android]）
接入指南

注：本文为爱财客Android终端SDK的新手使用教程，只涉及教授SDK的使用方法，默认读者已经熟悉Eclipse开发工具的基本使用方法，以及具有一定的编程知识基础等。

1.向爱财客注册你的应用程序appkey

请到 [商家应用登记页面](https://ack.gongshidai.com/backstage/index.html#/access/home) 进行登记，登记并选择移动应用进行设置后，将获得Appkey，可立即用于开发。但应用登记完成后还需要提交审核，只有审核通过的应用才能正式发布使用。

2.下载爱财客终端SDK文件

SDK文件包括 ack-1.0.jar。 请前往“[资源下载页](https://github.com/iFindTA/NHACKJarPro)“”下载最新SDK包

3.搭建开发环境

[1] 在Eclipse中建立你的工程。

[2] 将SDK文件中包含的ack-1.0.jar文件添加到你所建的工程中（如下图所示，建立了一个名为AckSdkDemo 的工程，并把以上文件添加到libs文件夹下。


![image](https://raw.githubusercontent.com/iFindTA/screenshots/master/ack_android_0.jpg)

[3] 开发者需要在工程中添加jar
如果再android studio 中使用该sdk

4.在代码中使用开发工具包

[1] 现在，你的程序要实现用户注册、实名、投资等动作记录同步到爱财客服务端需要调用如下列方法： 
应用启动:
![image](https://raw.githubusercontent.com/iFindTA/screenshots/master/ack_android_1.jpg)

用户注册： 
![image](https://raw.githubusercontent.com/iFindTA/screenshots/master/ack_android_2.jpg)

实名认证： 
![image](https://raw.githubusercontent.com/iFindTA/screenshots/master/ack_android_3.jpg)

用户投资：

![image](https://raw.githubusercontent.com/iFindTA/screenshots/master/ack_android_4.jpg)

错误code:

|   code   |   description   |
|----------|-----------------|
|    0     |    操作成功		
|    1     |    参数异常		
|    2     |    系统异常		
|    3     |    状态异常		
|    4     |    方法未实现		
|    5     |    不正当入侵		
|    6     |    操作超时		
|    7     |    请稍后再试		
|   401    |    没有权限		
|   503    |    没有方法		
|  90000   |    未找到商家		
|  90001   |    不是平台下载		
|  90002   |    任务已完成		
|  90003   |    任务异常		

new project for sdk
contact:

mail:nanhujiaju@gmail.com