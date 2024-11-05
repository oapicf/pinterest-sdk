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
 * @param assetUnderscoregroupUnderscorename Asset Group name
 * @param assetUnderscoregroupUnderscoredescription Asset group description
 * @param assetUnderscoregroupUnderscoretypes Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
 */
case class CreateAssetGroupBody(assetUnderscoregroupUnderscorename: String,
                assetUnderscoregroupUnderscoredescription: String,
                assetUnderscoregroupUnderscoretypes: Seq[AssetGroupType]
                )

object CreateAssetGroupBody {
    /**
     * Creates the codec for converting CreateAssetGroupBody from and to JSON.
     */
    implicit val decoder: Decoder[CreateAssetGroupBody] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateAssetGroupBody] = deriveEncoder
}
