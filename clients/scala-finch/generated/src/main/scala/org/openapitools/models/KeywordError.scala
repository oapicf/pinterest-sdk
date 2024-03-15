package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Keyword
import scala.collection.immutable.Seq

/**
 * 
 * @param data 
 * @param errorUnderscoremessages 
 */
case class KeywordError(data: Option[Keyword],
                errorUnderscoremessages: Option[Seq[String]]
                )

object KeywordError {
    /**
     * Creates the codec for converting KeywordError from and to JSON.
     */
    implicit val decoder: Decoder[KeywordError] = deriveDecoder
    implicit val encoder: ObjectEncoder[KeywordError] = deriveEncoder
}
