package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.UsersForIndividualAssetResponse

/**
 * 
 * @param response 
 */
case class UpdateMemberAssetsResultsResponseArrayItemsInner(response: Option[UsersForIndividualAssetResponse]
                )

object UpdateMemberAssetsResultsResponseArrayItemsInner {
    /**
     * Creates the codec for converting UpdateMemberAssetsResultsResponseArrayItemsInner from and to JSON.
     */
    implicit val decoder: Decoder[UpdateMemberAssetsResultsResponseArrayItemsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateMemberAssetsResultsResponseArrayItemsInner] = deriveEncoder
}
