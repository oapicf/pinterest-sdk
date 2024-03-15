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
 * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
 * @param questions 
 * @param results 
 */
case class AdCommonQuizPinData(questions: Option[Seq[QuizPinQuestion]],
                results: Option[Seq[QuizPinResult]]
                )

object AdCommonQuizPinData {
    /**
     * Creates the codec for converting AdCommonQuizPinData from and to JSON.
     */
    implicit val decoder: Decoder[AdCommonQuizPinData] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdCommonQuizPinData] = deriveEncoder
}
