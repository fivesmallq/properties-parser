# simple-properties
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/im.nll.data/simple-properties/badge.svg)](https://maven-badges.herokuapp.com/maven-central/im.nll.data/simple-properties/)
[![Build Status](https://travis-ci.org/fivesmallq/simple-properties.svg)](https://travis-ci.org/fivesmallq/simple-properties)
[![codecov.io](http://codecov.io/github/fivesmallq/simple-propertiesr/coverage.svg?branch=master)](http://codecov.io/github/fivesmallq/simple-properties?branch=master)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)


# Overview

* implemented in plain Java with no dependencies
* support UTF-8 for properties file
* users can override the config with Java system properties, `java -Dmyapp.foo.bar=10`
* substitute environment variables (`logdir=${HOME}/logs`)
* merges multiple config files use `@include.redis=redis.properties`

# Usage
To add a dependency on simple-properties using Maven, use the following:

```xml
<dependency>
    <groupId>im.nll.data</groupId>
    <artifactId>simple-properties</artifactId>
    <version>0.9.0-SNAPSHOT</version>
</dependency>
```

To add a dependency using Gradle:

```
dependencies {
  compile 'im.nll.data:simple-properties:0.9.0-SNAPSHOT'
}
```


# Examples

TODO

# Contributing

Bug reports and pull requests are welcome on GitHub at https://github.com/fivesmallq/simple-properties.
