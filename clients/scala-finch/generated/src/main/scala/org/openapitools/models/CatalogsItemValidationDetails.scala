package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.NullableCatalogsItemFieldType

/**
 * 
 * @param attributeUnderscorename 
 * @param providedUnderscorevalue Provided value that caused the validation issue.
 */
case class CatalogsItemValidationDetails(attributeUnderscorename: NullableCatalogsItemFieldType,
                providedUnderscorevalue: String
                )

object CatalogsItemValidationDetails {
    /**
     * Creates the codec for converting CatalogsItemValidationDetails from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsItemValidationDetails] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsItemValidationDetails] = deriveEncoder
}
