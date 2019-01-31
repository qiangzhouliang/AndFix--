package qzl.com.andfixproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //懒加载
//    val mTvResult:TextView by lazy {
//        //findViewById
//        tv_result
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_result.text = "有bug版本"
    }
}
