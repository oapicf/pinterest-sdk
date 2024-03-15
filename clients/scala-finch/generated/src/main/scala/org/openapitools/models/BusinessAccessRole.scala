package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Permission role for business access.
 */
case class BusinessAccessRole()

object BusinessAccessRole {
    /**
     * Creates the codec for converting BusinessAccessRole from and to JSON.
     */
    implicit val decoder: Decoder[BusinessAccessRole] = deriveDecoder
    implicit val encoder: ObjectEncoder[BusinessAccessRole] = deriveEncoder
}
