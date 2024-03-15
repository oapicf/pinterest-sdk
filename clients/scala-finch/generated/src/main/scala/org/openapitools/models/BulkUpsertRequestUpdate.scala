package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdGroupUpdateRequest
import org.openapitools.models.AdUpdateRequest
import org.openapitools.models.CampaignUpdateRequest
import org.openapitools.models.KeywordUpdate
import org.openapitools.models.ProductGroupPromotionUpdateRequest
import scala.collection.immutable.Seq

/**
 * Request for creation of entities in bulk.
 * @param campaigns 
 * @param adUnderscoregroups 
 * @param ads 
 * @param productUnderscoregroups 
 * @param keywords 
 */
case class BulkUpsertRequestUpdate(campaigns: Option[Seq[CampaignUpdateRequest]],
                adUnderscoregroups: Option[Seq[AdGroupUpdateRequest]],
                ads: Option[Seq[AdUpdateRequest]],
                productUnderscoregroups: Option[Seq[ProductGroupPromotionUpdateRequest]],
                keywords: Option[Seq[KeywordUpdate]]
                )

object BulkUpsertRequestUpdate {
    /**
     * Creates the codec for converting BulkUpsertRequestUpdate from and to JSON.
     */
    implicit val decoder: Decoder[BulkUpsertRequestUpdate] = deriveDecoder
    implicit val encoder: ObjectEncoder[BulkUpsertRequestUpdate] = deriveEncoder
}
