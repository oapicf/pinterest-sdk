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
 * @param items 
 * @param bookmark 
 */
case class KeywordsGet200Response(items: Seq[Keyword],
                bookmark: Option[String]
                )

object KeywordsGet200Response {
    /**
     * Creates the codec for converting KeywordsGet200Response from and to JSON.
     */
    implicit val decoder: Decoder[KeywordsGet200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[KeywordsGet200Response] = deriveEncoder
}
