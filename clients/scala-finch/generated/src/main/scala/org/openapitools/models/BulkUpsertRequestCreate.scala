package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdCreateRequest
import org.openapitools.models.AdGroupCreateRequest
import org.openapitools.models.CampaignCreateRequest
import org.openapitools.models.KeywordsRequest
import org.openapitools.models.ProductGroupPromotionCreateRequest
import scala.collection.immutable.Seq

/**
 * Request for creation of entities in bulk.
 * @param campaigns 
 * @param adUnderscoregroups 
 * @param ads 
 * @param productUnderscoregroups 
 * @param keywords 
 */
case class BulkUpsertRequestCreate(campaigns: Option[Seq[CampaignCreateRequest]],
                adUnderscoregroups: Option[Seq[AdGroupCreateRequest]],
                ads: Option[Seq[AdCreateRequest]],
                productUnderscoregroups: Option[Seq[ProductGroupPromotionCreateRequest]],
                keywords: Option[Seq[KeywordsRequest]]
                )

object BulkUpsertRequestCreate {
    /**
     * Creates the codec for converting BulkUpsertRequestCreate from and to JSON.
     */
    implicit val decoder: Decoder[BulkUpsertRequestCreate] = deriveDecoder
    implicit val encoder: ObjectEncoder[BulkUpsertRequestCreate] = deriveEncoder
}
