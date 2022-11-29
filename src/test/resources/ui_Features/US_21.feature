@US_21
Feature: US_21
  Background: Ortak Adımlar
    Given Staff url e gider
    Then Staff "My Pages" butonundan randevulari goruntuler
    When Staff edit ile randevu bilgilerinin oldugu sayfayi acar
    @US21_TC001
  Scenario: Staff sadece randevulari guncelleyebilir
    And Staff gerekli randevu bilgilerini tamamlayip save e tiklar
    And  The appointmant is updated with identifier uyarisini gorur

    @US21_TC002
  Scenario: (TC002) Staff, hasta durumunu "unapproved, pending veya cancelled" yapabilmeli ancak "completed" yapamamali
 Then Staff status un Unapproved yapilabildigini gorur
 When Staff status un Pending yapilabildigini gorur
 And Staff status un Cancelled yapilabildigini gorur
 And Staff status un Completed yapilamadigini gorur

    @US21_TC004
      Scenario: (TC004 Staff, hasta için gerekli doktoru seçebilmeli ve randevuyu olusturmalı.)
    And Staff physician kismindan doktoru secer ve save'e tiklar
    And The appointment is updated with identifier uyarisini_ gorur

