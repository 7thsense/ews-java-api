organization := "com.microsoft.ews-java-api"
name := "ews-java-api"

version := "2.1.0.ss.0"
publishMavenStyle := true
crossPaths := false
autoScalaLibrary := false

val HttpClientVersion = "4.4.1"
val CommonsIoVersion = "2.4"
val StreamflyerVersion = "1.2.0"
val CommonsLoggingVersion = "1.2"
val CommonsLang3Version = "3.4"
val JodaTimeVersion = "2.8"
val JUnitVersion  = "4.12"
val HamcrestVersion = "1.3"
val MockitoVersion = "1.10.19"
val Slf4jVersion = "1.7.12"
val LogbackVersion = "1.1.3"

libraryDependencies ++= Seq(
"org.apache.httpcomponents" % "httpclient" % HttpClientVersion,
"org.apache.httpcomponents" % "httpclient" % HttpClientVersion,
"commons-io" % "commons-io" % CommonsIoVersion,
"com.github.rwitzel.streamflyer" % "streamflyer-core" % StreamflyerVersion,
"commons-logging" % "commons-logging" % CommonsLoggingVersion,
"org.apache.commons" % "commons-lang3" % CommonsLang3Version,
"joda-time" % "joda-time" % JodaTimeVersion,
"junit" % "junit" % JUnitVersion % "test",
"com.novocode" % "junit-interface" % "0.11" % "test",
"org.hamcrest" % "hamcrest-all" % HamcrestVersion % "test",
"org.mockito" % "mockito-core" % MockitoVersion % "test",
"org.slf4j" % "slf4j-api" % Slf4jVersion % "test",
"org.slf4j" % "jcl-over-slf4j" % "1.7.7" % "test",
"ch.qos.logback" % "logback-classic" % LogbackVersion  % "test"
)

val jdk8 = System.getProperties.get("java.runtime.version").toString.startsWith("1.8")
if (jdk8) { javacOptions ++= Seq("-source", "1.7", "-Xdoclint:none") } else { javacOptions in doc ++= Seq() }

bintrayOrganization := Some("7thsense")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
