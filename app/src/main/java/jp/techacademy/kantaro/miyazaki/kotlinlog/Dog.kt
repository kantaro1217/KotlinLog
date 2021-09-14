package jp.techacademy.kantaro.miyazaki.kotlinlog

import android.util.Log

open class Dog: Animal, Movable {

    constructor(name: String, age: Int): super(name, age) {
    }

    //method
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + ")" + "「ワンワン」")
    }

    override fun move(){
        Log.d("kotlintest", this.name + "(" + this.age + ")" + "は全力で走った。")
    }
}