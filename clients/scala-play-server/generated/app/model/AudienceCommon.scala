package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AudienceCommon.
  * @param adAccountId Ad account ID.
  * @param name Audience name.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AudienceCommon(
  adAccountId: Option[String],
  name: Option[String],
  rule: Option[AudienceRule]
)

object AudienceCommon {
  implicit lazy val audienceCommonJsonFormat: Format[AudienceCommon] = Json.format[AudienceCommon]
}

