package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The file format of a feed.
 */
case class CatalogsFormat()

object CatalogsFormat {
    /**
     * Creates the codec for converting CatalogsFormat from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFormat] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFormat] = deriveEncoder
}
