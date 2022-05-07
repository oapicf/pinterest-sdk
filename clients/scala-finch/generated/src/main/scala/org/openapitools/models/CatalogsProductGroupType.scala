package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Catalog product group type
 */
case class CatalogsProductGroupType()

object CatalogsProductGroupType {
    /**
     * Creates the codec for converting CatalogsProductGroupType from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupType] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupType] = deriveEncoder
}
