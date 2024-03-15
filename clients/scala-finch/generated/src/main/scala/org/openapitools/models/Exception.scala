package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param code Exception error code.
 * @param message Exception message.
 */
case class Exception(code: Option[Int],
                message: Option[String]
                )

object Exception {
    /**
     * Creates the codec for converting Exception from and to JSON.
     */
    implicit val decoder: Decoder[Exception] = deriveDecoder
    implicit val encoder: ObjectEncoder[Exception] = deriveEncoder
}
