package com.chiclaim.android.storage

import android.annotation.SuppressLint
import android.content.Context
import android.os.Environment

/**
 * App-specific dirs
 *
 * Created by chiclaim@google.com.
 */
class AppSpecificDirAPI {

    companion object {

        @SuppressLint("SetTextI18n")
        fun buildDirsStr(context: Context):String {
            return buildString {
                // -------- 应用专属目录（沙盒目录），自己访问无需权限，其他应用无法访问 --------
                // /data/user/0/com.chiclaim.android.storage/files
                // /data/user/999/com.chiclaim.android.storage/files   应用双开
                append("context.filesDir:\n")
                append(context.filesDir.absolutePath)
                append("\n\n")

                // /data/user/0/com.chiclaim.android.storage/cache
                append("context.cacheDir:\n")
                append(context.cacheDir.absolutePath)
                append("\n\n")

                // /data/user/0/com.chiclaim.android.storage/app_images // 会加上 app_ 前缀
                append("context.getDir(\"image\"),Context.MODE_PRIVATE:\n")
                append(context.getDir("images", Context.MODE_PRIVATE).absolutePath)
                append("\n\n")

                // -------- 应用专属目录（外部存储），Android4.4及以上不需要权限，其他应用无法访问 --------
                // 缓存目录：/storage/emulated/0/Android/data/com.chiclaim.android.storage/cache
                append("context.externalCacheDir:\n")
                append(context.externalCacheDir?.absolutePath)
                append("\n\n")

                // files 的根目录： /storage/emulated/0/Android/data/com.chiclaim.android.storage/files
                append("context.getExternalFilesDir(null):\n")
                append(context.getExternalFilesDir(null)?.absolutePath)
                append("\n\n")

                // files 的子目录(Music)： /storage/emulated/0/Android/data/com.chiclaim.android.storage/files/Music
                append("context.getExternalFilesDir(Environment.DIRECTORY_MUSIC):\n")
                append(context.getExternalFilesDir(Environment.DIRECTORY_MUSIC)?.absolutePath)
                append("\n\n")
            }
        }
    }


}