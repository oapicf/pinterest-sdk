package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Permissions
import scala.collection.immutable.Seq

/**
 * 
 * @param partnerUnderscoreid Unique identifier of a business partner to update asset access to.
 * @param assetUnderscoreid Unique identifier of the business asset.
 * @param permissions A non-empty array of permissions to assign to the partner.
 */
case class UpdatePartnerAssetAccessBodyAccessesInner(partnerUnderscoreid: String,
                assetUnderscoreid: String,
                permissions: Seq[Permissions]
                )

object UpdatePartnerAssetAccessBodyAccessesInner {
    /**
     * Creates the codec for converting UpdatePartnerAssetAccessBodyAccessesInner from and to JSON.
     */
    implicit val decoder: Decoder[UpdatePartnerAssetAccessBodyAccessesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdatePartnerAssetAccessBodyAccessesInner] = deriveEncoder
}
