package model

import play.api.libs.json._

/**
  * Item in a batch campaign response.
  * @param data Campaign data on success.
  * @param exceptions Exceptions on failure.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CampaignBatchItem(
  data: Option[CampaignBatchResponseData],
  exceptions: Option[List[Exception]]
)

object CampaignBatchItem {
  implicit lazy val campaignBatchItemJsonFormat: Format[CampaignBatchItem] = Json.format[CampaignBatchItem]
}

