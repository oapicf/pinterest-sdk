package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdGroupUpdateRequest
import org.openapitools.models.AdUpdateRequest
import org.openapitools.models.CampaignUpdateRequest
import org.openapitools.models.CatalogsProductGroupsUpdateRequest
import org.openapitools.models.KeywordUpdate
import org.openapitools.models.LabelBulkUpdateRequest
import org.openapitools.models.ProductGroupPromotionUpdateRequest
import scala.collection.immutable.Seq

/**
 * Request for creation of entities in bulk.
 * @param adUnderscoregroups 
 * @param ads 
 * @param campaigns 
 * @param catalogUnderscoreproductUnderscoregroups 
 * @param keywords 
 * @param labels 
 * @param productUnderscoregroups 
 */
case class BulkUpsertRequestUpdate(adUnderscoregroups: Option[Seq[AdGroupUpdateRequest]],
                ads: Option[Seq[AdUpdateRequest]],
                campaigns: Option[Seq[CampaignUpdateRequest]],
                catalogUnderscoreproductUnderscoregroups: Option[Seq[CatalogsProductGroupsUpdateRequest]],
                keywords: Option[Seq[KeywordUpdate]],
                labels: Option[Seq[LabelBulkUpdateRequest]],
                productUnderscoregroups: Option[Seq[ProductGroupPromotionUpdateRequest]]
                )

object BulkUpsertRequestUpdate {
    /**
     * Creates the codec for converting BulkUpsertRequestUpdate from and to JSON.
     */
    implicit val decoder: Decoder[BulkUpsertRequestUpdate] = deriveDecoder
    implicit val encoder: ObjectEncoder[BulkUpsertRequestUpdate] = deriveEncoder
}
