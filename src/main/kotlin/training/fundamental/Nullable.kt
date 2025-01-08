package training.fundamental

import org.junit.Test

class Nullable {
    fun nullable(name: String) {
        // TODO 1
        // Periksa apakah parameter `name` tidak `null` dan tampilkan nilai `name`.

        // TODO 2
        // Deklarasikan variabel nullable `loc` dan coba akses panjangnya dengan safe call.

        // TODO 3
        // Gunakan elvis operator (`?:`) untuk memberikan nilai default jika `text` null.

        // TODO 4
        // Gunakan not-null assertion (`!!`) untuk memaksa akses panjang `testing`.
    }

    // Nullable Receiver
    val Int?.slice2: Int
        get() =
        // TODO 5
            // Tambahkan logika untuk membagi `this` dengan 2 jika tidak null, atau kembalikan 0.
            0 // Placeholder
}

class NullableTest {
    val nullableTest = Nullable()

    @Test
    fun nullableTest() {
        // TODO 6
        // Panggil fungsi `nullable` dengan parameter yang sesuai untuk menguji hasil.
    }
}