@US16
Feature: US16

  Background: ortak adimlar
    Given Belirtilen url'e gidilir.
    When Giris icon'una tiklanir.
    And Sign in'e tiklanir.
    And Yonetici username girilir FC.
    And Yonetici password girilir FC.
    And Sign in butonuna tiklanir.
    And Items&Titles'a tiklanir FC.
    And Room'e tiklanir FC.

  @TC01Room
  Scenario: TC01

    And Create a new room'a tiklanir FC.
    And Oda bilgileri doldurulur FC.
    And SaveRoom butonuna tıklanır FC.
    Then Yeni oda olusturuldu yazisinin goruldugu test edilir FC.
    And Sayfa kapatilir.

  @TC02Room
  Scenario: TC02
    And Create a new room'a tiklanir FC.
    And Room number bos birakilir FC.
    Then This field is required yazisinin goruldugu test edilir FC.
    And Sayfa kapatilir.

  @TC03Room
  Scenario: TC03
    And Create a new room'a tiklanir FC.
    Then Room type olarak TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE goruldugu test edilir FC.
    And Sayfa kapatilir.

  @TC04Room
  Scenario: TC04
    And Create a new room'a tiklanir FC.
    Then Status'un ayarlanabilir oldugu test edilir FC.
    And Sayfa kapatilir.

  @TC05Room
  Scenario: TC05
    And Create a new room'a tiklanir FC.
    And Price alani doldurulur FC.
    Then Price'ın eklendigi test edilir FC.
    And Sayfa kapatilir.

  @TC06Room
  Scenario: TC06
    And Create a new room'a tiklanir FC.
    And Price alani boş birakilir FC.
    Then Price'ın bos birakilmadıgı test edilir FC.
    And Sayfa kapatilir.

  @TC07Room
  Scenario: TC07
    And Create a new room'a tiklanir FC.
    And Description alaninin bos birakilir FC.
    Then Description alaninin bos birakilabildigi test edilir FC.
    And Sayfa kapatilir.

  @TC08Room
  Scenario: TC08
    And Create a new room'a tiklanir FC.
    Then Tarihin gun ay yil seklinde oldugu test edilir FC.
    And Sayfa kapatilir.

  @TC10Room
  Scenario: TC10
    And Room Type'a tiklanir FC.
    Then Ayni tur odalarin gorulebildigi test edilir FC.
    And Sayfa kapatilir.

  @TC11Room
  Scenario: TC11
    And Room Edit'e tiklanir FC.
    And Odanin bilgileri düzenlenir FC.
    And Save'e tiklanir FC.
    Then Secilen odanin guncellendigi test edilir FC.
    And Sayfa kapatilir.

  @TC12Room
  Scenario: TC12
    And Secilen odanin delete butonuna tiklanir FC.
    Then Odanin silinebildigi test edilir FC.
    And Sayfa kapatilir.


