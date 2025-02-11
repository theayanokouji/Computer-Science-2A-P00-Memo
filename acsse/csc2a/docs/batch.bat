REM create command line variables
set BIN=bin
set SRC=src
set DOCS=docs
set LIB=lib
set DATA=data

REM create an environment variable
SET JAVA_HOME=C:\jdk-21\bin

REM update the PATH environment variable
SET PATH=%PATH%;%JAVA_HOME%

REM compile my java source code
javac ..\%SRC%\Twang.java -d ..\%BIN%

REM run the byte code
java -cp ..\%BIN%\ Twang 30

REM decompile java bytecode
javap -c ..\%BIN%\Twang.class > ..\%DOCS%\ByteCode.txt

REM make the computer pause to see output
PAUSE