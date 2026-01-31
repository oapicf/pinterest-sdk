package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param name New system user name
 */
case class SystemUserUpdateRequest(name: String
                )

object SystemUserUpdateRequest {
    /**
     * Creates the codec for converting SystemUserUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[SystemUserUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[SystemUserUpdateRequest] = deriveEncoder
}
