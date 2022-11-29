@US_23
Feature: US_23
  Background: Ortak stepler
    Given Staff url adresine giris yapar
    When  Staff "My Pages" butonundan randevularinii goruntuler
  @US23_TC009
Scenario: Kullanici, Muayene ucreti, test urun fiyatlari gibi tüm faturalari goruntuleyebilir
   Then  Staff Show Appointmenti tiklar
And  Staff payment  invoice process e tiklar
And  Staff Payment Detail de muayene, test ucretlerinin  gorundugunu dogrular
  @US23_TC010
 Scenario: Staff, hasta için yeni bir fatura oluşturabilir.
Then  Staff, Show Appointmenta tiklar
And  Staff payment invoice veya create invoice  butonuna tiklar
And  Staff create invoice yazisini goruntuler
  @US23_TC011
  Scenario: Kullanici daha sonra hastaya gonderilen faturayi gorebilir
Then  Staff, Show Appointment tan payment  invoice process e tiklar
And  Staff  acilan sayfada  show invoice yazisina tiklar
And  Staff acilan sayfada invoice basligini dogrular


