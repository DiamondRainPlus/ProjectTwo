package com.example.homeworksiki

class Coin {
    data class CoinResponse(val name: String, val coinId: String, val hashingAlgorithm: String?, val description: String, val image: String, val currentPrice: Float, val priceChangePercentage24h: Float)

    data class CoinUI(val name: String, val coinId: String, val description: String, val image: String)
}