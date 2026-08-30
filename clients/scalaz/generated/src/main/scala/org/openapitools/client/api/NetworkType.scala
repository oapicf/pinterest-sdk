package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NetworkType._

case class NetworkType (
  
object NetworkType {
  import DateTimeCodecs._

  implicit val NetworkTypeCodecJson: CodecJson[NetworkType] = CodecJson.derive[NetworkType]
  implicit val NetworkTypeDecoder: EntityDecoder[NetworkType] = jsonOf[NetworkType]
  implicit val NetworkTypeEncoder: EntityEncoder[NetworkType] = jsonEncoderOf[NetworkType]
}
