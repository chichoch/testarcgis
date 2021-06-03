# *** ISSUE FIXED *** 

Upgrading `react-native` to `0.64.1` and ArcGIS SDK to `100.0.10` fixed the issue for me. 

I have updated the repo with the working fix. 

This repo will stay for future reference. 

# *** Original readme: ***

# testarcgis
Simple example which shows the problem with react-native v.0.63.3 with ArcGIS SDK v100.9.0 on Android

**Output in Android studio after crash:**

```
A/libc: /usr/local/google/buildbot/src/android/ndk-release-r20/external/libcxx/../../external/libcxxabi/src/abort_message.cpp:73: abort_message: assertion "terminating with uncaught exception of type std::bad_cast: std::bad_cast" failed
A/libc: Fatal signal 6 (SIGABRT), code -6 in tid 27613 (com.testarcgis)
```

The issue seems to be that React native and ArcGIS is providing conflicting `libc++_shared.so`-files.

## Failed fixes

- Removing Flipper
- Different options for `packagingOptions` in `android/app/build.gradle` (merge, pickFirst, exclude)
- Adding the flag `android.bundle.enableUncompressedNativeLibs=false` in `gradle.properties`
- Adding `implementation 'com.facebook.soloader:soloader:0.9.0+'` in `app/build.gradle`

**This issue is probably related:** https://github.com/facebook/react-native/issues/29377
