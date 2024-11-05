package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssetGroupType
import scala.collection.immutable.Seq

/**
 * 
 * @param assetUnderscoregroupUnderscoreid Unique identifier of the asset group to update.
 * @param name Asset Group name
 * @param description Asset group description
 * @param assetUnderscoregroupUnderscoretypes Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
 * @param assetsUnderscoretoUnderscoreadd A list of asset ids to add to the asset group.
 * @param assetsUnderscoretoUnderscoreremove A list of asset ids to remove from the asset group.
 */
case class UpdateAssetGroupBodyAssetGroupsToUpdateInner(assetUnderscoregroupUnderscoreid: String,
                name: Option[String],
                description: Option[String],
                assetUnderscoregroupUnderscoretypes: Option[Seq[AssetGroupType]],
                assetsUnderscoretoUnderscoreadd: Option[Seq[String]],
                assetsUnderscoretoUnderscoreremove: Option[Seq[String]]
                )

object UpdateAssetGroupBodyAssetGroupsToUpdateInner {
    /**
     * Creates the codec for converting UpdateAssetGroupBodyAssetGroupsToUpdateInner from and to JSON.
     */
    implicit val decoder: Decoder[UpdateAssetGroupBodyAssetGroupsToUpdateInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateAssetGroupBodyAssetGroupsToUpdateInner] = deriveEncoder
}
