package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * The result, and link out, based on the user’s choice.
 * @param organicUnderscorepinUnderscoreid 
 * @param androidUnderscoredeepUnderscorelink 
 * @param iosUnderscoredeepUnderscorelink 
 * @param destinationUnderscoreurl 
 * @param resultUnderscoreid 
 */
case class QuizPinResult(organicUnderscorepinUnderscoreid: Option[String],
                androidUnderscoredeepUnderscorelink: Option[String],
                iosUnderscoredeepUnderscorelink: Option[String],
                destinationUnderscoreurl: Option[String],
                resultUnderscoreid: Option[BigDecimal]
                )

object QuizPinResult {
    /**
     * Creates the codec for converting QuizPinResult from and to JSON.
     */
    implicit val decoder: Decoder[QuizPinResult] = deriveDecoder
    implicit val encoder: ObjectEncoder[QuizPinResult] = deriveEncoder
}
