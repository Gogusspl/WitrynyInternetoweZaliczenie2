Aby uruchomić należy:

1) zainstalować:

Java 21+
gradle 8.5 +
oraz node.js 21+

2) klonowanie repozytorium - przykład

- zrób pusty folder
- za pomocą terminala cmd lub povershell git clove https://github.com/Gogusspl/WitrynyInternetoweZaliczenie2 nazwa-folderu

3) Uruchamianie Backend

W intelij lub innym środowisku jdk

File - open i należy wybrac folder ChinaCars Backend, następnie poczekać aż zbuduje się gradle. 

ewentualnie komenda w terminalu .\gradlew.bat  build

Gdy gradle się zbuduje w terminalu intelij należy wpisać:

.\gradlew.bat bootRun

w terminalu powinno się pojawić, że aplikacja uruchomiła się na porcie 8080

4) Uruchamianie Frontend

w webstorm / visualstudio należy otworzyć folder ZaliczenieSkepSamochodowy
następnie w terminalu:
npm install

po zakończeniu instalacji można uruchomić aplikacje

ng serve
