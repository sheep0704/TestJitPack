# TestJitPack

* JitPack 测试通过

   免费提供给有需要的同学 测试环境和jitpack
   [![](https://jitpack.io/v/sheep0704/TestJitPack.svg)](https://jitpack.io/#sheep0704/TestJitPack)
   
  * Test步骤
    
    - 工程引入     implementation 'com.github.sheep0704:TestJitPack:V1.1'
    - 代码插入       ' JitPackUtils jitPackUtils = new JitPackUtils(); jitPackUtils.getVersion();'
    - 代码编译run
    - 查看是否通过，通过则可以直接放入自己代码库
    
    <br/>
 
  * 放入代码库步骤
  
    - 把自己工程lib放入github
    - github上公开releas版本
    - [像TestJitPack一样](https://www.jitpack.io/#sheep0704/TestJitPack) 进入查看自己的version
    - 如果jitpack上红色日志代表失败，可以重新clean-rebuild一下，如果绿色则是可以使用的，BUILD SUCCESSFUL in 6s
    - 直接在项目上引用，Tag代表版本号--> implementation 'com.github.sheep0704:TestJitPack:Tag'
    - 项目编译是否通过
    <br/>
    
   

![image](https://github.com/sheep0704/TestJitPack/blob/master/app/src/main/res/mipmap-xxxhdpi/dayin.png)

<br/>

## 联系
    如果有紧急事件可联系作者或加Q群：
    - Q号： 309933706
    - Q群： 246231638
    
    
