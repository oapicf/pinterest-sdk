package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsItemValidationErrors
import org.openapitools.models.CatalogsItemValidationWarnings

/**
 * 
 * @param itemUnderscorenumber Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
 * @param itemUnderscoreid The merchant-created unique ID that represents the product.
 * @param errors 
 * @param warnings 
 */
case class CatalogsItemValidationIssues(itemUnderscorenumber: Int,
                itemUnderscoreid: String,
                errors: CatalogsItemValidationErrors,
                warnings: CatalogsItemValidationWarnings
                )

object CatalogsItemValidationIssues {
    /**
     * Creates the codec for converting CatalogsItemValidationIssues from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsItemValidationIssues] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsItemValidationIssues] = deriveEncoder
}
