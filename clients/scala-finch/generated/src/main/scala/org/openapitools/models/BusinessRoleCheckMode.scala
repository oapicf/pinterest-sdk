package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Specifies if the partner is internal or external.
 */
case class BusinessRoleCheckMode()

object BusinessRoleCheckMode {
    /**
     * Creates the codec for converting BusinessRoleCheckMode from and to JSON.
     */
    implicit val decoder: Decoder[BusinessRoleCheckMode] = deriveDecoder
    implicit val encoder: ObjectEncoder[BusinessRoleCheckMode] = deriveEncoder
}
