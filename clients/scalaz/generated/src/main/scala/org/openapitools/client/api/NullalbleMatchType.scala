package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NullalbleMatchType._

case class NullalbleMatchType (
  
object NullalbleMatchType {
  import DateTimeCodecs._

  implicit val NullalbleMatchTypeCodecJson: CodecJson[NullalbleMatchType] = CodecJson.derive[NullalbleMatchType]
  implicit val NullalbleMatchTypeDecoder: EntityDecoder[NullalbleMatchType] = jsonOf[NullalbleMatchType]
  implicit val NullalbleMatchTypeEncoder: EntityEncoder[NullalbleMatchType] = jsonEncoderOf[NullalbleMatchType]
}
