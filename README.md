## mobile_browserstack1
To run tests at BrowserStack:
```bash
gradle clean test -Denv=browserStack -DdeviceName={device name from browserStack} -DosVersion={os version from browserStack} -Dlogin={browserStack_login} -Dpassword={browserStack_password}
```
