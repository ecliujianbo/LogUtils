#logutils
    1，显示Log日志的类名，方法名，行数
    2，点击行数，调转到对应源码、
#use
    1，LogUtil.TAG       修改filter的名字
    2，LogUtil.DEBUG     修改是否开启日志(默认true)

#config
    ####Step 1. Add the JitPack repository to your build file
        Add it in your root build.gradle at the end of repositories:
        '''gradle
        allprojects {
        		repositories {
        			...
        			maven { url "https://jitpack.io" }
        		}
        	}

    ####Step 2. Add the dependency
        '''gradle
        dependencies {
        	        compile 'com.github.ecliujianbo:LogUtils:v1.0.2'
        	}