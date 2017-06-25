
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-FunnyLoader-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/5930)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.supercharge/funnyloader/badge.svg?style=plastic)](https://maven-badges.herokuapp.com/maven-central/io.supercharge/funnyloader)


# FunnyLoader

`FunnyLoader` is an android library which can be used for showing random messages while your app is loading something. Over 200 random funny messages taken from [VideoStream](http://getvideostream.com) **for Chromecast plugin for Chrome**

![FunnyLoader](funnyloader.gif)

# Download and usage

Get the latest artifact via gradle
```groovy
compile 'io.supercharge:funnyloader:0.2.0'
```

Use as a standard `TextView`

```xml

  <io.supercharge.funnyloader.FunnyLoader
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
		...
        app:funny_postfix="..."
        app:funny_animation_duration="1500" />


```


# License

`FunnyLoader` is opensource, contribution and feedback are welcome!

[Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)


```
Copyright 2017 Supercharge

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
# Credits

The funny texts were written by Matt Gardner from the [VideoStream](http://getvideostream.com) 's team

# Author

[richardradics](https://github.com/richardradics)   

[![Supercharge](http://s23.postimg.org/gbpv7dwjr/unnamed.png)](http://supercharge.io/)
