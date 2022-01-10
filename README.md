# IP Lib - Public IP Lookup Library for Android

Public IP lookup library for android

[![](https://jitpack.io/v/kamaravichow/iplib-android.svg)](https://jitpack.io/#kamaravichow/iplib-android)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-IP%20Lib%20Android-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/8332)


## Installation

Add maven url to the root-level `build.gradle` file.

```groovy
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Now add this dependency to the app-level `build.gradle` file.

```groovy
dependencies {
	        implementation 'com.github.kamaravichow:iplib-android:LATEST_VERSION'
	}
```

LATEST_VERSION - [![](https://jitpack.io/v/kamaravichow/iplib-android.svg)](https://jitpack.io/#kamaravichow/iplib-android)


## Usage

For java documentation [click here](https://github.com/kamaravichow/iplib-android/blob/main/README-java.md)

**Initialise**

```kotlin

  ipLib = IPLib.instance!!

```

**Basic Usage**

To get the current IP and location of the user 

```kotlin

ipLib.ipLookup(object : OnIPResponse {
            override fun onSuccess(ipInfo: IPInfo?) {
                TODO("Not yet implemented")
            }

            override fun onError(message: String?, errorCode: Int) {
                TODO("Not yet implemented")
            }
        })

```

Async Methods run on IO-coroutine

```kotlin

 ipLib.ipLookupAsync(object : OnIPResponse {
            override fun onSuccess(ipInfo: IPInfo?) {
                TODO("Not yet implemented")
            }

            override fun onError(message: String?, errorCode: Int) {
                TODO("Not yet implemented")
            }
        })

```

**Custom IP lookup**

Get information of custom public IP

```kotlin

ipLib.ipLookupWithIpAsync("IP_ADDRESS", object : OnIPResponse {
            override fun onSuccess(ipInfo: IPInfo?) {
                TODO("Not yet implemented")
            }

            override fun onError(message: String?, errorCode: Int) {
                TODO("Not yet implemented")
            }
        })

```

**Advanced Usage**

Refer the sample app for [Advanced Usage](https://github.com/kamaravichow/iplib-android/blob/main/app).


## License

Copyright 2021 Aravind Chowdary

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
