# Android-Services
<h2>Servis Nedir ?</h2>
<h3>
<p>

Arka planda çalışan kullanıcı ile iletişime girecek bir arayüzü olmayan uygulama bileşenlerine <b>Service(Servis)</b> denir.
Servisler genel olarak uzun süren işlemlerin arka planda yapılmasını sağlamak için geliştirilen uygulama bileşenidir. 
Örneğin; müzik çalar uygulamasında dinlediğimiz müziklerin arka planda da çalmaya devam etmesini sağlar. Yani müzik uygulaması servis kullanmasaydı müzik uygulamasını kapattığımız gibi müzik de kesilirdi.
</p>


* Bir uygulama bileşeni bir servis başlatabilir. Kullanıcı başka bir uygulamaya geçiş yapsa bile başlatılan servis çalışmasına devam eder.<br>
* Ayrıcı bir bileşen bir hizmete bağlanarak işlemler gerçekleştirebilir. Hizmetler arka planda ağ işlemlerini yönetebilir, müzik çalabilir, dosya işlemlerini gerçekleştirebilir ve bir içerik sağlayıcı ile işlem yapabilirler.  

>> Servisler iki farklı yapıda bulunabilir:
>>><b>Started (Başlatılmış)</b><br>
Bir uygulama bileşeni startService() metodunu kullanarak bir hizmeti başlattığında, servis başlatılmış olur. Bir kez başlatıldıktan sonra, servisi başlatan bileşen yok edilse bile, servisler arka planda sonsuza kadar çalışabilir. Genellikle, başlatılmış bir servis tek bir işlem gerçekleştirir ve geriye bir sonuç döndürmez. Örneğin ağ üzerinden bir dosya indirme işlemini bitirdiğinde, servis kendi kendini sona erdirir.<br>
>>><b>Bound (Bağlanılmış)</b><br>
Bir uygulama bileşeni bindService() metodunu kullanarak bir hizmete bağlandığında, servis bağlanılmış olur. Bağlanılmış bir servis bileşenlerin servis ile iletişim sağlaması, istekler göndermesi, sonuçlar elde etmesi ve karşılıklı iletişim (Interprocess Communication - IPC) ile işlemler gerçekleştirmesi için bir istemci-sunucu arayüzü sağlar. Bağlanılmış servis bir uygulama bileşeni ona bağlı kaldığı sürece çalışmasına devam eder. Aynı zamanda bir servise bağlanan tüm bileşenler bağlantıyı kestiğinde, servis yok edilir.

<p>
Örnek proje aşağıdaki görseldeki gibidir. Start butonu servisi başlatacaktır.Ve stop butonu servisi durduracaktır. Başlayınca bildirimler kullanılarak kullanıcıya bilgi verilir.

</p>







