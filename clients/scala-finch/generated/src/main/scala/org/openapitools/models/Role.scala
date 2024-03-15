package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * An internal role type used on business access, EMPLOYEE, ADMIN.
 */
case class Role()

object Role {
    /**
     * Creates the codec for converting Role from and to JSON.
     */
    implicit val decoder: Decoder[Role] = deriveDecoder
    implicit val encoder: ObjectEncoder[Role] = deriveEncoder
}
