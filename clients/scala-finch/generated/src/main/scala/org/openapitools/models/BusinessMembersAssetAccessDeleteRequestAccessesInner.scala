package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param assetUnderscoreid Id of the asset on which to remove member permissions.
 * @param memberUnderscoreid Unique identifier of the member on which to perform the asset permission removal
 */
case class BusinessMembersAssetAccessDeleteRequestAccessesInner(assetUnderscoreid: String,
                memberUnderscoreid: String
                )

object BusinessMembersAssetAccessDeleteRequestAccessesInner {
    /**
     * Creates the codec for converting BusinessMembersAssetAccessDeleteRequestAccessesInner from and to JSON.
     */
    implicit val decoder: Decoder[BusinessMembersAssetAccessDeleteRequestAccessesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[BusinessMembersAssetAccessDeleteRequestAccessesInner] = deriveEncoder
}
