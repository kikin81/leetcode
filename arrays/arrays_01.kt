
// data class of DVD
data class DVD(
    val name: String,
    val releaseYear: Int,
    val director: String
)

fun main() {
    val avengersDvd = DVD("The Avengers", 2012, "Joss Whedon")
    val dvdList = arrayOf<DVD>(avengersDvd)
    for (dvd in dvdList) {
        print(dvd)
    }
}
