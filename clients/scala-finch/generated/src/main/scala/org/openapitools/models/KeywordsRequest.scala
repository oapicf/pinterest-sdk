package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.KeywordsCommon
import scala.collection.immutable.Seq

/**
 * 
 * @param keywords Keyword JSON array. Each array element has 3 fields
 * @param parentUnderscoreid Keyword parent entity ID (advertiser, campaign, ad group).
 */
case class KeywordsRequest(keywords: Seq[KeywordsCommon],
                parentUnderscoreid: String
                )

object KeywordsRequest {
    /**
     * Creates the codec for converting KeywordsRequest from and to JSON.
     */
    implicit val decoder: Decoder[KeywordsRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[KeywordsRequest] = deriveEncoder
}
