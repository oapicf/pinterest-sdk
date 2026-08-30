package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TokenGrantType._

case class TokenGrantType (
  
object TokenGrantType {
  import DateTimeCodecs._

  implicit val TokenGrantTypeCodecJson: CodecJson[TokenGrantType] = CodecJson.derive[TokenGrantType]
  implicit val TokenGrantTypeDecoder: EntityDecoder[TokenGrantType] = jsonOf[TokenGrantType]
  implicit val TokenGrantTypeEncoder: EntityEncoder[TokenGrantType] = jsonEncoderOf[TokenGrantType]
}
