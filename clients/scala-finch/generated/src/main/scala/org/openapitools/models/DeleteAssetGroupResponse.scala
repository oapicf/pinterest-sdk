package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DeleteAssetGroupResponseExceptionsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param deletedUnderscoreassetUnderscoregroups A list of ids of successfully deleted asset groups.
 * @param exceptions A list of errors associated with the asset groups. Will be returned if there is an error.
 */
case class DeleteAssetGroupResponse(deletedUnderscoreassetUnderscoregroups: Option[Seq[String]],
                exceptions: Option[Seq[DeleteAssetGroupResponseExceptionsInner]]
                )

object DeleteAssetGroupResponse {
    /**
     * Creates the codec for converting DeleteAssetGroupResponse from and to JSON.
     */
    implicit val decoder: Decoder[DeleteAssetGroupResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteAssetGroupResponse] = deriveEncoder
}
