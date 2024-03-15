package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BidFloorSpec
import org.openapitools.models.TargetingSpec
import scala.collection.immutable.Seq

/**
 * 
 * @param bidUnderscorefloorUnderscorespecs 
 * @param targetingUnderscorespec 
 */
case class BidFloorRequest(bidUnderscorefloorUnderscorespecs: Seq[BidFloorSpec],
                targetingUnderscorespec: Option[TargetingSpec]
                )

object BidFloorRequest {
    /**
     * Creates the codec for converting BidFloorRequest from and to JSON.
     */
    implicit val decoder: Decoder[BidFloorRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[BidFloorRequest] = deriveEncoder
}
