package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateAssetInvitesRequestItem
import scala.collection.immutable.Seq

/**
 * Request body for updating asset roles for existing invites.
 * @param invites 
 */
case class CreateAssetInvitesRequest(invites: Seq[CreateAssetInvitesRequestItem]
                )

object CreateAssetInvitesRequest {
    /**
     * Creates the codec for converting CreateAssetInvitesRequest from and to JSON.
     */
    implicit val decoder: Decoder[CreateAssetInvitesRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateAssetInvitesRequest] = deriveEncoder
}
