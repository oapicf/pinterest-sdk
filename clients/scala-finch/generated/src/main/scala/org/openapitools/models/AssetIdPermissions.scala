package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssetGroupBinding
import scala.collection.immutable.Seq

/**
 * An object containing the permissions a business member has on the asset.
 * @param assetUnderscoregroupUnderscoreinfo 
 * @param assetUnderscoreid Unique identifier of a business asset.
 * @param assetUnderscoretype Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
 * @param permissions Permission levels member or partner has on an asset.
 */
case class AssetIdPermissions(assetUnderscoregroupUnderscoreinfo: Option[AssetGroupBinding],
                assetUnderscoreid: Option[String],
                assetUnderscoretype: Option[String],
                permissions: Option[Seq[String]]
                )

object AssetIdPermissions {
    /**
     * Creates the codec for converting AssetIdPermissions from and to JSON.
     */
    implicit val decoder: Decoder[AssetIdPermissions] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssetIdPermissions] = deriveEncoder
}
