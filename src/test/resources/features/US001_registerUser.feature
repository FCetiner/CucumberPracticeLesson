Feature:
  @regiter
  Scenario: TC01_register_page (kayit sayfasi)

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    Then kullanici signup login butonuna tiklar
    And kullanici, New User Signup! gorunur oldugunu test eder

  Scenario: TC02_signup_user (ilk kayit)

    When kullanici isim ve maili girer
    Then kullanici signup butonuna tiklar
    Then acilan sayfasa ENTER ACCOUNT yazisinin gorunur oldugunu test eder
    Then kullanici ayrintilari (birinci bolum) doldurur
    Then kullanici Sign up for our newsletter! checkbox ini secer
    Then kullanici Receive special offers from our partners! checkbox ini secer
    Then kullanici ayrintilari (ikinci bolum) doldurur
    Then kullanici Create Account butonuna tiklar
    Then kullanici hesabin olustugunu dogrular






  Scenario: TC03_delete_account (hesap silme)