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
 * @param adUnderscoreaccountsUnderscoreids A list of ad account IDs under the asset group
 * @param assetUnderscoregroupUnderscoredescription Asset group description
 * @param assetUnderscoregroupUnderscorename Asset Group name
 * @param assetUnderscoregroupUnderscoretypes Asset group types
 * @param catalogsUnderscoreids A list of catalog IDs under asset group
 * @param createdUnderscoreby The data of the user that created the asset group.
 * @param createdUnderscoretime The creation time of the asset group
 * @param id Asset Group ID.
 * @param owner The data of the business that owns the asset group.
 * @param profilesUnderscoreids A list of profile IDs under asset group
 * @param updatedUnderscoretime The last update time of the asset group
 */
case class AssetGroupBinding(adUnderscoreaccountsUnderscoreids: Option[Seq[String]],
                assetUnderscoregroupUnderscoredescription: Option[String],
                assetUnderscoregroupUnderscorename: Option[String],
                assetUnderscoregroupUnderscoretypes: Option[Seq[String]],
                catalogsUnderscoreids: Option[Seq[String]],
                createdUnderscoreby: Option[BusinessAccessUserSummary],
                createdUnderscoretime: Option[Int],
                id: Option[String],
                owner: Option[BusinessAccessUserSummary],
                profilesUnderscoreids: Option[Seq[String]],
                updatedUnderscoretime: Option[Int]
                )

object AssetGroupBinding {
    /**
     * Creates the codec for converting AssetGroupBinding from and to JSON.
     */
    implicit val decoder: Decoder[AssetGroupBinding] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssetGroupBinding] = deriveEncoder
}
