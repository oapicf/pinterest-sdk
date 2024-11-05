package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DeleteMemberAccessResult
import scala.collection.immutable.Seq

/**
 * 
 * @param items List of member asset permissions that were deleted.
 */
case class DeleteMemberAccessResultsResponseArray(items: Option[Seq[DeleteMemberAccessResult]]
                )

object DeleteMemberAccessResultsResponseArray {
    /**
     * Creates the codec for converting DeleteMemberAccessResultsResponseArray from and to JSON.
     */
    implicit val decoder: Decoder[DeleteMemberAccessResultsResponseArray] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteMemberAccessResultsResponseArray] = deriveEncoder
}
