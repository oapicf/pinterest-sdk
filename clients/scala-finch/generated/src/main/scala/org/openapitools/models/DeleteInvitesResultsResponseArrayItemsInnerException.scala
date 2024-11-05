package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 * @param inviteUnderscoreid Unique identifier of an invite.
 * @param message Error message associated with the error in performing the action on the invite/request.
 */
case class DeleteInvitesResultsResponseArrayItemsInnerException(inviteUnderscoreid: Option[String],
                message: Option[String]
                )

object DeleteInvitesResultsResponseArrayItemsInnerException {
    /**
     * Creates the codec for converting DeleteInvitesResultsResponseArrayItemsInnerException from and to JSON.
     */
    implicit val decoder: Decoder[DeleteInvitesResultsResponseArrayItemsInnerException] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteInvitesResultsResponseArrayItemsInnerException] = deriveEncoder
}
