package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Language._

case class Language (
  
object Language {
  import DateTimeCodecs._

  implicit val LanguageCodecJson: CodecJson[Language] = CodecJson.derive[Language]
  implicit val LanguageDecoder: EntityDecoder[Language] = jsonOf[Language]
  implicit val LanguageEncoder: EntityEncoder[Language] = jsonEncoderOf[Language]
}
