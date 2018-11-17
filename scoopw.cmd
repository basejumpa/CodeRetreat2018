@echo off
setlocal enableextensions

if not defined HTTP_PROXY  set HTTP_PROXY=http://Debugger:debu02@cias3basic.conti.de:8080
if not defined HTTPS_PROXY set HTTPS_PROXY=%HTTP_PROXY%

set INDICATOR_INSTALLED="%USERPROFILE%\scoop\shims\scoop.cmd"
if not exist %INDICATOR_INSTALLED% (
    powershell.exe -ExecutionPolicy RemoteSigned "iex (new-object net.webclient).downloadstring('https://get.scoop.sh')" || goto :error
)

"scoop.cmd" %*

goto :EOF
:error
exit /b %errorlevel%
