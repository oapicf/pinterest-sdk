package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AudienceCommon.
  * @param adAccountId Ad account ID.
  * @param name Audience name.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AudienceCommon(
  adAccountId: Option[String],
  name: Option[String],
  rule: Option[AudienceRule]
)

object AudienceCommon {
  implicit lazy val audienceCommonJsonFormat: Format[AudienceCommon] = Json.format[AudienceCommon]
}

