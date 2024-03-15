package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class CatalogsItemValidationIssue()

object CatalogsItemValidationIssue {
    /**
     * Creates the codec for converting CatalogsItemValidationIssue from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsItemValidationIssue] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsItemValidationIssue] = deriveEncoder
}
