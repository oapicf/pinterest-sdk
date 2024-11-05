package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * An object containing the permissions a business partner has on the asset.
 * @param assetUnderscoreid Unique identifier of a business asset.
 * @param assetUnderscoretype Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
 * @param partnerUnderscoreid Unique identifier of a business partner.
 * @param permissions Permission levels member or partner has on an asset.
 */
case class UpdatePartnerAssetsResult(assetUnderscoreid: Option[String],
                assetUnderscoretype: Option[String],
                partnerUnderscoreid: Option[String],
                permissions: Option[Seq[String]]
                )

object UpdatePartnerAssetsResult {
    /**
     * Creates the codec for converting UpdatePartnerAssetsResult from and to JSON.
     */
    implicit val decoder: Decoder[UpdatePartnerAssetsResult] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdatePartnerAssetsResult] = deriveEncoder
}
