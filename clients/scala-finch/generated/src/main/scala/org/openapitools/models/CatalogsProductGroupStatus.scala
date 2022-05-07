package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class CatalogsProductGroupStatus()

object CatalogsProductGroupStatus {
    /**
     * Creates the codec for converting CatalogsProductGroupStatus from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupStatus] = deriveEncoder
}
