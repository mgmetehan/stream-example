-filter
K?saca, .filter metodu, bir ak?? i?inde sadece belirli bir ko?ulu sa?layan ??eleri korumak veya se?mek i?in kullan?l?r. ?rne?in, bir listenin i?inde sadece belirli bir kritere uyan ??eleri almak i?in .filter metodunu kullanabilirsiniz.

-map
Bu metodun temel g?revi, her bir ak?? ??esine belirli bir fonksiyon uygulayarak yeni bir ak?? olu?turmakt?r. Olu?turulan bu yeni ak??, orijinal ak??tan farkl? olabilir.

-flatMap
flatMap metodu, i? i?e ge?mi? yap?lar? d?zle?tirmek i?in Java Stream API'de kullan?l?r. E?er bir stream i?inde ba?ka bir stream veya koleksiyon yap?s? bulunuyorsa, flatMap bu i? i?e ge?mi? yap?lar? d?zle?tirerek tek bir d?zle?tirilmi? stream'e d?n??t?r?r. Bu, i? i?e ge?mi? yap?lardaki elemanlar? daha rahat bir ?ekilde i?lemek ve ?zerlerinde operasyonlar yapmak i?in kullan?l?r.

-distinct
Java Stream API'ndeki distinct metodu, bir ak??taki benzersiz ??eleri filtrelemek i?in kullan?l?r. Bu metod, bir ak??taki ??elerin yaln?zca bir kopyas?n? alman?z? sa?lar. ?zellikle bir koleksiyon i?indeki tekrarlanan ??eleri ortadan kald?rmak i?in s?k?a kullan?l?r.

-sorted
Java Stream API'deki sorted metodu, bir ak??taki ??eleri belirli bir s?raya g?re s?ralamak i?in kullan?l?r. Bu metod, ak??taki ??elerin do?al s?ralama (natural ordering) veya ?zel bir kar??la?t?rma stratejisi (Comparator) kullanarak s?ralanmas?n? sa?lar.

-peek
!Bu yanlis olabilir
peek metodu, bir Java Stream'inin her ??esi ?zerinde belirli bir i?lemi ger?ekle?tirmenizi sa?lar. Ancak, bu i?lem sonucunda orijinal ak???n yap?s? de?i?mez. peek, ??eler ?zerinde ara i?lemler yapma ihtiyac? olan durumlar i?in kullan?l?r.

-limit
'limit' metodu, ak???n boyutunu azaltmak i?in kullan?l?r.

-skip
skip metodu, bir Java Stream'inde belirli bir say?daki ??eyi atlamak i?in kullan?l?r. Yani, skip metodu, ba?lang??taki belirtilen say?daki ??eyi atlar ve geri kalan ??eleri i?eren yeni bir ak?? olu?turur.

-takewhile
takeWhile metodu, Java Stream API'de bir ak??taki ??eleri belirli bir ko?ul sa?land??? s?rece alman?z? sa?lar. Ak??taki ??eler, belirtilen ko?ulun ge?erli oldu?u s?rece al?nmaya devam eder ve ko?ul ge?ersiz hale geldi?inde al?m i?lemi durur.

-dropwhile
dropWhile metodu, bir Java Stream'inde belirli bir ko?ulu sa?lad??? s?rece ??eleri atlamak i?in kullan?l?r. Ak??taki ??eler, belirtilen ko?ulun ge?erli oldu?u s?rece atlan?r ve ko?ul ge?ersiz hale geldi?inde atlam i?lemi sona erer, geri kalan ??elerle devam edilir.

-count
Java Stream API'deki count() metodu, bir ak???n i?indeki ??elerin say?s?n? d?nd?ren terminal bir i?lemdir. Bu metot, bir ak???n elemanlar?n?n toplam say?s?n? elde etmek i?in kullan?l?r.

-foreach
Bu metodun amac?, bir ak???n her eleman? ?zerinde belirli bir i?lemi ger?ekle?tirmektir. Yani, Stream i?inde d?ng? yapmak i?in kullan?l?r. Her eleman ?zerinde belirtilen bir lambda ifadesi veya metod referans? uygulanarak i?lem ger?ekle?tirilir.

-toArray
Java Stream API'deki toArray metodu, bir ak??taki elemanlar? bir diziye d?n??t?rmek i?in kullan?l?r. Bu metod, ak??taki elemanlar? i?eren bir dizi olu?turur ve bu diziyi d?nd?r?r.

-min
Java Stream API'deki min metodu, bir ak??taki elemanlar?n minimum de?erini bulmak i?in kullan?l?r.

-max
bir ak??taki elemanlar?n max de?erini bulmak i?in kullan?l?r.

=anyMatch
Java Stream API'deki anyMatch metodu, bir ak???n elemanlar?ndan en az birinin belirli bir ko?ulu sa?lay?p sa?lamad???n? kontrol etmek i?in kullan?l?r.

-allmatch
"allMatch(), ak??taki t?m elemanlar?n ko?ulu sa?lay?p sa?lamad???n? kontrol eder."

-noneMatch
"noneMatch(), ko?ulu sa?layan hi?bir eleman?n olup olmad???n? kontrol eder."

-findfirst
"findFirst(), ak??taki ilk giri? i?in bir Optional d?nd?r?r; elbette ki bu Optional bo? olabilir."

-findAny
Java Stream API'deki findAny metodu, bir ak??taki elemanlardan herhangi birini (random bir ?ekilde) bulmak i?in kullan?l?r. Bu metot, elemanlar?n s?ras?z bir ?ekilde i?lendi?i paralel ak??larda ?zellikle kullan??l?d?r. findAny metodu bir Optional nesnesi d?nd?r?r; bu nesne, eleman?n bulunup bulunmad???n? belirtir.

-reduce
??

-collect
Java Stream API'deki collect metodu, bir ak??tan elde edilen elemanlar? toplamak ve belirli bir koleksiyona eklemek i?in kullan?l?r. Bu metodun kullan?m?, ak??taki elemanlar? toplamak, gruplamak, s?ralamak veya ba?ka bir ?ekilde bir araya getirmek i?in ?ok ?e?itli i?lemleri destekler.

