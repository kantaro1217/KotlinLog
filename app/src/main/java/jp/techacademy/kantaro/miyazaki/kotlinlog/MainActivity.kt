package jp.techacademy.kantaro.miyazaki.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = 10 + 5 - 2 * 4 / 2
        Log.d("kotlintest", "10 + 5 - 2 * 4 / 2 = " + num1)

        val flag1 = true
        val flag2 = false
        Log.d("kotlintest", "flag1 && flag2 = " + (flag1 && flag2))
        Log.d("kotlintest", "flag1 || flag2 = " + (flag1 || flag2))

        val num2 = 10
        val num3 = 20
        Log.d("kotlintest", "num2 < num3 = " + (num2 < num3))

        var num = 60

        if (num >= 90) {
            Log.d("kotlintest", "優")
        } else if (num >= 75) {
            Log.d("kotlintest", "良")
        } else if (num >= 60) {
            Log.d("kotlintest", "可")
        } else {
            Log.d("kotlintest", "不可")
        }

        val drink = 1

        when (drink) {
            0 -> {
                Log.d("kotlintest", "order a coffee")
            }
            1 -> Log.d("kotlintest", "order a tea")
            2 -> Log.d("kotlintest", "order milk")
            else -> Log.d("kotlintest", "reject this order")
        }
        val message = when (drink) {
            0 -> "コーヒーを注文しました"
            1 -> "紅茶を注文しました"
            2 -> "ミルクを注文しました"
            else -> "オーダーミスです"
        }
        Log.d("kotlintest", message)

        for (i in 1 until 6) {
            Log.d("kotlintest", "for文の " + i + "回目")
        }

        var num5 = 1 //事前にvar num の定義が残っている場合は、エラーがでるので、var を削除しましょう。

        while (num5 < 6) {
            Log.d("kotlintest", "while文の " + num5 + "回目")
            num5++
        }

        // Array<Int>型の配列が作成される
        val points = arrayOf(10, 6, 15, 23, 17)

        for (i in points) {
            Log.d("kotlintest", i.toString())
        }

        total(50, 1000)

        total(1,1111)

        val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog.say()
        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")

        val bigdog = BigDog("ヨーゼフ", 15)     // 名前をヨーゼフ、年齢15歳で、BigDogのインスタンスを作る

        bigdog.say()
        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")

        dog.move()
        //-----------------------ここからLesson3の課題---------

        val sato = Human("佐藤",18, "piano")
        sato.say()
        sato.think()
        val kato = Human("加藤", 32, "baseball")
        kato.say()
        kato.think()
    }

    private fun total(first: Int, last: Int): Int {
        var sum = 0
        for(i in first..last) {
            sum += i
        }

        Log.d("kotlintest", sum.toString())
        return sum
    }

}