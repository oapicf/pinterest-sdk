package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Keyword
import org.openapitools.models.KeywordError
import scala.collection.immutable.Seq

/**
 * 
 * @param errors 
 * @param keywords 
 */
case class KeywordsResponse(errors: Option[Seq[KeywordError]],
                keywords: Option[Seq[Keyword]]
                )

object KeywordsResponse {
    /**
     * Creates the codec for converting KeywordsResponse from and to JSON.
     */
    implicit val decoder: Decoder[KeywordsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[KeywordsResponse] = deriveEncoder
}
