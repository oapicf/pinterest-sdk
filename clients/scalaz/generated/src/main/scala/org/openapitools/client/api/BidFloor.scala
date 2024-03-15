package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BidFloor._

case class BidFloor (
  /* A list of bid floors in micro currency. For example, [100000, 200000] */
  bidFloors: Option[List[Integer]],
/* Always the string 'bidfloor' */
  `type`: Option[String])

object BidFloor {
  import DateTimeCodecs._

  implicit val BidFloorCodecJson: CodecJson[BidFloor] = CodecJson.derive[BidFloor]
  implicit val BidFloorDecoder: EntityDecoder[BidFloor] = jsonOf[BidFloor]
  implicit val BidFloorEncoder: EntityEncoder[BidFloor] = jsonEncoderOf[BidFloor]
}
