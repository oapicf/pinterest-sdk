package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.QuizPinQuestion
import org.openapitools.models.QuizPinResult
import scala.collection.immutable.Seq

/**
 * This field includes all quiz data including questions, options, and results.
 * @param questions 
 * @param results 
 */
case class QuizPinData(questions: Option[Seq[QuizPinQuestion]],
                results: Option[Seq[QuizPinResult]]
                )

object QuizPinData {
    /**
     * Creates the codec for converting QuizPinData from and to JSON.
     */
    implicit val decoder: Decoder[QuizPinData] = deriveDecoder
    implicit val encoder: ObjectEncoder[QuizPinData] = deriveEncoder
}
