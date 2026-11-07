package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param adGroupId Ad group ID to create a preview record for.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CampaignAdPreviewCreate(
  adGroupId: String
)

object CampaignAdPreviewCreate {
  implicit lazy val campaignAdPreviewCreateJsonFormat: Format[CampaignAdPreviewCreate] = Json.format[CampaignAdPreviewCreate]
}

