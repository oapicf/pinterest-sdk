package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssetGroupBinding
import org.openapitools.models.GetBusinessAssetsResponseCatalogInfo

/**
 * An object containing the permissions a business has on the asset.
 * @param assetUnderscoregroupUnderscoreinfo 
 * @param assetUnderscoreid Unique identifier of a business asset.
 * @param assetUnderscoretype Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
 * @param catalogUnderscoreinfo 
 */
case class GetBusinessAssetsResponse(assetUnderscoregroupUnderscoreinfo: Option[AssetGroupBinding],
                assetUnderscoreid: Option[String],
                assetUnderscoretype: Option[String],
                catalogUnderscoreinfo: Option[GetBusinessAssetsResponseCatalogInfo]
                )

object GetBusinessAssetsResponse {
    /**
     * Creates the codec for converting GetBusinessAssetsResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetBusinessAssetsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetBusinessAssetsResponse] = deriveEncoder
}
