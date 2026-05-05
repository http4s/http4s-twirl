# http4s-twirl

Provides http4s entity codec instances for [Twirl][twirl] templates.

## SBT coordinates

```scala
libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-twirl" % http4sTwirlV
)
```

## Compatibility

| http4s-twirl | http4s-core | twirl | Scala 2.12 | Scala 2.13 | Scala 3 | Scala.js | Scala Native | Status |
|:-------------|:------------|:------|------------|------------|---------|----------|--------------|:-------|
| 0.23.x       | 0.23.x      | 1.x   | ✅         | ✅         | ❌      | ❌       | ❌           | EOL    |
| 0.24.x       | 0.23.x      | 2.x   | ✅         | ✅         | ✅      | ❌       | ❌           | Stable |

[twirl]: https://github.com/playframework/twirl
