package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 *  This field contains multiple options to a quiz question.
 * @param id 
 * @param text 
 */
case class QuizPinOption(id: Option[BigDecimal],
                text: Option[String]
                )

object QuizPinOption {
    /**
     * Creates the codec for converting QuizPinOption from and to JSON.
     */
    implicit val decoder: Decoder[QuizPinOption] = deriveDecoder
    implicit val encoder: ObjectEncoder[QuizPinOption] = deriveEncoder
}
