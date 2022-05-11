# HackViewBinding

After the deprecating of Kotlin Android Extensions, Android developers should migrate to ViewBinding as a better choice. The problem is that if you enable ViewBinding  in your project, the compiler will generate binding source files for all of your xml layouts. Such a pain.

In this demo, I am trying to demonstrate how to hack the android gradle plugin to make it possible to generate binding files as needed.

中文开发者也可以参考这个视频：[Android 如何按需开启 ViewBinding 而不是 ignore 单个文件？](https://www.bilibili.com/video/BV1HR4y1A7yW/)
