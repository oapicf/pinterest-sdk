package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BidFloorRequest._

case class BidFloorRequest (
  bidFloorSpecs: List[BidFloorSpec],
targetingSpec: Option[TargetingSpec])

object BidFloorRequest {
  import DateTimeCodecs._

  implicit val BidFloorRequestCodecJson: CodecJson[BidFloorRequest] = CodecJson.derive[BidFloorRequest]
  implicit val BidFloorRequestDecoder: EntityDecoder[BidFloorRequest] = jsonOf[BidFloorRequest]
  implicit val BidFloorRequestEncoder: EntityEncoder[BidFloorRequest] = jsonEncoderOf[BidFloorRequest]
}
