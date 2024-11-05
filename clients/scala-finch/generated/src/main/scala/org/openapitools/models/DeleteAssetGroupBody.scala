package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * Request body used to delete asset groups
 * @param assetUnderscoregroupsUnderscoretoUnderscoredelete List of ids of asset groups to be deleted
 */
case class DeleteAssetGroupBody(assetUnderscoregroupsUnderscoretoUnderscoredelete: Seq[String]
                )

object DeleteAssetGroupBody {
    /**
     * Creates the codec for converting DeleteAssetGroupBody from and to JSON.
     */
    implicit val decoder: Decoder[DeleteAssetGroupBody] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteAssetGroupBody] = deriveEncoder
}
