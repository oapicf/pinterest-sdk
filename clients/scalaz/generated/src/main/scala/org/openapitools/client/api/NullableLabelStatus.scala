package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NullableLabelStatus._

case class NullableLabelStatus (
  
object NullableLabelStatus {
  import DateTimeCodecs._

  implicit val NullableLabelStatusCodecJson: CodecJson[NullableLabelStatus] = CodecJson.derive[NullableLabelStatus]
  implicit val NullableLabelStatusDecoder: EntityDecoder[NullableLabelStatus] = jsonOf[NullableLabelStatus]
  implicit val NullableLabelStatusEncoder: EntityEncoder[NullableLabelStatus] = jsonEncoderOf[NullableLabelStatus]
}
