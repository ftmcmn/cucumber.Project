@US03
Feature: US03 Registration sayfasında guclu sifre girilmeli ve "Password strength" seviyeleri gorulebilmelidir.

  Background: ortak adimlar
    Given Kullanici belirtilen medunnaUrl'e gider.
    When Kullanici sayfada sag ustte bulunan kisi iconuna tiklar ve sign in ve register sekmesi acilir.
    And Acilan kutucukta register secenegini tiklanir.
    And Acilanin Register sayfasi oldugu dogrulanir.

  Scenario:TC01 Daha guclu sifre icin en az 1 kucuk harf olmali ve "Password strength" seviyesinin degistigi gorulebilmelidir.

    And PassWord bolumune alti tane buyuk harf girdikten sonra bir tane kucuk harf girilir.
    Then "Password streght" renk seviyesini degistigi test edilir.
    And Sayfa kapatilir.

  Scenario: TC02 Sifre en az 1 buyuk harf icermeli ve  "Password strength" seviyesinin degistigi gorulebilmelidir.

    And PassWord bolumune alti tane kucuk harf girdikten sonra bir tane buyuk harf girilir.
    Then Password strenght seviyesinin degistigi test edilir.
    And Sayfa kapatilir.

  Scenario: TC03 Sifre en az 1 rakam icermeli ve "Password strength" seviyesinin degistigi gorulebilmelidir.

    Then  PassWord bolumune alti tane kucuk harf girdikten sonra bir tane buyuk harf girilir.
    And  Password strenght seviyesinin degistigi test edilir.
    And Sayfa kapatilir.

  Scenario: TC04 Sifre en az 1 ozel karakter icermeli ve"Password strength" seviyesinin degistigi gorulebilmelidir.
    Then PassWord bolumune alti tane buyuk harf girdikten sonra bir tane ozel karakter girilir.
    And Password strenght seviyesinin degistigi test edilir.
    And Sayfa kapatilir.

  Scenario: TC05 Guclu bir parola için sifre en az 7 karakterden olusmalıdır.
    And Register sayfasinda bulunan Password kismina 7 karakterden az rakam,ozel karakter ve harf girilir.
    Then "Password streght" renk seviyesini degismedigi test edilir.
    And  Sayfa kapatilir.

  Scenario: TC06 Guclu bir parola için sifre en az 7 karakterden olusmalıdır.
    And   Buyuk, kucuk harf, rakam, ozel 6 karakter girilir.
    Then   Yedinci harf girilince guclu bir sifre olustugu test edilir.
    And Sayfa kapatilir.