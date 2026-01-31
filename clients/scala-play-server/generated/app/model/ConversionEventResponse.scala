package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionEventResponse.
  * @param adAccountId Id of the ad account.
  * @param conversionTagId Id of the tag.
  * @param createdTime Creation date in epoch format.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ConversionEventResponse(
  adAccountId: Option[String],
  conversionEvent: Option[ConversionTagType],
  conversionTagId: Option[String],
  createdTime: Option[Int]
)

object ConversionEventResponse {
  implicit lazy val conversionEventResponseJsonFormat: Format[ConversionEventResponse] = Json.format[ConversionEventResponse]
}

