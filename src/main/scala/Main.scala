object MapToListAndSet {
  def main(args: Array[String]): Unit = {
    // Sample map
    val mapData = Map(
      "apple" -> 5,
      "banana" -> 3,
      "cherry" -> 2,
      "date" -> 7
    )

    // Transform the map into a list of key-value pairs
    val listData = mapData.toList

    // Transform the map into a set of keys
    val setData = mapData.keySet

    // Print the original map, list, and set
    println("Original Map:")
    println(mapData)

    println("\nTransformed List:")
    println(listData)

    println("\nTransformed Set:")
    println(setData)
  }
}
