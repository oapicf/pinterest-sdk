package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Granularity.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class Granularity(
)

object Granularity {
  implicit lazy val granularityJsonFormat: Format[Granularity] = Json.format[Granularity]
}

