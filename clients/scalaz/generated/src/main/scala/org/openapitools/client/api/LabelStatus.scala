package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LabelStatus._

case class LabelStatus (
  
object LabelStatus {
  import DateTimeCodecs._

  implicit val LabelStatusCodecJson: CodecJson[LabelStatus] = CodecJson.derive[LabelStatus]
  implicit val LabelStatusDecoder: EntityDecoder[LabelStatus] = jsonOf[LabelStatus]
  implicit val LabelStatusEncoder: EntityEncoder[LabelStatus] = jsonEncoderOf[LabelStatus]
}
