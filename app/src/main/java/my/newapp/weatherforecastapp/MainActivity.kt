package my.newapp.weatherforecastapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import my.newapp.weatherforecastapp.fragments.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.placeHolder, MainFragment.newInstance()).commit()
    }
}