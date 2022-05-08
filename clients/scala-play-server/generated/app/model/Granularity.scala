package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Granularity.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class Granularity(
)

object Granularity {
  implicit lazy val granularityJsonFormat: Format[Granularity] = Json.format[Granularity]
}

