package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param partnerUnderscoreid Unique identifier of a business partner to update asset access to.
 * @param assetUnderscoreid Unique identifier of the business asset.
 * @param partnerUnderscoretype If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
 */
case class DeletePartnerAssetAccessBodyAccessesInner(partnerUnderscoreid: String,
                assetUnderscoreid: String,
                partnerUnderscoretype: Option[String]
                )

object DeletePartnerAssetAccessBodyAccessesInner {
    /**
     * Creates the codec for converting DeletePartnerAssetAccessBodyAccessesInner from and to JSON.
     */
    implicit val decoder: Decoder[DeletePartnerAssetAccessBodyAccessesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeletePartnerAssetAccessBodyAccessesInner] = deriveEncoder
}
