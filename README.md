# Java TCP Sunucu (Çoklu İstemci Destekli)

Bu proje, **Java ile geliştirilmiş çoklu istemci destekli bir TCP sunucusudur**. Her bağlantı için ayrı bir `Thread` kullanarak istemcilerle aynı anda iletişim kurulmasına olanak tanır.

## 🚀 Özellikler

- 📡 8080 numaralı port üzerinden gelen bağlantıları dinler.
- 👥 Her bir istemci için ayrı bir iş parçacığı (thread) oluşturur.
- 💬 İstemciden gelen mesajları okur, sunucuya yazdırır ve cevap döner.
- 🧵 Gerçek zamanlı iletişimi basit bir yapıyla gerçekleştirir.
- ✅ VDS sunucular üzerinde çalıştırılmaya uygundur.

## 🧰 Kullanılan Teknolojiler

- Java SE 17+
- Java Sockets (`ServerSocket`, `Socket`)
- Multithreading (`Thread`)
- Giriş/Çıkış (`BufferedReader`, `PrintWriter`)

## Ornek Uygulama Ekran Çıktısı

Server 8080 numaralı port üzerinden başlatıldı.
[+] Birisi Bağlandı: 192.168.1.45
[CLIENT] : Selam!
[CLIENT] : Nasılsın?


## 🔒 Güvenlik ve Sunucu Yapılandırması
- **Bu sunucu şifreleme (SSL) veya kimlik doğrulama içermemektedir.** 

- **Gerçek projelerde güvenli bağlantı katmanı ve istemci kimlik doğrulaması eklenmesi önemlidir.**

- **VDS sunucuda çalıştırıyorsanız, 8080 numaralı TCP portunun açık olduğundan ve firewall ayarlarının izin verdiğinden emin olun.**

## 🧾 Lisans
Bu proje MIT Lisansı altında açık kaynak olarak sunulmuştur. Kişisel ve ticari projelerde serbestçe kullanılabilir.
