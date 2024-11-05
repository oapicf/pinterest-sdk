package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BusinessAccessUserSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id Asset Group ID.
 * @param assetUnderscoregroupUnderscorename Asset Group name
 * @param assetUnderscoregroupUnderscoredescription Asset group description
 * @param assetUnderscoregroupUnderscoretypes Asset group types
 * @param adUnderscoreaccountsUnderscoreids A list of ad account IDs under the asset group
 * @param profilesUnderscoreids A list of profile IDs under asset group
 * @param createdUnderscoretime The creation time of the asset group
 * @param updatedUnderscoretime The last update time of the asset group
 * @param owner The data of the business that owns the asset group.
 * @param createdUnderscoreby The data of the user that created the asset group.
 */
case class AssetGroupBinding(id: Option[String],
                assetUnderscoregroupUnderscorename: Option[String],
                assetUnderscoregroupUnderscoredescription: Option[String],
                assetUnderscoregroupUnderscoretypes: Option[Seq[String]],
                adUnderscoreaccountsUnderscoreids: Option[Seq[String]],
                profilesUnderscoreids: Option[Seq[String]],
                createdUnderscoretime: Option[Int],
                updatedUnderscoretime: Option[Int],
                owner: Option[BusinessAccessUserSummary],
                createdUnderscoreby: Option[BusinessAccessUserSummary]
                )

object AssetGroupBinding {
    /**
     * Creates the codec for converting AssetGroupBinding from and to JSON.
     */
    implicit val decoder: Decoder[AssetGroupBinding] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssetGroupBinding] = deriveEncoder
}
