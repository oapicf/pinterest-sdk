package model

import play.api.libs.json._

/**
  * Metrics availablity, e.g., \"READY\".
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class DataStatus(
)

object DataStatus {
  implicit lazy val dataStatusJsonFormat: Format[DataStatus] = Json.format[DataStatus]
}

