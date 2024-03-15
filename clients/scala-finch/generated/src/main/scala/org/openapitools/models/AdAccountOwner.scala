package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param username Public username for the user account
 * @param id The owning account's user ID.
 */
case class AdAccountOwner(username: Option[String],
                id: Option[String]
                )

object AdAccountOwner {
    /**
     * Creates the codec for converting AdAccountOwner from and to JSON.
     */
    implicit val decoder: Decoder[AdAccountOwner] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdAccountOwner] = deriveEncoder
}
