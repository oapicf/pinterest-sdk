package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Board fields for updates
 * @param name 
 * @param description 
 * @param privacy 
 */
case class BoardUpdate(name: Option[String],
                description: Option[String],
                privacy: Option[String]
                )

object BoardUpdate {
    /**
     * Creates the codec for converting BoardUpdate from and to JSON.
     */
    implicit val decoder: Decoder[BoardUpdate] = deriveDecoder
    implicit val encoder: ObjectEncoder[BoardUpdate] = deriveEncoder
}
