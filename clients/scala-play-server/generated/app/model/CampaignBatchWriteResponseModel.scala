package model

import play.api.libs.json._

/**
  * Response model for batch campaign write operations.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CampaignBatchWriteResponseModel(
  items: List[CampaignBatchItem]
)

object CampaignBatchWriteResponseModel {
  implicit lazy val campaignBatchWriteResponseModelJsonFormat: Format[CampaignBatchWriteResponseModel] = Json.format[CampaignBatchWriteResponseModel]
}

