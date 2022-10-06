package gachon.teama.frimo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash);

        // Todo: 과거에 로그인 한 적이 있으면 메인 페이지로
        //  없으면 로그인 페이지로 보내기

        // Delay screen
        Handler().postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        },DURATION)

    }

    companion object {
        private const val DURATION : Long = 3000
    }
}