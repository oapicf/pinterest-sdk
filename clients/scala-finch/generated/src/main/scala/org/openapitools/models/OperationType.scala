package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Operation type to share a specific audience or revoke access to a previously shared audience
 */
case class OperationType()

object OperationType {
    /**
     * Creates the codec for converting OperationType from and to JSON.
     */
    implicit val decoder: Decoder[OperationType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OperationType] = deriveEncoder
}
