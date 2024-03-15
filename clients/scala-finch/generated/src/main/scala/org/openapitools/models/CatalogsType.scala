package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Type of the catalog entity.
 */
case class CatalogsType()

object CatalogsType {
    /**
     * Creates the codec for converting CatalogsType from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsType] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsType] = deriveEncoder
}
