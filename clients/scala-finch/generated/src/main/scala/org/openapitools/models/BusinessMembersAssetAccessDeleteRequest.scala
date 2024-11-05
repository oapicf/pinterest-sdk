package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BusinessMembersAssetAccessDeleteRequestAccessesInner
import scala.collection.immutable.Seq

/**
 * 
 * @param accesses List of members asset access to be deleted
 */
case class BusinessMembersAssetAccessDeleteRequest(accesses: Seq[BusinessMembersAssetAccessDeleteRequestAccessesInner]
                )

object BusinessMembersAssetAccessDeleteRequest {
    /**
     * Creates the codec for converting BusinessMembersAssetAccessDeleteRequest from and to JSON.
     */
    implicit val decoder: Decoder[BusinessMembersAssetAccessDeleteRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[BusinessMembersAssetAccessDeleteRequest] = deriveEncoder
}
