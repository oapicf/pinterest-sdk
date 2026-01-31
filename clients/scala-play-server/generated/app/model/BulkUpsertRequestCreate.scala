package model

import play.api.libs.json._

/**
  * Request for creation of entities in bulk.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BulkUpsertRequestCreate(
  adGroups: Option[List[AdGroupCreateRequest]],
  ads: Option[List[AdCreateRequest]],
  campaigns: Option[List[CampaignCreateRequest]],
  catalogProductGroups: Option[List[MultipleProductGroupsInner]],
  keywords: Option[List[KeywordsRequest]],
  labels: Option[List[LabelCreateRequest]],
  productGroups: Option[List[ProductGroupPromotionCreateRequest]]
)

object BulkUpsertRequestCreate {
  implicit lazy val bulkUpsertRequestCreateJsonFormat: Format[BulkUpsertRequestCreate] = Json.format[BulkUpsertRequestCreate]
}

