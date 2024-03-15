package model

import play.api.libs.json._

/**
  * Request for creation of entities in bulk.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class BulkUpsertRequestCreate(
  campaigns: Option[List[CampaignCreateRequest]],
  adGroups: Option[List[AdGroupCreateRequest]],
  ads: Option[List[AdCreateRequest]],
  productGroups: Option[List[ProductGroupPromotionCreateRequest]],
  keywords: Option[List[KeywordsRequest]]
)

object BulkUpsertRequestCreate {
  implicit lazy val bulkUpsertRequestCreateJsonFormat: Format[BulkUpsertRequestCreate] = Json.format[BulkUpsertRequestCreate]
}

