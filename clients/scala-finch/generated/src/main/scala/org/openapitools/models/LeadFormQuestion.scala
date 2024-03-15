package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LeadFormQuestionFieldType
import org.openapitools.models.LeadFormQuestionType
import scala.collection.immutable.Seq

/**
 * 
 * @param questionUnderscoretype 
 * @param customUnderscorequestionUnderscorefieldUnderscoretype 
 * @param customUnderscorequestionUnderscorelabel Question label for a custom question.
 * @param customUnderscorequestionUnderscoreoptions Question options for a custom question.
 */
case class LeadFormQuestion(questionUnderscoretype: Option[LeadFormQuestionType],
                customUnderscorequestionUnderscorefieldUnderscoretype: Option[LeadFormQuestionFieldType],
                customUnderscorequestionUnderscorelabel: Option[String],
                customUnderscorequestionUnderscoreoptions: Option[Seq[String]]
                )

object LeadFormQuestion {
    /**
     * Creates the codec for converting LeadFormQuestion from and to JSON.
     */
    implicit val decoder: Decoder[LeadFormQuestion] = deriveDecoder
    implicit val encoder: ObjectEncoder[LeadFormQuestion] = deriveEncoder
}
