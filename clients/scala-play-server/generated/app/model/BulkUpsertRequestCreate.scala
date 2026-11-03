package model

import play.api.libs.json._

/**
  * Request for creation of entities in bulk.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BulkUpsertRequestCreate(
  adGroups: Option[List[AdGroupCreateRequest]],
  ads: Option[List[AdCreateRequest]],
  campaigns: Option[List[CampaignCreateRequest]],
  catalogProductGroups: Option[List[BulkUpsertRequestCreateCatalogProductGroupsItems]],
  keywords: Option[List[KeywordsRequest]],
  labels: Option[List[LabelBulkCreateRequest]],
  productGroups: Option[List[ProductGroupPromotionCreateRequest]],
  schedules: Option[List[ScheduleCreateRequest]]
)

object BulkUpsertRequestCreate {
  implicit lazy val bulkUpsertRequestCreateJsonFormat: Format[BulkUpsertRequestCreate] = Json.format[BulkUpsertRequestCreate]
}

