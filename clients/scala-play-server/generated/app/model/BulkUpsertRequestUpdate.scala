package model

import play.api.libs.json._

/**
  * Request for creation of entities in bulk.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BulkUpsertRequestUpdate(
  adGroups: Option[List[AdGroupUpdateRequest]],
  ads: Option[List[AdUpdateRequest]],
  campaigns: Option[List[CampaignUpdateRequest]],
  catalogProductGroups: Option[List[BulkUpsertRequestUpdateCatalogProductGroupsItems]],
  keywords: Option[List[KeywordUpdateGenerated]],
  labels: Option[List[LabelBulkUpdateRequest]],
  productGroups: Option[List[ProductGroupPromotionUpdateRequest]],
  schedules: Option[List[ScheduleUpdateRequest]]
)

object BulkUpsertRequestUpdate {
  implicit lazy val bulkUpsertRequestUpdateJsonFormat: Format[BulkUpsertRequestUpdate] = Json.format[BulkUpsertRequestUpdate]
}

