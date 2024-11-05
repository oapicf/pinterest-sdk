package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DeleteInvitesResultsResponseArrayItemsInner
import scala.collection.immutable.Seq

/**
 * Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id
 * @param items List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled.
 */
case class DeleteInvitesResultsResponseArray(items: Option[Seq[DeleteInvitesResultsResponseArrayItemsInner]]
                )

object DeleteInvitesResultsResponseArray {
    /**
     * Creates the codec for converting DeleteInvitesResultsResponseArray from and to JSON.
     */
    implicit val decoder: Decoder[DeleteInvitesResultsResponseArray] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteInvitesResultsResponseArray] = deriveEncoder
}
