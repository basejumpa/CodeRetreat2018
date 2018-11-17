@echo off
setlocal enableextensions

if not defined HTTP_PROXY  set HTTP_PROXY=http://Debugger:debu02@cias3basic.conti.de:8080
if not defined HTTPS_PROXY set HTTPS_PROXY=%HTTP_PROXY%

set INDICATOR_INSTALLED="%USERPROFILE%\scoop\shims\groovy.cmd"
if not exist %INDICATOR_INSTALLED% (
    scoopw.cmd install groovy@2.5.2 || goto :error
)

"groovy.cmd" %*

goto :EOF
:error
exit /b %errorlevel%
