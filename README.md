# Android-Storage-Best-Practices

随着 Android 官方对用户隐私越来越重视，从 Android 10 开始，存储方面有了比较大的变化。所以我们有必要系统的梳理和学习 Android 存储的相关的知识。

我们将从 Android 4.4 ~ Android 13 介绍 Android 存储的方面的知识和最佳实践。

- 存储的内容类型有哪些？
    - 仅 App 使用的数据
    - 共享的媒体文件（图片、音视频）
    - 其他共享的文件
    - key-value
    - 关系型数据
- 不同的内容类型通过哪些 API 来访问？
- MediaStore 和 Storage Access Framework 是什么？
- 存储的目录有哪些？它们之间有什么区别？
- 存储路径的分类？
- 如何选择合适的存储目录
- 关于存储的权限有哪些？不用版本存储权限的变化？
- 使用系统图片选择器，无需整个媒体库的访问权限。

