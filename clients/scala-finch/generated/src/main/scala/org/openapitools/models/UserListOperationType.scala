package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * User list operation type (add or remove)
 */
case class UserListOperationType()

object UserListOperationType {
    /**
     * Creates the codec for converting UserListOperationType from and to JSON.
     */
    implicit val decoder: Decoder[UserListOperationType] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserListOperationType] = deriveEncoder
}
