package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BusinessAccessError

/**
 * 
 * @param exception 
 * @param memberUnderscoreorUnderscorepartnerUnderscoreid 
 */
case class UpdatePartnerResultsResponseArrayItemsInner(exception: Option[BusinessAccessError],
                memberUnderscoreorUnderscorepartnerUnderscoreid: Option[String]
                )

object UpdatePartnerResultsResponseArrayItemsInner {
    /**
     * Creates the codec for converting UpdatePartnerResultsResponseArrayItemsInner from and to JSON.
     */
    implicit val decoder: Decoder[UpdatePartnerResultsResponseArrayItemsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdatePartnerResultsResponseArrayItemsInner] = deriveEncoder
}
