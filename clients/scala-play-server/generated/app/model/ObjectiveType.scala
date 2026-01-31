package model

import play.api.libs.json._

/**
  * Intended result of the campaign.  You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ObjectiveType(
)

object ObjectiveType {
  implicit lazy val objectiveTypeJsonFormat: Format[ObjectiveType] = Json.format[ObjectiveType]
}

