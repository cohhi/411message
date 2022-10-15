import os
import shutil
 
# 删除“1”整个文件夹
##author : steam-404 for GitHub

print("author : steam-404 for GitHub")

print("正在删除旧文件")
os.system("rd /s 411message")
#os.removedir(411message)
print("删除成功")

print("正在重新克隆")
os.system("git clone https://github.com/steam-404/411message")
print("克隆成功")

print("正在重启apache服务")
os.system("httpd -k restart")
print("apache重启完成")
print("拜拜，么么哒")

