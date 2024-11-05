package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * Request body used to cancel invites
 * @param inviteUnderscoreids List of invite/request ids to be cancelled
 */
case class CancelInvitesBody(inviteUnderscoreids: Seq[String]
                )

object CancelInvitesBody {
    /**
     * Creates the codec for converting CancelInvitesBody from and to JSON.
     */
    implicit val decoder: Decoder[CancelInvitesBody] = deriveDecoder
    implicit val encoder: ObjectEncoder[CancelInvitesBody] = deriveEncoder
}
