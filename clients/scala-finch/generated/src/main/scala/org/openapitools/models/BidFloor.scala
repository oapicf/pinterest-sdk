package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param bidUnderscorefloors A list of bid floors in micro currency. For example, [100000, 200000]
 * @param _type Always the string 'bidfloor'
 */
case class BidFloor(bidUnderscorefloors: Option[Seq[Int]],
                _type: Option[String]
                )

object BidFloor {
    /**
     * Creates the codec for converting BidFloor from and to JSON.
     */
    implicit val decoder: Decoder[BidFloor] = deriveDecoder
    implicit val encoder: ObjectEncoder[BidFloor] = deriveEncoder
}
