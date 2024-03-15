package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Language code, which is among the offical ISO 639-1 language list.
 */
case class Language()

object Language {
    /**
     * Creates the codec for converting Language from and to JSON.
     */
    implicit val decoder: Decoder[Language] = deriveDecoder
    implicit val encoder: ObjectEncoder[Language] = deriveEncoder
}
