package model

import play.api.libs.json._

/**
  * Intended result of the campaign. You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BidFloorObjectiveType(
)

object BidFloorObjectiveType {
  implicit lazy val bidFloorObjectiveTypeJsonFormat: Format[BidFloorObjectiveType] = Json.format[BidFloorObjectiveType]
}

