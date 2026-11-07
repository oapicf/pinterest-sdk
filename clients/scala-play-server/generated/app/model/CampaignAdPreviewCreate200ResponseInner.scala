package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for campaign_ad_preview_create_200_response_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CampaignAdPreviewCreate200ResponseInner(
  data: CampaignAdPreviewCreate200ResponseInnerData
)

object CampaignAdPreviewCreate200ResponseInner {
  implicit lazy val campaignAdPreviewCreate200ResponseInnerJsonFormat: Format[CampaignAdPreviewCreate200ResponseInner] = Json.format[CampaignAdPreviewCreate200ResponseInner]
}

