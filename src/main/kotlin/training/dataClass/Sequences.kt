package training.dataClass

import org.junit.Test

class Sequences {
    fun sequenceTest() {
        // TODO 1
        // Buat list berisi angka dari 1 hingga 1.000.000.
        val list = (1..1000000).toList()

        // TODO 2
        // Gunakan filter, map, dan forEach untuk mencetak angka yang kelipatan 5, kemudian kalikan angka tersebut dengan 2.
        list.filter { it % 5 == 0 }
            .map { it * 2 }
            .forEach { println(it) }

        // TODO 3
        // Ubah list menjadi sequence dan lakukan operasi filter dan map untuk mencetak angka kelipatan 5 yang dikalikan dengan 2.
        list.asSequence()
            .filter { it % 5 == 0 }
            .map { it * 2 }
            .forEach { println(it) }

        // TODO 4
        // Buat sequence yang dimulai dari angka 1 dan terus meningkat setiap kali dengan 1.
        val sequenceNumber = generateSequence(1) { it + 1 }

        // TODO 5
        // Ambil 5 angka pertama dari sequence dan cetak dengan format spasi antar angka.
        sequenceNumber.take(5).forEach { print("$it ") }
    }
}

class SequencesTest {
    val sequences = Sequences()

    @Test
    fun sequencesTest() {
        // TODO 6
        // Panggil fungsi sequenceTest() untuk menjalankan operasi pada sequence dan mencetak hasilnya.
        sequences.sequenceTest()
    }
}
