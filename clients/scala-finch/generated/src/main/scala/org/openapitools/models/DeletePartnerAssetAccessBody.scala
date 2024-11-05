package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DeletePartnerAssetAccessBodyAccessesInner
import scala.collection.immutable.Seq

/**
 * 
 * @param accesses 
 */
case class DeletePartnerAssetAccessBody(accesses: Seq[DeletePartnerAssetAccessBodyAccessesInner]
                )

object DeletePartnerAssetAccessBody {
    /**
     * Creates the codec for converting DeletePartnerAssetAccessBody from and to JSON.
     */
    implicit val decoder: Decoder[DeletePartnerAssetAccessBody] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeletePartnerAssetAccessBody] = deriveEncoder
}
