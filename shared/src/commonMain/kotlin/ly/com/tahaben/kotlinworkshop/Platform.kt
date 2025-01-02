package ly.com.tahaben.kotlinworkshop

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform