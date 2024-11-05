package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BusinessAccessUserSummary

/**
 * An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.
 * @param id Unique identifier of the invite/request.
 * @param user Metadata for the member/partner that was sent the invite/request.
 */
case class CreateInvitesResultsResponseArrayItemsInnerInvite(id: Option[String],
                user: Option[BusinessAccessUserSummary]
                )

object CreateInvitesResultsResponseArrayItemsInnerInvite {
    /**
     * Creates the codec for converting CreateInvitesResultsResponseArrayItemsInnerInvite from and to JSON.
     */
    implicit val decoder: Decoder[CreateInvitesResultsResponseArrayItemsInnerInvite] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateInvitesResultsResponseArrayItemsInnerInvite] = deriveEncoder
}
