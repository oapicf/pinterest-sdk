package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Product item fields
 */
case class NullableCatalogsItemFieldType()

object NullableCatalogsItemFieldType {
    /**
     * Creates the codec for converting NullableCatalogsItemFieldType from and to JSON.
     */
    implicit val decoder: Decoder[NullableCatalogsItemFieldType] = deriveDecoder
    implicit val encoder: ObjectEncoder[NullableCatalogsItemFieldType] = deriveEncoder
}
