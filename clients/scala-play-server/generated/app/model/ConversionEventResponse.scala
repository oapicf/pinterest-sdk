package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionEventResponse.
  * @param conversionTagId Id of the tag.
  * @param adAccountId Id of the ad account.
  * @param createdTime Creation date in epoch format.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ConversionEventResponse(
  conversionEvent: Option[ConversionTagType],
  conversionTagId: Option[String],
  adAccountId: Option[String],
  createdTime: Option[Int]
)

object ConversionEventResponse {
  implicit lazy val conversionEventResponseJsonFormat: Format[ConversionEventResponse] = Json.format[ConversionEventResponse]
}

