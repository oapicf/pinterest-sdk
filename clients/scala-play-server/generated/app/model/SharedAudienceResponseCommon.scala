package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SharedAudienceResponseCommon.
  * @param audienceId Audience ID that was shared
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class SharedAudienceResponseCommon(
  audienceId: Option[String],
  permissions: Option[List[Role]]
)

object SharedAudienceResponseCommon {
  implicit lazy val sharedAudienceResponseCommonJsonFormat: Format[SharedAudienceResponseCommon] = Json.format[SharedAudienceResponseCommon]
}

