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
 * @param assetUnderscoretype Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
 * @param isUnderscoresharedUnderscorepartner If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
 * @param partnerUnderscoreid Unique identifier of a business partner.
 * @param permissions Permission levels member or partner has on an asset.
 */
case class DeletePartnerAssetsResult(assetUnderscoreid: Option[String],
                assetUnderscoretype: Option[String],
                isUnderscoresharedUnderscorepartner: Option[Boolean],
                partnerUnderscoreid: Option[String],
                permissions: Option[Seq[String]]
                )

object DeletePartnerAssetsResult {
    /**
     * Creates the codec for converting DeletePartnerAssetsResult from and to JSON.
     */
    implicit val decoder: Decoder[DeletePartnerAssetsResult] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeletePartnerAssetsResult] = deriveEncoder
}
