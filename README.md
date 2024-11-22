# spring-boot-AOP


## Mengaktifkan AOP
- menambahkan @EnableAspectJAutoProxy di MainApplication

## Aspect
- Untuk membuat Aspect, kita cukup membuat Bean dan menambahkan annotation Aspect pada Bean tersebut
- Secara otomatis Spring akan membuatkan object Aspect dari class tersebut
-  kita perlu menambahkan behavior ke Aspect dengan cara menambahkan method pada Aspect tersebut

## Join Point
- titik lokasi eksekusi program
- AspectJ sendiri sebenarnya mendukung banyak sekali Join Point, namun Spring AOP hanya mendukung Join Point pada eksekusi method di Bean

### Contoh Join Point di Spring AOP
- Eksekusi method hello() di class HelloService
- Eksekusi semua method public di class HelloService
- Eksekusi semua method yang terdapat annotation @Test
- Eksekusi method di package service yang throw Exception Dan lain-lain
- Intinya adalah titik lokasi eksekusi method dengan kriteria tertentu, sehingga bisa melintasi satu atau lebih method dan object


## Poin Cut
- Pointcut adalah predikat yang cocok dengan Join Point
- Secara sederhana, Pointcut merupakan kondisi yang digunakan untuk menentukan Join Point
- Dan ketika kondisi terpenuhi, maka Aspect akan mengeksekusi Advice (akan dibahas di materi sendiri)

### Poincut Expression
- Misal kita ingin membuat Pointcut untuk semua method di class HelloService, maka kita harus buat kondisi tersebut dalam bentuk Pointcut Expression