package model

import play.api.libs.json._

/**
  * Metrics availablity, e.g., \"READY\".
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class DataStatus(
)

object DataStatus {
  implicit lazy val dataStatusJsonFormat: Format[DataStatus] = Json.format[DataStatus]
}

