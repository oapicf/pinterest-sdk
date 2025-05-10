package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CampaignCreateResponseItem.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CampaignCreateResponseItem(
  data: Option[CampaignCreateResponseData],
  exceptions: Option[List[Exception]]
)

object CampaignCreateResponseItem {
  implicit lazy val campaignCreateResponseItemJsonFormat: Format[CampaignCreateResponseItem] = Json.format[CampaignCreateResponseItem]
}

