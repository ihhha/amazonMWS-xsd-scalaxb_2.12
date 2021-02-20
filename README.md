# amazonMWS-xsd-scalaxb_2.12
Generate Scala source files containing case classes to represent the data and typeclass instances to turn XML documents into an object, and the object back to XML for Amazon MWS

## How to

### Generate code

#### Requirements

*  Java 8 SDK
*  [SBT](https://www.scala-sbt.org/) scala build tool

#### Run
In the project directory run `sbt clean scalaxb` command and you will find your code in the `target/scala-2.12/src_managed/main/sbt-scalaxb`

### XSD
You may find list of the amazon MWS xsd urls in the src/main/xsd downloadCurl.sh and downloadHttpie.sh
*  downloadCurl.sh` - download all xsd files to the current directory using CURL. On Linux may be need to fix encoding issues
*  `downloadHttpie.sh` - download all xsd files to the current directory using [HTTPie](https://httpie.io/)

