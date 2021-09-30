# IP Lib - Public IP Lookup Library for Android

Public IP lookup library for android


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

**Basic Usage**

To get the current IP and location of the user 

```java
ipLib.ipLookup(new OnIPResponse() {
            @Override
            public void onSuccess(IPInfo ipInfo) {
                // ipInfo object will have all the information
            }

            @Override
            public void onError(String message, int errorCode) {
	    	// if has error this callback triggers
            }
        });
```

Async Method for Lookup

```java
ipLib.ipLookupAsync(new OnIPResponse() {
            @Override
            public void onSuccess(IPInfo ipInfo) {
                // ipInfo object will have all the information
            }

            @Override
            public void onError(String message, int errorCode) {
	    	// if has error this callback triggers
            }
        });
```

**Custom IP lookup**

Get information of custom public IP

```java
ipLib.ipLookupWith("IP ADDRESS", new OnIPResponse() {
            @Override
            public void onSuccess(IPInfo ipInfo) {
                                // ipInfo object will have all the information
            }

            @Override
            public void onError(String message, int errorCode) {
			    	// if has error this callback triggers
            }
        });
```

**Advanced Usage**

Refer the sample app for [Advanced Usage]().


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
