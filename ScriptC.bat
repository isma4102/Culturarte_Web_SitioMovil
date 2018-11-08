mkdir build\web
cd build\web
xcopy /s /y ..\..\web\* .
xcopy /s /y ..\..\lib\* WEB-INF\lib\
mkdir WEB-INF\classes\
mkdir ..\generated-sources\
cd ..\generated-sources\

wsimport -keep -Xnocompile -p servicios http://127.0.0.1:8280/servicioAltaP?wsdl
wsimport -keep -Xnocompile -p servicios http://127.0.0.1:8280/servicioConsultaU?wsdl
wsimport -keep -Xnocompile -p servicios http://127.0.0.1:8280/servicioConsultaP?wsdl
wsimport -keep -Xnocompile -p servicios http://127.0.0.1:8280/servicioRegistrarC?wsdl
wsimport -keep -Xnocompile -p servicios http://127.0.0.1:8280/servicioInicio?wsdl
wsimport -keep -Xnocompile -p servicios http://127.0.0.1:8280/servicioAltaUsuario?wsdl

cd ..\..\
javac -cp "lib\*;C:\Program Files\Apache Software Foundation\Tomcat 9.0\lib\*;" -d .\build\web\WEB-INF\classes\ .\src\java\clases\*.java .\src\java\ControladorServlet\*.java .\build\generated-sources\servicios\*.java

cd build\web
jar cvf ..\..\Culturarte_Web_SitioMovil.war .

cd ..\..\
rd /s /q build

pause
exit