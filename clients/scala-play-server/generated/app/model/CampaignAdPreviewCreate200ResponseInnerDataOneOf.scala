package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for campaign_ad_preview_create_200_response_inner_data_oneOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CampaignAdPreviewCreate200ResponseInnerDataOneOf(
  exceptions: Error
)

object CampaignAdPreviewCreate200ResponseInnerDataOneOf {
  implicit lazy val campaignAdPreviewCreate200ResponseInnerDataOneOfJsonFormat: Format[CampaignAdPreviewCreate200ResponseInnerDataOneOf] = Json.format[CampaignAdPreviewCreate200ResponseInnerDataOneOf]
}

