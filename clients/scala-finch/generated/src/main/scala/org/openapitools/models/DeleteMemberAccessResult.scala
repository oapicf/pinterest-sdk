package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The terminated asset access.
 * @param assetUnderscoreid Unique identifier of the business asset.
 * @param memberUnderscoreid Unique identifier of the business member.
 */
case class DeleteMemberAccessResult(assetUnderscoreid: Option[String],
                memberUnderscoreid: Option[String]
                )

object DeleteMemberAccessResult {
    /**
     * Creates the codec for converting DeleteMemberAccessResult from and to JSON.
     */
    implicit val decoder: Decoder[DeleteMemberAccessResult] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteMemberAccessResult] = deriveEncoder
}
