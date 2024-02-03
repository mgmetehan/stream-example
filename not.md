-filter
Kisaca, .filter metodu, bir akis icinde sadece belirli bir kosulu saglayan ogeleri korumak veya secmek icin kullanilir. Ornegin, bir listenin icinde sadece belirli bir kritere uyan ogeleri almak icin .filter metodunu kullanabilirsiniz.

-map
Bu metodun temel gorevi, her bir akis ogesine belirli bir fonksiyon uygulayarak yeni bir akis olusturmaktir. Olusturulan bu yeni akis, orijinal akistan farkli olabilir.

-flatMap
flatMap metodu, ic ice gecmis yapilari duzlestirmek icin Java Stream API'de kullanilir. Eger bir stream icinde baska bir stream veya koleksiyon yapisi bulunuyorsa, flatMap bu ic ice gecmis yapilari duzlestirerek tek bir duzlestirilmis stream'e donusturur. Bu, ic ice gecmis yapilardaki elemanlari daha rahat bir sekilde islemek ve uzerlerinde operasyonlar yapmak icin kullanilir.

-distinct
Java Stream API'ndeki distinct metodu, bir akistaki benzersiz ogeleri filtrelemek icin kullanilir. Bu metod, bir akistaki ogelerin yalnizca bir kopyasini almanizi saglar. Ozellikle bir koleksiyon icindeki tekrarlanan ogeleri ortadan kaldirmak icin sikca kullanilir.

-sorted
Java Stream API'deki sorted metodu, bir akistaki ogeleri belirli bir siraya gore siralamak icin kullanilir. Bu metod, akistaki ogelerin dogal siralama (natural ordering) veya ozel bir karsilastirma stratejisi (Comparator) kullanarak siralanmasini saglar.

-peek
!Bu yanlis olabilir
peek metodu, bir Java Stream'inin her ogesi uzerinde belirli bir islemi gerceklestirmenizi saglar. Ancak, bu islem sonucunda orijinal akisin yapisi degismez. peek, ogeler uzerinde ara islemler yapma ihtiyaci olan durumlar icin kullanilir.

-limit
'limit' metodu, akisin boyutunu azaltmak icin kullanilir.

-skip
skip metodu, bir Java Stream'inde belirli bir sayidaki ogeyi atlamak icin kullanilir. Yani, skip metodu, baslangictaki belirtilen sayidaki ogeyi atlar ve geri kalan ogeleri iceren yeni bir akis olusturur.

-takewhile
takeWhile metodu, Java Stream API'de bir akistaki ogeleri belirli bir kosul saglandigi surece almanizi saglar. Akistaki ogeler, belirtilen kosulun gecerli oldugu surece alinmaya devam eder ve kosul gecersiz hale geldiginde alim islemi durur.

-dropwhile
dropWhile metodu, bir Java Stream'inde belirli bir kosulu sagladigi surece ogeleri atlamak icin kullanilir. Akistaki ogeler, belirtilen kosulun gecerli oldugu surece atlanir ve kosul gecersiz hale geldiginde atlam islemi sona erer, geri kalan ogelerle devam edilir.

-count
Java Stream API'deki count() metodu, bir akisin icindeki ogelerin sayisini donduren terminal bir islemdir. Bu metot, bir akisin elemanlarinin toplam sayisini elde etmek icin kullanilir.

-foreach
Bu metodun amaci, bir akisin her elemani uzerinde belirli bir islemi gerceklestirmektir. Yani, Stream icinde dongu yapmak icin kullanilir. Her eleman uzerinde belirtilen bir lambda ifadesi veya metod referansi uygulanarak islem gerceklestirilir.

-toArray
Java Stream API'deki toArray metodu, bir akistaki elemanlari bir diziye donusturmek icin kullanilir. Bu metod, akistaki elemanlari iceren bir dizi olusturur ve bu diziyi dondurur.

-min
Java Stream API'deki min metodu, bir akistaki elemanlarin minimum degerini bulmak icin kullanilir.

-max
bir akistaki elemanlarin max degerini bulmak icin kullanilir.

=anyMatch
Java Stream API'deki anyMatch metodu, bir akisin elemanlarindan en az birinin belirli bir kosulu saglayip saglamadigini kontrol etmek icin kullanilir.

-allmatch
"allMatch(), akistaki tum elemanlarin kosulu saglayip saglamadigini kontrol eder."

-noneMatch
"noneMatch(), kosulu saglayan hicbir elemanin olup olmadigini kontrol eder."

-findfirst
"findFirst(), akistaki ilk giris icin bir Optional dondurur; elbette ki bu Optional bos olabilir."

-findAny
Java Stream API'deki findAny metodu, bir akistaki elemanlardan herhangi birini (random bir sekilde) bulmak icin kullanilir. Bu metot, elemanlarin sirasiz bir sekilde islendigi paralel akislarda ozellikle kullanislidir. findAny metodu bir Optional nesnesi dondurur; bu nesne, elemanin bulunup bulunmadigini belirtir.


-reduce
??

-collect
Java Stream API'deki collect metodu, bir akistan elde edilen elemanlari toplamak ve belirli bir koleksiyona eklemek icin kullanilir. Bu metodun kullanimi, akistaki elemanlari toplamak, gruplamak, siralamak veya baska bir sekilde bir araya getirmek icin cok cesitli islemleri destekler.
