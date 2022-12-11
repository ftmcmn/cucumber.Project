@US15
Feature: US15

  Background: ortak adimlar
    Given Belirtilen url'e gidilir.
    When Giris icon'una tiklanir.
    And Sign in'e tiklanir.
    And Yonetici username girilir FC.
    And Yonetici password girilir FC.
    And Sign in butonuna tiklanir.
    And Items&Titles'a tiklanir FC.
    And Patient'e tiklanir FC.

  @TC011
  Scenario: TC01
    And Create a new patient'e tiklanir FC.
    Then Create or edit a Patient yazisinin goruldugu test edilir FC.
    And Sayfa kapatilir.

  @TC022
  Scenario: TC02
    Then SSN, First Name, Last Name, Birth Date, Phone, Gender, Blood Group, Address,Description, Created Date, User, Country and state City gibi hasta bilgilerinin goruldugu test edilir FC.
    And Sayfa kapatilir.

  @TC033
  Scenario: TC03
    And Create a new patient'e tiklanir FC.
    And Istenen hasta bilgileri girilir FC.
    And Save butonuna tıklanır FC.
    Then Hasta oluturuldu yazinin görundugu test edilir FC.
    And Sayfa kapatilir.

  @TC044
  Scenario: TC04
    And Edit'e tiklanir FC.
    And Hasta bilgileri guncellenir FC.
    And Save butonuna tıklanır FC.
    Then Hastanin güncellendigi yazinin görundugu test edilir FC.
    And Sayfa kapatilir.

  @TC066
  Scenario: TC06
    And Create a new patient'e tiklanir FC.
    Then Country ve Us state seceneklerinin oldugu test edilir FC.
    And Sayfa kapatilir.

  @TC088
  Scenario: TC08
    And Delete'e tiklanir FC.
    Then Hasta silindi yazisinin goruldugu test edilir FC.
    And Sayfa kapatilir.
