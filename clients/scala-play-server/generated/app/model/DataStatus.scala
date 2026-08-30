package model

import play.api.libs.json._

/**
  * Metrics availablity, e.g., \"READY\".
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class DataStatus(
)

object DataStatus {
  implicit lazy val dataStatusJsonFormat: Format[DataStatus] = Json.format[DataStatus]
}

