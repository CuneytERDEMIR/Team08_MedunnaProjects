@US_22
  Feature: US_22
    Background: ortak steps
      Given Staff url adresine gider
      When Staff "My Pages" butonundan randevularini goruntuler
Scenario: Staff, hastanin SSN-ID numarasi ile arama yapabilir
  Then Staff test sonucunu gormek istedigi hastanin SSN ini girer
 And Staff Patient SSN ID ile arama yapabildigini dogrular

Scenario: Kullanici (Staff) test sonuclarini gorebilmelidir
  Then Staff Show Appointment i tiklar
And  Staff Show Tests butonuna tiklar
And Staff acilan sayfada Test Result in gorunulurlugunu dogrular

  Scenario: Staff "ID Date Result description Created date sonuc bilgilerini gorebilmeli ve guncelleyebilmelidir
 Then Staff Show Tests butonundan test sonuclarini goruntuler
 Then Staff Test Result da id, date, result, description i dogrular
 And Staff test result sonuclarinin edit ve save butonlarina tiklar
 Then Staff "A Patient is updated with identifier" i goruntuler






