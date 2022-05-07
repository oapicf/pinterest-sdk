package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param username 
 */
case class BoardOwner(username: Option[String]
                )

object BoardOwner {
    /**
     * Creates the codec for converting BoardOwner from and to JSON.
     */
    implicit val decoder: Decoder[BoardOwner] = deriveDecoder
    implicit val encoder: ObjectEncoder[BoardOwner] = deriveEncoder
}
