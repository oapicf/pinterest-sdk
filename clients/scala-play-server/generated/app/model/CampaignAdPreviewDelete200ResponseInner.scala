package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for campaign_ad_preview_delete_200_response_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CampaignAdPreviewDelete200ResponseInner(
  status: CampaignAdPreviewDelete200ResponseInnerStatus
)

object CampaignAdPreviewDelete200ResponseInner {
  implicit lazy val campaignAdPreviewDelete200ResponseInnerJsonFormat: Format[CampaignAdPreviewDelete200ResponseInner] = Json.format[CampaignAdPreviewDelete200ResponseInner]
}

