package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PlacementGroupType._

case class PlacementGroupType (
  
object PlacementGroupType {
  import DateTimeCodecs._

  implicit val PlacementGroupTypeCodecJson: CodecJson[PlacementGroupType] = CodecJson.derive[PlacementGroupType]
  implicit val PlacementGroupTypeDecoder: EntityDecoder[PlacementGroupType] = jsonOf[PlacementGroupType]
  implicit val PlacementGroupTypeEncoder: EntityEncoder[PlacementGroupType] = jsonEncoderOf[PlacementGroupType]
}
