package model

import play.api.libs.json._

/**
  * Breakdown of asset counts by entity status.
  * @param ACTIVE Count of ACTIVE assets
  * @param ARCHIVED Count of ARCHIVED assets
  * @param PAUSED Count of PAUSED assets
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TotalCountByEntityStatus(
  ACTIVE: Option[Int],
  ARCHIVED: Option[Int],
  PAUSED: Option[Int]
)

object TotalCountByEntityStatus {
  implicit lazy val totalCountByEntityStatusJsonFormat: Format[TotalCountByEntityStatus] = Json.format[TotalCountByEntityStatus]
}

