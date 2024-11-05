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
 * @param items List of invite and request data.
 * @param bookmark 
 */
case class GetInvites200Response(items: Seq[InviteResponse],
                bookmark: Option[String]
                )

object GetInvites200Response {
    /**
     * Creates the codec for converting GetInvites200Response from and to JSON.
     */
    implicit val decoder: Decoder[GetInvites200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetInvites200Response] = deriveEncoder
}
