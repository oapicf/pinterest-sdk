package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SharedAudienceResponseCommon.
  * @param audienceId Audience ID that was shared
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class SharedAudienceResponseCommon(
  audienceId: Option[String],
  permissions: Option[List[Role]]
)

object SharedAudienceResponseCommon {
  implicit lazy val sharedAudienceResponseCommonJsonFormat: Format[SharedAudienceResponseCommon] = Json.format[SharedAudienceResponseCommon]
}

