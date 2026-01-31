package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.InviteResponse
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items List of invite and request data.
 */
case class GetInvites200Response(bookmark: Option[String],
                items: Seq[InviteResponse]
                )

object GetInvites200Response {
    /**
     * Creates the codec for converting GetInvites200Response from and to JSON.
     */
    implicit val decoder: Decoder[GetInvites200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetInvites200Response] = deriveEncoder
}
