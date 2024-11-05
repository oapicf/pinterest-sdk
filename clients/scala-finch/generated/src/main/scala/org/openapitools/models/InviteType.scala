package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.
 */
case class InviteType()

object InviteType {
    /**
     * Creates the codec for converting InviteType from and to JSON.
     */
    implicit val decoder: Decoder[InviteType] = deriveDecoder
    implicit val encoder: ObjectEncoder[InviteType] = deriveEncoder
}
