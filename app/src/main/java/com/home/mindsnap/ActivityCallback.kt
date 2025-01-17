package com.home.mindsnap

import com.home.mindsnap.type.ArtStyle

interface ActivityCallback {


    //튜토리얼 완료해서 프래그먼트 이동
    fun navigateToGallery()

    fun navigateToResult(prompt : String, artStyle: ArtStyle)

    fun navigateToPrompt() {
        navigateToPrompt(null)
    }

    fun navigateToPrompt(prompt: String?)

}