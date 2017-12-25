# Using GStreamer rtspsrc with Android Studio
This project is based on android-tutorial-3 from https://gstreamer.freedesktop.org/documentation/tutorials/android/video.html  
# Prepare
- Android Studio  
- Android NDK  
- GStreamer android prebuilt binaries
# How it works
It plays from a H264 encoded RTSP stream  
GStreamer pipeline: rtspsrc --> rtph264depay --> avdec_h264 --> videoconvert --> autovideosink  
# Instructions
- Open with Android Studio  
- Set the SDK and NDK path  
- Open `Android.mk` and set GSTREAMER_ROOT_ANDROID to the GStreamer prebuilt binaries  
- Open /path-to-your-GSTREAMER_ROOT_ANDROID/share/gst-android/ndk-build/gstreamer-1.0.mk and edit the script at line 207 after this line `$(GSTREAMER_ANDROID_O): PRIV_C := $(GSTREAMER_ANDROID_C)` as follow: `$(GSTREAMER_ANDROID_O): PRIV_CC_CMD := $(TARGET_CC) -isystem /path-to-your-android-ndk-install-directory/sysroot/usr/include/arm-linux-androideabi --sysroot=/path-to-your-android-ndk-install-directory/sysroot $(TARGET_CFLAGS) \`  
- Disable "Instante Run" from Android Studio  
- Build  
# Reference
https://stackoverflow.com/questions/45044210/gstreamer-examples-in-android-studio
