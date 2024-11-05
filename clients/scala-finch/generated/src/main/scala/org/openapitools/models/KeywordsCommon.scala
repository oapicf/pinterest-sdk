package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MatchTypeResponse

/**
 * 
 * @param bid </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
 * @param matchUnderscoretype 
 * @param value Keyword value (120 chars max).
 */
case class KeywordsCommon(bid: Option[Int],
                matchUnderscoretype: MatchTypeResponse,
                value: String
                )

object KeywordsCommon {
    /**
     * Creates the codec for converting KeywordsCommon from and to JSON.
     */
    implicit val decoder: Decoder[KeywordsCommon] = deriveDecoder
    implicit val encoder: ObjectEncoder[KeywordsCommon] = deriveEncoder
}
