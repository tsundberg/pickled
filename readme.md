Pickled

An easy way to create living documentation for your Cucumber project.
Read the feature files, add some meta data and build a site that documents your current product.

Use the resources already available and package them in a format that is easy to read and
understand for you users. The same idea as with Javadoc or Maven site.
The documentation is always updated and always correct.

# Downloading / Installation

Releases are published in [Maven Central](http://search.maven.org/)

### Getting jars

Jar files can be browsed and downloaded from [Maven Central] or https://oss.sonatype.org/content/repositories/releases/se/somath/pickled
(New releases will show up here immediately, while it takes a couple of hours to sync to Maven Central).

### Using Maven

Add a dependency in your [POM](http://maven.apache.org/pom.html):

```xml
<plugin>
    <groupId>se.somath.pickled</groupId>
    <artifactId>cucumber-plugin</artifactId>
    <version>1.0.0-SNAPSHOT</version>
    <executions>
        <execution>
            <goals>
                <goal>publish</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

The documentation will end up in ./target/documentation