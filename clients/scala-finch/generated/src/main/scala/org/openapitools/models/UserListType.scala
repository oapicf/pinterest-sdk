package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * User list type
 */
case class UserListType()

object UserListType {
    /**
     * Creates the codec for converting UserListType from and to JSON.
     */
    implicit val decoder: Decoder[UserListType] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserListType] = deriveEncoder
}
