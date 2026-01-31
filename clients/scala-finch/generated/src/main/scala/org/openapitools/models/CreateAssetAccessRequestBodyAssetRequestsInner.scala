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
 * @param assetUnderscoreidUnderscoretoUnderscorepermissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
 * @param partnerUnderscoreid Unique identifier of a business partner to request asset access to.
 */
case class CreateAssetAccessRequestBodyAssetRequestsInner(assetUnderscoreidUnderscoretoUnderscorepermissions: Map[String, Seq[Permissions]],
                partnerUnderscoreid: String
                )

object CreateAssetAccessRequestBodyAssetRequestsInner {
    /**
     * Creates the codec for converting CreateAssetAccessRequestBodyAssetRequestsInner from and to JSON.
     */
    implicit val decoder: Decoder[CreateAssetAccessRequestBodyAssetRequestsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateAssetAccessRequestBodyAssetRequestsInner] = deriveEncoder
}
