package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PlacementTrafficType._

case class PlacementTrafficType (
  
object PlacementTrafficType {
  import DateTimeCodecs._

  implicit val PlacementTrafficTypeCodecJson: CodecJson[PlacementTrafficType] = CodecJson.derive[PlacementTrafficType]
  implicit val PlacementTrafficTypeDecoder: EntityDecoder[PlacementTrafficType] = jsonOf[PlacementTrafficType]
  implicit val PlacementTrafficTypeEncoder: EntityEncoder[PlacementTrafficType] = jsonEncoderOf[PlacementTrafficType]
}
