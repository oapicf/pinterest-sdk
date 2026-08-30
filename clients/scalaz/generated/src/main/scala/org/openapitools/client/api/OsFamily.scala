package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OsFamily._

case class OsFamily (
  
object OsFamily {
  import DateTimeCodecs._

  implicit val OsFamilyCodecJson: CodecJson[OsFamily] = CodecJson.derive[OsFamily]
  implicit val OsFamilyDecoder: EntityDecoder[OsFamily] = jsonOf[OsFamily]
  implicit val OsFamilyEncoder: EntityEncoder[OsFamily] = jsonEncoderOf[OsFamily]
}
