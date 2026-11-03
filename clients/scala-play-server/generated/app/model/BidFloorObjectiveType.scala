package model

import play.api.libs.json._

/**
  * Intended result of the campaign. You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BidFloorObjectiveType(
)

object BidFloorObjectiveType {
  implicit lazy val bidFloorObjectiveTypeJsonFormat: Format[BidFloorObjectiveType] = Json.format[BidFloorObjectiveType]
}

