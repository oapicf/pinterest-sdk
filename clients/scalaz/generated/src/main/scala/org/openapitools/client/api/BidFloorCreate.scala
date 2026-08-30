package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BidFloorCreate._

case class BidFloorCreate (
  /* List of bid floor specifications. */
  bidFloorSpecs: List[BidFloorSpec],
/* Ad group targeting specification defining the ad group target audience. */
  targetingSpec: Option[TargetingSpecOptimal])

object BidFloorCreate {
  import DateTimeCodecs._

  implicit val BidFloorCreateCodecJson: CodecJson[BidFloorCreate] = CodecJson.derive[BidFloorCreate]
  implicit val BidFloorCreateDecoder: EntityDecoder[BidFloorCreate] = jsonOf[BidFloorCreate]
  implicit val BidFloorCreateEncoder: EntityEncoder[BidFloorCreate] = jsonEncoderOf[BidFloorCreate]
}
