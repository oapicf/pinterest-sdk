package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Granularity.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class Granularity(
)

object Granularity {
  implicit lazy val granularityJsonFormat: Format[Granularity] = Json.format[Granularity]
}

