data class User(
    val uid: String = "",
    val name: String = "",
    val email: String = "",
    val userType: UserType = UserType.CONSUMER // Default to consumer
)

enum class UserType {
    FARMER,
    CONSUMER
}

data class Farmer(
    val farmName: String = "",
    val farmDescription: String = "",
    val products: List<Product> = listOf()
)

data class Consumer(
    val preferences: List<String> = listOf(),
    val orders: List<String> = listOf()
)
