package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class PermissionsWithOwner()

object PermissionsWithOwner {
    /**
     * Creates the codec for converting PermissionsWithOwner from and to JSON.
     */
    implicit val decoder: Decoder[PermissionsWithOwner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PermissionsWithOwner] = deriveEncoder
}
