package qzl.com.andfixproject

import android.app.Application
import android.os.Environment
import com.alipay.euler.andfix.patch.PatchManager
import java.io.File

/**
 * @desc
 * @author Qzl
 * @email 2538096489@qq.com
 * @time 2019-01-31 19:11
 * @class AndFixProject
 * @package qzl.com.andfixproject
 */
class MyApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        //初始化andFix
        val patchManager = PatchManager(this);
        patchManager.init("1.0");//current version
        patchManager.loadPatch();
        //设置补丁文件的路径
        var pathFile = File(Environment.getExternalStorageDirectory(),"fixbug.apatch")
        if (pathFile.exists()){
            //合并补丁文件
            patchManager.addPatch(pathFile.absolutePath);
        }
    }
}