package training.dataClass

import org.junit.Test
import original.dataClass.Collection
import printSpace

class Collection {
    // TODO 1
    // lengkapi variable numberlist berisi listof 1 sampai 11
    // lengkapi variable sisanya jadi emptylist number
    val numberList = 0
    var evenList = 0
    var notEvenList = 0
    var multipliedBy5 = 0

    fun collectionsOperations() {
        // TODO 1
        // Filter numberList untuk mendapatkan hanya angka genap dan simpan dalam evenList.

        // TODO 2
        // Filter numberList untuk mendapatkan angka yang tidak genap dan simpan dalam notEvenList.

        // TODO 3
        // Map numberList dengan mengalikan setiap elemen dengan 5 dan simpan hasilnya dalam multipliedBy5.

        // TODO 4
        // Hitung jumlah elemen dalam numberList dan cetak hasilnya.
        println("COUNT : $numberList")

        // TODO 5
        // Hitung jumlah elemen dalam numberList yang habis dibagi 3 dan cetak hasilnya.
        println("MODULUS : $numberList")

        // TODO 6
        // Cetak isi evenList yang berisi angka genap.
        println("EVEN LIST : $evenList")

        // TODO 7
        // Cetak isi notEvenList yang berisi angka yang tidak genap.
        println("NOT EVEN LIST : $notEvenList")

        // TODO 8
        // Cetak hasil perkalian elemen dalam numberList dengan 5.
        println("MUTIPLIED BY 5 : $multipliedBy5")

        // TODO 9
        // Temukan angka ganjil pertama dalam numberList dan cetak hasilnya.
        val firstOddNumber = 0

        // TODO 10
        // Temukan angka ganjil pertama dalam numberList atau null jika tidak ada dan cetak hasilnya.
        val firstOrNullNumber = 0
        println("FIRST ODD NUMBER : $firstOddNumber")
        println("FIRST ODD OR NULL NUMBER : $firstOrNullNumber")

        // TODO 11
        // Temukan angka pertama yang lebih besar dari 5 dalam numberList dan cetak hasilnya.
        val moreThan5 = 0
        println("MORE THAN 5 : $moreThan5")

        // TODO 12
        // Hitung total semua angka dalam numberList dan cetak hasilnya.
        val total = 0
        println("TOTAL : $total")

        // TODO 13
        // Urutkan karakter dalam list kotlinChar secara ascending dan cetak hasilnya.
        val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
        val ascendingSort = 0
        println("ASCENDING SORT : $ascendingSort")

        // TODO 14
        // Urutkan karakter dalam list kotlinChar secara descending dan cetak hasilnya.
        val descendingSort = 0
        println("DESCENDING SORT : $descendingSort")
    }
}

class CollectionTest {
    val collection = Collection()

    @Test
    fun collectionTest() {
        // TODO 15
        // Panggil fungsi collectionsOperations untuk menjalankan operasi koleksi dan mencetak hasilnya.
        collection.collectionsOperations()
    }
}
