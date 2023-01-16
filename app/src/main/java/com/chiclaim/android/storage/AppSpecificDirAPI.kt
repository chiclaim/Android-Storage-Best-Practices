package com.chiclaim.android.storage

import android.content.Context
import android.os.Environment

/**
 * App-specific dirs
 *
 * Created by chiclaim@google.com.
 */
class AppSpecificDirAPI {

    companion object {

        fun listDirs(context: Context) {
            // -------- 应用专属目录（沙盒目录），自己访问无需权限，其他应用无法访问 --------
            // /data/user/0/com.chiclaim.android.storage/files
            println(context.filesDir)
            // /data/user/0/com.chiclaim.android.storage/cache
            println(context.cacheDir)
            // /data/user/0/com.chiclaim.android.storage/app_images // 会加上 app_ 前缀
            println(context.getDir("images", Context.MODE_PRIVATE))

            // -------- 应用专属目录（外部存储），Android4.4及以上不需要权限，其他应用无法访问 --------
            // 缓存目录：/storage/emulated/0/Android/data/com.chiclaim.android.storage/cache
            println(context.externalCacheDir)
            // files 的根目录： /storage/emulated/0/Android/data/com.chiclaim.android.storage/files
            println(context.getExternalFilesDir(null))
            // files 的子目录(Music)： /storage/emulated/0/Android/data/com.chiclaim.android.storage/files/Music
            println(context.getExternalFilesDir(Environment.DIRECTORY_MUSIC))

        }
    }


}