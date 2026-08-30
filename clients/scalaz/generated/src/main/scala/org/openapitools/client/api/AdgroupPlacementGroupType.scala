package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdgroupPlacementGroupType._

case class AdgroupPlacementGroupType (
  
object AdgroupPlacementGroupType {
  import DateTimeCodecs._

  implicit val AdgroupPlacementGroupTypeCodecJson: CodecJson[AdgroupPlacementGroupType] = CodecJson.derive[AdgroupPlacementGroupType]
  implicit val AdgroupPlacementGroupTypeDecoder: EntityDecoder[AdgroupPlacementGroupType] = jsonOf[AdgroupPlacementGroupType]
  implicit val AdgroupPlacementGroupTypeEncoder: EntityEncoder[AdgroupPlacementGroupType] = jsonEncoderOf[AdgroupPlacementGroupType]
}
