package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TieBreakerType._

case class TieBreakerType (
  
object TieBreakerType {
  import DateTimeCodecs._

  implicit val TieBreakerTypeCodecJson: CodecJson[TieBreakerType] = CodecJson.derive[TieBreakerType]
  implicit val TieBreakerTypeDecoder: EntityDecoder[TieBreakerType] = jsonOf[TieBreakerType]
  implicit val TieBreakerTypeEncoder: EntityEncoder[TieBreakerType] = jsonEncoderOf[TieBreakerType]
}
