package com.furkankurt.superherobook

import android.graphics.Bitmap

class SingletonClass {

    //Singletonlarda kullanılır ve farklı yerlerden tek bir şeye ulaşmamıza olanak verir.
    companion object SecilenKahraman{
        var gorsel: Bitmap?=null
    }



}