package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.QuizPinOption
import scala.collection.immutable.Seq

/**
 * A specific quiz inquiry.
 * @param options 
 * @param questionUnderscoreid 
 * @param questionUnderscoretext 
 */
case class QuizPinQuestion(options: Option[Seq[QuizPinOption]],
                questionUnderscoreid: Option[BigDecimal],
                questionUnderscoretext: Option[String]
                )

object QuizPinQuestion {
    /**
     * Creates the codec for converting QuizPinQuestion from and to JSON.
     */
    implicit val decoder: Decoder[QuizPinQuestion] = deriveDecoder
    implicit val encoder: ObjectEncoder[QuizPinQuestion] = deriveEncoder
}
