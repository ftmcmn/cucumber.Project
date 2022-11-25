@US09
Feature: US09 "Staff (Personel),hasta bilgilerini görebilmeli, düzenleyebilmeli ama silememelidir."

  Background: ortak adimlar
    Given Belirtilen url'e gidilir.
    When Giris icon'una tiklanir.
    And Sign in'e tiklanir.
    And Personel username girilir.
    And Personel password girilir.
    And Sign in butonuna tiklanir.
    And My pages'a tiklanir.
    And Search patient'e tiklanir.


  Scenario: TC01 "My Pages" sekmesinden hasta bilgilerini görebilmelidir.
    And Patient ssn box'a ssn girilir.
    And View'e tiklanir.
    Then Hasta bilgilerinin goruldugu test edilir.
    And Sayfa kapatilir.
@TC02
  Scenario: TC02 "Kullanıcı bütün hasta bilgilerini ""id, firstname, lastname, birthdate, email, phone, gender, blood group,
  address, description, user, country and state/city"" düzenleyebilmelidir."
    And Patient ssn box'a ssn girilir.
    And Edit butonuna tiklanir.
    And firstname lastname birthdate email phone gender blood group address description user country and state city bilgileri duzenlenir.
    And Save butonuna tiklanir.
    Then firstname lastname birthdate email phone gender blood group address description user country and state city bilgilerin düzenlenebildigi test edilir.
    And Sayfa kapatilir.

@TC03
  Scenario: TC03 Kullanıcı, SSN'lerine göre yeni bir başvuru sahibi arayabilmeli ve tüm kayıt bilgilerinin doldurulduğunu görebilmelidir.
    And Ssn girilerek aranabildiği test edilir.
    And Show Appointments'e tiklanir.
    Then Tum kayit bilgilerinin dolduruldugu test edilir.
    And Sayfa kapatilir.

  ##Scenario: TC04 Kullanıcı herhangi bir hasta bilgisini silebilir.

  ##10-Delete butonu yok(bug)


















































