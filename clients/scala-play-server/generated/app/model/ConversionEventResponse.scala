package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionEventResponse.
  * @param adAccountId Id of the ad account.
  * @param conversionTagId Id of the tag.
  * @param createdTime Creation date in epoch format.
  * @param reportingConversionEvent For advertiser-defined events, the reporting event label shown in optimization UIs.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ConversionEventResponse(
  adAccountId: Option[String],
  conversionEvent: Option[ConversionTagType],
  conversionTagId: Option[String],
  createdTime: Option[Int],
  reportingConversionEvent: Option[String]
)

object ConversionEventResponse {
  implicit lazy val conversionEventResponseJsonFormat: Format[ConversionEventResponse] = Json.format[ConversionEventResponse]
}

