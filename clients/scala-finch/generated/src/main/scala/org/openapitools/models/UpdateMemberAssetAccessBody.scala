package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.UpdateMemberAssetAccessBodyAccessesInner
import scala.collection.immutable.Seq

/**
 * An object with a list of all the new accesses.
 * @param accesses 
 */
case class UpdateMemberAssetAccessBody(accesses: Seq[UpdateMemberAssetAccessBodyAccessesInner]
                )

object UpdateMemberAssetAccessBody {
    /**
     * Creates the codec for converting UpdateMemberAssetAccessBody from and to JSON.
     */
    implicit val decoder: Decoder[UpdateMemberAssetAccessBody] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateMemberAssetAccessBody] = deriveEncoder
}
