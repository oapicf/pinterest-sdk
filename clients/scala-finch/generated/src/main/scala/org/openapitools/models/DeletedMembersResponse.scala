package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * An object with a list of members that were deleted.
 * @param deletedUnderscoremembers List of members whose business membership have been terminated.
 */
case class DeletedMembersResponse(deletedUnderscoremembers: Option[Seq[String]]
                )

object DeletedMembersResponse {
    /**
     * Creates the codec for converting DeletedMembersResponse from and to JSON.
     */
    implicit val decoder: Decoder[DeletedMembersResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeletedMembersResponse] = deriveEncoder
}
