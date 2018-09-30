# Universal Scalability Law Modeling with Java and usl4j

Examples for using measurements of a web application and applying [usl4j] to predict
the application's behavior if the parameters (latency, througput, concurrency) change.

More information: See [Little's law] and [Universal Scalability Law].

## Running the Example

Using [Maven], simply run:

```bash
mvn exec:java -Dexec.mainClass=com.hascode.tutorial.SampleUSLCalculation
```

Please feel free to visit my blog at [www.hascode.com]() for the full tutorial.

----
**2018 Micha Kops / hasCode.com**

  [usl4j]:https://github.com/codahale/usl4j
  [Little's law]:https://en.wikipedia.org/wiki/Little%27s_law
  [Universal Scalability Law]:http://www.perfdynamics.com/Manifesto/USLscalability.html
  [Maven]:http://maven.apache.org/