package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The current status of the invite.
 */
case class InviteStatus()

object InviteStatus {
    /**
     * Creates the codec for converting InviteStatus from and to JSON.
     */
    implicit val decoder: Decoder[InviteStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[InviteStatus] = deriveEncoder
}
