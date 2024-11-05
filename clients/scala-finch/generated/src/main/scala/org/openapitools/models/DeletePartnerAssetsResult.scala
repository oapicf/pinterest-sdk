package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * The terminated asset access.
 * @param assetUnderscoreid Unique identifier of a business asset.
 * @param assetUnderscoretype Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
 * @param permissions Permission levels member or partner has on an asset.
 * @param isUnderscoresharedUnderscorepartner If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
 * @param partnerUnderscoreid Unique identifier of a business partner.
 */
case class DeletePartnerAssetsResult(assetUnderscoreid: Option[String],
                assetUnderscoretype: Option[String],
                permissions: Option[Seq[String]],
                isUnderscoresharedUnderscorepartner: Option[Boolean],
                partnerUnderscoreid: Option[String]
                )

object DeletePartnerAssetsResult {
    /**
     * Creates the codec for converting DeletePartnerAssetsResult from and to JSON.
     */
    implicit val decoder: Decoder[DeletePartnerAssetsResult] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeletePartnerAssetsResult] = deriveEncoder
}
