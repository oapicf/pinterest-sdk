package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NullableEntityStatus._

case class NullableEntityStatus (
  
object NullableEntityStatus {
  import DateTimeCodecs._

  implicit val NullableEntityStatusCodecJson: CodecJson[NullableEntityStatus] = CodecJson.derive[NullableEntityStatus]
  implicit val NullableEntityStatusDecoder: EntityDecoder[NullableEntityStatus] = jsonOf[NullableEntityStatus]
  implicit val NullableEntityStatusEncoder: EntityEncoder[NullableEntityStatus] = jsonEncoderOf[NullableEntityStatus]
}
