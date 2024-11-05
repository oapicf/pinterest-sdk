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
 * @param archived 
 * @param id Keyword ID .
 * @param parentUnderscoreid Keyword parent entity ID (advertiser, campaign, ad group).
 * @param parentUnderscoretype Parent entity type
 * @param _type Always keyword
 */
case class Keyword(bid: Option[Int],
                matchUnderscoretype: MatchTypeResponse,
                value: String,
                archived: Option[Boolean],
                id: Option[String],
                parentUnderscoreid: Option[String],
                parentUnderscoretype: Option[String],
                _type: Option[String]
                )

object Keyword {
    /**
     * Creates the codec for converting Keyword from and to JSON.
     */
    implicit val decoder: Decoder[Keyword] = deriveDecoder
    implicit val encoder: ObjectEncoder[Keyword] = deriveEncoder
}
