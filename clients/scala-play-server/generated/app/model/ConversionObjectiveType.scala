package model

import play.api.libs.json._

/**
  * Intended result of the campaign. You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ConversionObjectiveType(
)

object ConversionObjectiveType {
  implicit lazy val conversionObjectiveTypeJsonFormat: Format[ConversionObjectiveType] = Json.format[ConversionObjectiveType]
}

