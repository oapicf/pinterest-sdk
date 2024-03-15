package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Lead form question field type
 */
case class LeadFormQuestionFieldType()

object LeadFormQuestionFieldType {
    /**
     * Creates the codec for converting LeadFormQuestionFieldType from and to JSON.
     */
    implicit val decoder: Decoder[LeadFormQuestionFieldType] = deriveDecoder
    implicit val encoder: ObjectEncoder[LeadFormQuestionFieldType] = deriveEncoder
}
