# 411message
阿巴阿巴...
411message for html 中的index.html为首页

搭建环境:python3.9  windwos,service   apache2.4服务   内网穿透推荐frp或花生壳

使用时需要安装python编译器  www.pythom.org
主目录的python脚本适用于Windows平台,apache2.4服务
使用该脚本时请将脚本放入apache目录然后点击执行:  Apache24/htdocs/   

如果想要直接通过apache服务直接跳转网页时请修改apache文件
打开apache目录      Apache2.4/conf/httpd.conf 
找到DocumentRoot "${SRVROOT}/htdocs  将原内容替换为:    DocumentRoot "${SRVROOT}/htdocs/411message/411Message for html"

