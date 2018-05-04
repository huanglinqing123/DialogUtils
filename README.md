# DialogUtils
## 常用dialog自定义封装，后续会持续更新，
目前版本1.0
有选择相册以及登录情况下常用的对话框

### 使用方式：
#### maven：
      <dependency>
       <groupId>com.huanglinqing</groupId>
       <artifactId>dialogutils</artifactId>
       <version>1.0.0</version>
       <type>pom</type>
    </dependency>
#### gradle：
 compile 'com.huanglinqing:dialogutils:1.0.0'

### 正在加载对话框
DialogUtil.dialogloading(MainActivity.this,"正在登陆",false,false);<br>
不需要.show()，返回alertdialog类型的dialog<br>
第一个参数是this，第二个参数是提示内容，第三个参数表示对话框显示时是否可以点击屏幕，第四个参数表示对话框显示时是否可以点击回退键<br>
取消对话框：dialog.dimissloading();<br>

    
<img src="http://p86xu5smy.bkt.clouddn.com/Screenshot_2018-05-04-13-57-55-01.png" alt="GitHub" title="GitHub,Social Coding" width="400" height="600" />

### 图片选择对话框
图片选择对话框有相机、相册、取消<br>
DialogUtils.selectphoto(MainActivity.this,false,false);<br>
不需要.show()，返回alertdialog类型的dialog<br>
第一个参数是this，第二个参数表示对话框显示时是否可以点击屏幕，第三个参数表示对话框显示时是否可以点击回退键<br>
取消对话框：dialog.dimissloading();<br>

    
<img src="http://p86xu5smy.bkt.clouddn.com/xiangji.png" alt="GitHub" title="GitHub,Social Coding" width="400" height="600" /><br>
按钮点击事件：<br>
相机<br>
 DialogUtils.xiangji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });<br>
相册<br>
DialogUtils.xiangce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });<br>
取消<br>
DialogUtils.quxiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });<br>

### 1.0.0 持续更新中欢迎留言探讨
    QQ：1306214077
