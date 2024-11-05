package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Permissions
import scala.collection.immutable.Seq

/**
 * 
 * @param assetUnderscoreid Id of the asset to update.
 * @param memberUnderscoreid Unique identifier of the member on which to perform the update
 * @param permissions A non-empty array of permissions to assign to the member.
 */
case class UpdateMemberAssetAccessBodyAccessesInner(assetUnderscoreid: String,
                memberUnderscoreid: String,
                permissions: Seq[Permissions]
                )

object UpdateMemberAssetAccessBodyAccessesInner {
    /**
     * Creates the codec for converting UpdateMemberAssetAccessBodyAccessesInner from and to JSON.
     */
    implicit val decoder: Decoder[UpdateMemberAssetAccessBodyAccessesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateMemberAssetAccessBodyAccessesInner] = deriveEncoder
}
