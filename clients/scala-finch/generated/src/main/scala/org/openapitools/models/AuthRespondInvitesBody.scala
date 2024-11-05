package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AuthRespondInvitesBodyInvitesInner
import scala.collection.immutable.Seq

/**
 * An object with a list of all the invites the user would like to respond to and the action to take.
 * @param invites 
 */
case class AuthRespondInvitesBody(invites: Seq[AuthRespondInvitesBodyInvitesInner]
                )

object AuthRespondInvitesBody {
    /**
     * Creates the codec for converting AuthRespondInvitesBody from and to JSON.
     */
    implicit val decoder: Decoder[AuthRespondInvitesBody] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuthRespondInvitesBody] = deriveEncoder
}
