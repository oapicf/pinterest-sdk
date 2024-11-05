package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class Permissions()

object Permissions {
    /**
     * Creates the codec for converting Permissions from and to JSON.
     */
    implicit val decoder: Decoder[Permissions] = deriveDecoder
    implicit val encoder: ObjectEncoder[Permissions] = deriveEncoder
}
