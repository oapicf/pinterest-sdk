package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Entity status
 */
case class EntityStatus()

object EntityStatus {
    /**
     * Creates the codec for converting EntityStatus from and to JSON.
     */
    implicit val decoder: Decoder[EntityStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[EntityStatus] = deriveEncoder
}
