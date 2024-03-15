package model

import play.api.libs.json._

/**
  * Request for creation of entities in bulk.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class BulkUpsertRequestUpdate(
  campaigns: Option[List[CampaignUpdateRequest]],
  adGroups: Option[List[AdGroupUpdateRequest]],
  ads: Option[List[AdUpdateRequest]],
  productGroups: Option[List[ProductGroupPromotionUpdateRequest]],
  keywords: Option[List[KeywordUpdate]]
)

object BulkUpsertRequestUpdate {
  implicit lazy val bulkUpsertRequestUpdateJsonFormat: Format[BulkUpsertRequestUpdate] = Json.format[BulkUpsertRequestUpdate]
}

