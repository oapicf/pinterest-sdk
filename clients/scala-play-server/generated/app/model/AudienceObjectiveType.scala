package model

import play.api.libs.json._

/**
  * Objective for engagement audience filter. Used only on ad account audience rule; matches baseline ObjectiveType (no VIDEO_VIEW, WEB_SESSIONS).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AudienceObjectiveType(
)

object AudienceObjectiveType {
  implicit lazy val audienceObjectiveTypeJsonFormat: Format[AudienceObjectiveType] = Json.format[AudienceObjectiveType]
}

