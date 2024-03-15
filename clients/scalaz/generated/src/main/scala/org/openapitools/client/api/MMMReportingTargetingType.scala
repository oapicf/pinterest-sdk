package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MMMReportingTargetingType._

case class MMMReportingTargetingType (
  
object MMMReportingTargetingType {
  import DateTimeCodecs._

  implicit val MMMReportingTargetingTypeCodecJson: CodecJson[MMMReportingTargetingType] = CodecJson.derive[MMMReportingTargetingType]
  implicit val MMMReportingTargetingTypeDecoder: EntityDecoder[MMMReportingTargetingType] = jsonOf[MMMReportingTargetingType]
  implicit val MMMReportingTargetingTypeEncoder: EntityEncoder[MMMReportingTargetingType] = jsonEncoderOf[MMMReportingTargetingType]
}
