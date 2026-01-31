package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * The result, and link out, based on the user’s choice.
 * @param androidUnderscoredeepUnderscorelink 
 * @param destinationUnderscoreurl 
 * @param iosUnderscoredeepUnderscorelink 
 * @param organicUnderscorepinUnderscoreid 
 * @param resultUnderscoreid 
 */
case class QuizPinResult(androidUnderscoredeepUnderscorelink: Option[String],
                destinationUnderscoreurl: Option[String],
                iosUnderscoredeepUnderscorelink: Option[String],
                organicUnderscorepinUnderscoreid: Option[String],
                resultUnderscoreid: Option[BigDecimal]
                )

object QuizPinResult {
    /**
     * Creates the codec for converting QuizPinResult from and to JSON.
     */
    implicit val decoder: Decoder[QuizPinResult] = deriveDecoder
    implicit val encoder: ObjectEncoder[QuizPinResult] = deriveEncoder
}
