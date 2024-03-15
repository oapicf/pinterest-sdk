package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param boardUnderscoreid Unique identifier of the board to which the pin will be saved.
 * @param boardUnderscoresectionUnderscoreid Unique identifier of the board section to which the pin will be saved.
 */
case class PinsSaveRequest(boardUnderscoreid: Option[String],
                boardUnderscoresectionUnderscoreid: Option[String]
                )

object PinsSaveRequest {
    /**
     * Creates the codec for converting PinsSaveRequest from and to JSON.
     */
    implicit val decoder: Decoder[PinsSaveRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinsSaveRequest] = deriveEncoder
}
