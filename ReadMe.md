工程概要：
	本工程基于louts 和 activemq ，发送邮件，目前不支持发送附件的方式。
	环境要求，不需要服务器打开服务
	1.要安装Lotus Notes客护端
	2.两个JAR包Notes.jar和NCSO.jar
	3.D:\lotus\notes加到path路径下(也就是Notes的根目录),最后就是配置Notes客户端了,配置好了
	4.如果你关掉Notes客户端,那么该程序需要你输入密码,要想不用输入密码那么你就得一直看着客户端了(没办法). 
	5.若想支持附件方式，只能附件文件路径即可（发件慢，暂无需求，不添加该功能）
	设计：
	邮件部分，需要将id文件存放在目的路径下\idfiles 才可使用，过来的消息需要
	
	
	https://blog.csdn.net/zhuwukai/article/details/78644484