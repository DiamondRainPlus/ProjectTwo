package com.example.homeworksiki

fun main() {
    val coinList = arrayListOf(
        Coin.CoinResponse(
            name = "Bitcoin",
            coinId = "BTC",
            hashingAlgorithm = "SHA-256",
            description = "Bitcoin is a decentralized digital currency, without a central bank or single administrator.",
            image = "https://example.com/bitcoin.png",
            currentPrice = 34789.21F,
            priceChangePercentage24h = -2.34F
        ),
        Coin.CoinResponse(
            name = "Ethereum",
            coinId = "ETH",
            hashingAlgorithm = "Ethash",
            description = "Ethereum is an open-source, blockchain-based platform that enables developers to build and deploy smart contracts.",
            image = "https://example.com/ethereum.png",
            currentPrice = 2110.45F,
            priceChangePercentage24h = 0.78F
        ),
        Coin.CoinResponse(
            name = "Litecoin",
            coinId = "LTC",
            hashingAlgorithm = "Scrypt",
            description = "Litecoin is a peer-to-peer cryptocurrency that enables instant, near-zero cost payments to anyone in the world.",
            image = "https://example.com/litecoin.png",
            currentPrice = 129.57F,
            priceChangePercentage24h = -1.12F
        ),
        Coin.CoinResponse(
            name = "Ripple",
            coinId = "XRP",
            hashingAlgorithm = null,
            description = "Ripple is a digital payment protocol and cryptocurrency that is designed to facilitate fast, low-cost international money transfers.",
            image = "https://example.com/ripple.png",
            currentPrice = 0.5483F,
            priceChangePercentage24h = 1.45F
        )
    )

    val coinUIList = coinList.map { coinResponse ->
        Coin.CoinUI(
            name = coinResponse.name,
            coinId = coinResponse.coinId,
            description = coinResponse.description,
            image = coinResponse.image
        )
    }

    coinUIList.forEach { coinUI ->
        println("Name: ${coinUI.name}")
        println("Coin ID: ${coinUI.coinId}")
        println("Description: ${coinUI.description}")
        println("Image: ${coinUI.image}")
        println("*********************")
    }
}