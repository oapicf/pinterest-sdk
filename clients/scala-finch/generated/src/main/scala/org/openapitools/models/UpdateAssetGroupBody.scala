package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.UpdateAssetGroupBodyAssetGroupsToUpdateInner
import scala.collection.immutable.Seq

/**
 * 
 * @param assetUnderscoregroupsUnderscoretoUnderscoreupdate A list of asset groups and the data that will be used to update them.
 */
case class UpdateAssetGroupBody(assetUnderscoregroupsUnderscoretoUnderscoreupdate: Option[Seq[UpdateAssetGroupBodyAssetGroupsToUpdateInner]]
                )

object UpdateAssetGroupBody {
    /**
     * Creates the codec for converting UpdateAssetGroupBody from and to JSON.
     */
    implicit val decoder: Decoder[UpdateAssetGroupBody] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateAssetGroupBody] = deriveEncoder
}
