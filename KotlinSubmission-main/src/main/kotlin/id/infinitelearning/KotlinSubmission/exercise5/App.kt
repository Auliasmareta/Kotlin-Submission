package id.infinitelearning.KotlinSubmission.exercise5

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */
    val hero = Hero()

// Mengatur profil hero
    hero.setProfile("Anita", 23, 150)

// Memanggil fungsi profile untuk menampilkan profil hero
    hero.profile()

// Memanggil fungsi jalan
    hero.jalan()


    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */
    data class Profile(val name: String, val age: Int, val height: Int)

    fun setProfile(name: String, age: Int, height: kotlin.Int) {
        val profile = Profile(name, age, height)
        println("Data profile berhasil diisi:")
        println("Nama: ${profile.name}")
        println("Umur: ${profile.age} tahun")
        println("Tinggi: ${profile.height} cm")
    }

    fun main() {
        val name = "Aulia Suci Mareta" // Aulia Suci Mareta
        val age = 23 // 23
        val height = 149 // 149

        setProfile(name, age, height)
    }



    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */
    data class Profile(val group: Int, val tidur: Int, val bangun: Int, val mandi: Int, val makan: Int, val minum: Int, val duduk: Int)

    fun main() {
        val profiles = listOf(
            Profile(1, 5, 2, 3, 1, 3, 1),
            Profile(2, 2, 2, 1, 3, 1, 2),
            Profile(3, 3, 1, 5, 1, 5, 3),
            Profile(4, 5, 4, 4, 4, 3, 2),
            Profile(5, 4, 1, 3, 5, 5, 3),
            Profile(6, 2, 4, 2, 2, 7, 4)
        )

        for (profile in profiles) {
            println("Group ${profile.group}:")
            println("Tidur ${profile.tidur}x, Bangun ${profile.bangun}x, Mandi ${profile.mandi}x, Makan ${profile.Makan}x, Minum ${profile.minum}x, Duduk ${profile.duduk}x")
            println()
        }
    }


    /**
    Challenge:
    Group 1: jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
    Group 2: jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    Group 3: jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
    Group 4: jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    Group 5: jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    Group 6: jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    **/

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */
    fun jalan(jumlah: Int) {
        for (i in 1..jumlah) {
            println("Jalan")
        }
    }

    fun lari(jumlah: Int) {
        for (i in 1..jumlah) {
            println("Lari")
        }
    }

    fun makan(jumlah: Int) {
        for (i in 1..jumlah) {
            println("Makan")
        }
    }

    fun minum(jumlah: Int) {
        for (i in 1..jumlah) {
            println("Minum")
        }
    }

    fun lompat(jumlah: Int) {
        for (i in 1..jumlah) {
            println("Lompat")
        }
    }

    fun duduk(jumlah: Int) {
        for (i in 1..jumlah) {
            println("Duduk")
        }
    }

    fun main() {
        println("Group 1:")
        jalan(5)
        lari(2)
        makan(3)
        minum(1)
        lompat(3)
        duduk(1)

        println("Group 2:")
        jalan(2)
        lari(2)
        makan(1)
        minum(3)
        lompat(1)
        duduk(2)

        println("Group 3:")
        jalan(3)
        // Tidak ada fungsi "Lari Ix" yang ditentukan, mungkin ada kesalahan penulisan
        makan(5)
        minum(1)
        lompat(5)
        duduk(3)

        println("Group 4:")
        // "jalon" mungkin merupakan kesalahan penulisan, diganti menjadi "jalan"
        jalan(5)
        lari(4)
        makan(4)
        minum(4)
        lompat(3)
        duduk(2)

        println("Group 5:")
        jalan(4)
        lari(1)
        makan(3)
        minum(5)
        lompat(5)
        duduk(3)

        println("Group 6:")
        // "jotan" mungkin merupakan kesalahan penulisan, diganti menjadi "jalan"
        jalan(2)
        lari(4)
        makan(2)
        minum(2)
        lompat(7)
        duduk(4)
    }



    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */
    fun jalan(jumlah: Int) {
        for (i in 1..jumlah) {
            println("Jalan")
        }
    }

    fun lari(jumlah: Int) {
        for (i in 1..jumlah) {
            println("Lari")
        }
    }

    fun makan(jumlah: Int) {
        for (i in 1..jumlah) {
            println("Makan")
        }
    }

    fun minum(jumlah: Int) {
        for (i in 1..jumlah) {
            println("Minum")
        }
    }

    fun lompat(jumlah: Int) {
        for (i in 1..jumlah) {
            println("Lompat")
        }
    }

    fun duduk(jumlah: Int) {
        for (i in 1..jumlah) {
            println("Duduk")
        }
    }

    fun main() {
        println("Group 1:")
        jalan(5)
        lari(2)
        makan(3)
        minum(1)
        lompat(3)
        duduk(1)

        println("Group 2:")
        jalan(2)
        lari(2)
        makan(1)
        minum(3)
        lompat(1)
        duduk(2)

        println("Group 3:")
        jalan(3)
        // Tidak ada fungsi "Lari Ix" yang ditentukan, mungkin ada kesalahan penulisan
        makan(5)
        minum(1)
        lompat(5)
        duduk(3)

        println("Group 4:")
        // "jalon" mungkin merupakan kesalahan penulisan, diganti menjadi "jalan"
        jalan(5)
        lari(4)
        makan(4)
        minum(4)
        lompat(3)
        duduk(2)

        println("Group 5:")
        jalan(4)
        lari(1)
        makan(3)
        minum(5)
        lompat(5)
        duduk(3)

        println("Group 6:")
        // "jotan" mungkin merupakan kesalahan penulisan, diganti menjadi "jalan"
        jalan(2)
        lari(4)
        makan(2)
        minum(2)
        lompat(7)
        duduk(4)
    }


}