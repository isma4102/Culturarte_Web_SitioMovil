setlocal enabledelayedexpansion
cd ../build/
del /q ".\web\*
FOR /D %%p IN (".\web\") DO rmdir "%%p" /s /q
mkdir web
xcopy /E /I /C ..\web\*.* .\web\
:reader
set c=0
for /f "tokens=2 delims==" %%a in (config.properties) do (
set /a c+=1
call set lin!c!=%%a
)
cd .\web\WEB-INF
mkdir  classes
cd classes
wsimport -keep -p servicios http://%lin2%:%lin1%/servicioAltaP?wsdl


wsimport -keep -p servicios http://%lin2%:%lin1%/servicioConsultaU?wsdl


wsimport -keep -p servicios http://%lin2%:%lin1%/servicioConsultaP?wsdl


wsimport -keep -p servicios http://%lin2%:%lin1%/servicioAltaUsuario?wsdl


wsimport -keep -p servicios http://%lin2%:%lin1%/servicioInicio?wsdl


wsimport -keep -p servicios http://%lin2%:%lin1%/servicioRegistrarC?wsdl
cd..\..\
cd..\..\
javac -cp "C:\xampp\tomcat\lib\servlet-api.jar;.\build\web\WEB-INF\lib\culturarte.jar;.\build\web\WEB-INF\lib\mysql-connector-java-5.1.46-bin.jar;"  -d .\build\web\WEB-INF\classes\ .\src\java\clases\*.java .\src\java\ControladorServlet\*.java .\build\generated-sources\jax-ws\servicios\*.java
cd build\web
jar cvf ..\..\Culturarte_Web_SitioMovil.war .
pause

