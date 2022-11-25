@us_21
Feature: US_21
  Scenario:Staff sadece randevulari guncelleyebilir
    Given Staff url e gider
 Then Staff "My Pages" butonundan randevulari goruntuler
 When Staff edit ile randevu bilgilerinin oldugu sayfayi acar
 And Staff gerekli randevu bilgilerini tamamlayip save e tiklar
And  The appointmant is updated with identifier uyarisini gorur
