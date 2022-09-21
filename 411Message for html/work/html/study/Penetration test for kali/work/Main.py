# -*- coding: GBK -*-

for i in range(2,21):
    File=open("{}.html".format(i),"w")
    File.write('<!DOCTYPE html> \n\
<html lang="en"> \n\
<head> \n\
    <meta charset="UTF-8"> \n\
    <title>{}</title> \n\
    <link rel="stylesheet" type="text/css" href="default.css"> \n\
</head> \n\
<body> \n\
<div id="center"> \n\
  <div class="background"> \n\
    <h3> \n\
 \n\
    </h3> \n\
  </div> \n\
    <div> \n\
        <a href="{}.html"><button>previous page,{}</button></a> \n\
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n\
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n\
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n\
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n\
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n\
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n\
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n\
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n\
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n\
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n\
        <a href="{}.html"><button>next page,{}</button></a> \n\
    </div> \n\
</div> \n\
</body> \n\
</html>'.format(i,i-1,i-1,i+1,i+1))




