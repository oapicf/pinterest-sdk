package model

import play.api.libs.json._

/**
  * Response model for batch campaign write operations.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CampaignBatchWriteResponseModel(
  items: List[CampaignBatchItem]
)

object CampaignBatchWriteResponseModel {
  implicit lazy val campaignBatchWriteResponseModelJsonFormat: Format[CampaignBatchWriteResponseModel] = Json.format[CampaignBatchWriteResponseModel]
}

