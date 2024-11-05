package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssetGroupBinding
import org.openapitools.models.UpdateAssetGroupResponseExceptionsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param updatedUnderscoreassetUnderscoregroups A list of successfully edited asset groups.
 * @param exceptions A list of errors associated with the asset groups. Will be returned if there is an error.
 */
case class UpdateAssetGroupResponse(updatedUnderscoreassetUnderscoregroups: Option[Seq[AssetGroupBinding]],
                exceptions: Option[Seq[UpdateAssetGroupResponseExceptionsInner]]
                )

object UpdateAssetGroupResponse {
    /**
     * Creates the codec for converting UpdateAssetGroupResponse from and to JSON.
     */
    implicit val decoder: Decoder[UpdateAssetGroupResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateAssetGroupResponse] = deriveEncoder
}
