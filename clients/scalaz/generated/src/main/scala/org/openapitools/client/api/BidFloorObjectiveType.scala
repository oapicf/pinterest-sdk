package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BidFloorObjectiveType._

case class BidFloorObjectiveType (
  
object BidFloorObjectiveType {
  import DateTimeCodecs._

  implicit val BidFloorObjectiveTypeCodecJson: CodecJson[BidFloorObjectiveType] = CodecJson.derive[BidFloorObjectiveType]
  implicit val BidFloorObjectiveTypeDecoder: EntityDecoder[BidFloorObjectiveType] = jsonOf[BidFloorObjectiveType]
  implicit val BidFloorObjectiveTypeEncoder: EntityEncoder[BidFloorObjectiveType] = jsonEncoderOf[BidFloorObjectiveType]
}
