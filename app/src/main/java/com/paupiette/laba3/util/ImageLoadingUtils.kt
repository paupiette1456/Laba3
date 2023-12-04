package com.paupiette.laba3.util


import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

private val rangeForRandom = (0..100000)

fun randomSampleImageUrl(
    seed: Int = rangeForRandom.random(),
    width: Int = 150,
    height: Int = 220,
): String {
    return "https://api.lorem.space/image/movie?w=150&h=220$seed/$width/$height"
}

/**
 * Remember a URL generate by [randomSampleImageUrl].
 */
@Composable
fun rememberRandomSampleImageUrl(
    seed: Int = rangeForRandom.random(),
    width: Int = 300,
    height: Int = width,
): String = remember { randomSampleImageUrl(seed, width, height) }
