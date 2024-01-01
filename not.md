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



