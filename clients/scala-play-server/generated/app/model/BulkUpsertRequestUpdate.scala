package model

import play.api.libs.json._

/**
  * Request for creation of entities in bulk.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BulkUpsertRequestUpdate(
  adGroups: Option[List[AdGroupUpdateRequest]],
  ads: Option[List[AdUpdateRequest]],
  campaigns: Option[List[CampaignUpdateRequest]],
  catalogProductGroups: Option[List[CatalogsProductGroupsUpdateRequest]],
  keywords: Option[List[KeywordUpdate]],
  labels: Option[List[LabelBulkUpdateRequest]],
  productGroups: Option[List[ProductGroupPromotionUpdateRequest]]
)

object BulkUpsertRequestUpdate {
  implicit lazy val bulkUpsertRequestUpdateJsonFormat: Format[BulkUpsertRequestUpdate] = Json.format[BulkUpsertRequestUpdate]
}

