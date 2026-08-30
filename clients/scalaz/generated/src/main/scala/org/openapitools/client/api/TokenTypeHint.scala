package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TokenTypeHint._

case class TokenTypeHint (
  
object TokenTypeHint {
  import DateTimeCodecs._

  implicit val TokenTypeHintCodecJson: CodecJson[TokenTypeHint] = CodecJson.derive[TokenTypeHint]
  implicit val TokenTypeHintDecoder: EntityDecoder[TokenTypeHint] = jsonOf[TokenTypeHint]
  implicit val TokenTypeHintEncoder: EntityEncoder[TokenTypeHint] = jsonEncoderOf[TokenTypeHint]
}
