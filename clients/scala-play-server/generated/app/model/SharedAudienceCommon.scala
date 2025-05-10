package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SharedAudienceCommon.
  * @param audienceId Unique identifier of an audience
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class SharedAudienceCommon(
  audienceId: Option[String],
  operationType: Option[OperationType]
)

object SharedAudienceCommon {
  implicit lazy val sharedAudienceCommonJsonFormat: Format[SharedAudienceCommon] = Json.format[SharedAudienceCommon]
}

