package model

import play.api.libs.json._

/**
  * Request for creation of entities in bulk.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
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

