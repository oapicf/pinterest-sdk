package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Sections help organize pins within a board.
 * @param id 
 * @param name 
 */
case class BoardSection(id: Option[String],
                name: Option[String]
                )

object BoardSection {
    /**
     * Creates the codec for converting BoardSection from and to JSON.
     */
    implicit val decoder: Decoder[BoardSection] = deriveDecoder
    implicit val encoder: ObjectEncoder[BoardSection] = deriveEncoder
}
