package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PlacementType._

case class PlacementType (
  
object PlacementType {
  import DateTimeCodecs._

  implicit val PlacementTypeCodecJson: CodecJson[PlacementType] = CodecJson.derive[PlacementType]
  implicit val PlacementTypeDecoder: EntityDecoder[PlacementType] = jsonOf[PlacementType]
  implicit val PlacementTypeEncoder: EntityEncoder[PlacementType] = jsonEncoderOf[PlacementType]
}
