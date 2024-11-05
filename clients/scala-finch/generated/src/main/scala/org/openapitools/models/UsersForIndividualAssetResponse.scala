package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * An object containing the permissions a business member has on the asset.
 * @param assetUnderscoreid Unique identifier of a business asset.
 * @param memberUnderscoreid Unique identifier of the business member with asset access.
 * @param permissions Permission levels member or partner has on an asset.
 */
case class UsersForIndividualAssetResponse(assetUnderscoreid: Option[String],
                memberUnderscoreid: Option[String],
                permissions: Option[Seq[String]]
                )

object UsersForIndividualAssetResponse {
    /**
     * Creates the codec for converting UsersForIndividualAssetResponse from and to JSON.
     */
    implicit val decoder: Decoder[UsersForIndividualAssetResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[UsersForIndividualAssetResponse] = deriveEncoder
}
