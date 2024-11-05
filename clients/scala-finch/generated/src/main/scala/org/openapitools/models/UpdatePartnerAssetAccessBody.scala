package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.UpdatePartnerAssetAccessBodyAccessesInner
import scala.collection.immutable.Seq

/**
 * 
 * @param accesses 
 */
case class UpdatePartnerAssetAccessBody(accesses: Seq[UpdatePartnerAssetAccessBodyAccessesInner]
                )

object UpdatePartnerAssetAccessBody {
    /**
     * Creates the codec for converting UpdatePartnerAssetAccessBody from and to JSON.
     */
    implicit val decoder: Decoder[UpdatePartnerAssetAccessBody] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdatePartnerAssetAccessBody] = deriveEncoder
}
