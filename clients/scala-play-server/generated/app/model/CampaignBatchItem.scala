package model

import play.api.libs.json._

/**
  * Item in a batch campaign response.
  * @param data Campaign data on success.
  * @param exceptions Exceptions on failure.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CampaignBatchItem(
  data: Option[CampaignBatchResponseData],
  exceptions: Option[List[Exception]]
)

object CampaignBatchItem {
  implicit lazy val campaignBatchItemJsonFormat: Format[CampaignBatchItem] = Json.format[CampaignBatchItem]
}

