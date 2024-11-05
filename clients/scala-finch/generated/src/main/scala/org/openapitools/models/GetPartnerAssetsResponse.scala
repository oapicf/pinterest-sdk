package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssetGroupBinding
import scala.collection.immutable.Seq

/**
 * An object containing the permissions a you/your business partner has on the asset.
 * @param assetUnderscoreid Unique identifier of a business asset.
 * @param assetUnderscoretype Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
 * @param permissions The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset.
 * @param assetUnderscoregroupUnderscoreinfo 
 */
case class GetPartnerAssetsResponse(assetUnderscoreid: Option[String],
                assetUnderscoretype: Option[String],
                permissions: Option[Seq[String]],
                assetUnderscoregroupUnderscoreinfo: Option[AssetGroupBinding]
                )

object GetPartnerAssetsResponse {
    /**
     * Creates the codec for converting GetPartnerAssetsResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetPartnerAssetsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetPartnerAssetsResponse] = deriveEncoder
}
