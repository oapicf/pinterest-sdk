package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for campaign_ad_preview_delete_200_response_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CampaignAdPreviewDelete200ResponseInner(
  status: CampaignAdPreviewDelete200ResponseInnerStatus
)

object CampaignAdPreviewDelete200ResponseInner {
  implicit lazy val campaignAdPreviewDelete200ResponseInnerJsonFormat: Format[CampaignAdPreviewDelete200ResponseInner] = Json.format[CampaignAdPreviewDelete200ResponseInner]
}

