package model

import play.api.libs.json._

/**
  * Metrics availablity, e.g., \"READY\".
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class DataStatus(
)

object DataStatus {
  implicit lazy val dataStatusJsonFormat: Format[DataStatus] = Json.format[DataStatus]
}

