package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SupplementalItemProcessingStatus._

case class SupplementalItemProcessingStatus (
  
object SupplementalItemProcessingStatus {
  import DateTimeCodecs._

  implicit val SupplementalItemProcessingStatusCodecJson: CodecJson[SupplementalItemProcessingStatus] = CodecJson.derive[SupplementalItemProcessingStatus]
  implicit val SupplementalItemProcessingStatusDecoder: EntityDecoder[SupplementalItemProcessingStatus] = jsonOf[SupplementalItemProcessingStatus]
  implicit val SupplementalItemProcessingStatusEncoder: EntityEncoder[SupplementalItemProcessingStatus] = jsonEncoderOf[SupplementalItemProcessingStatus]
}
