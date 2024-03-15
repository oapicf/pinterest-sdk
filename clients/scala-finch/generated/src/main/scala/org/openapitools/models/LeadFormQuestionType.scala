package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Lead form question type
 */
case class LeadFormQuestionType()

object LeadFormQuestionType {
    /**
     * Creates the codec for converting LeadFormQuestionType from and to JSON.
     */
    implicit val decoder: Decoder[LeadFormQuestionType] = deriveDecoder
    implicit val encoder: ObjectEncoder[LeadFormQuestionType] = deriveEncoder
}
