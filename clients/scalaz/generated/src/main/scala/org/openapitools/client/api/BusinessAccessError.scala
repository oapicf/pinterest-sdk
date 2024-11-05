package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessAccessError._

case class BusinessAccessError (
  code: Integer,
message: String)

object BusinessAccessError {
  import DateTimeCodecs._

  implicit val BusinessAccessErrorCodecJson: CodecJson[BusinessAccessError] = CodecJson.derive[BusinessAccessError]
  implicit val BusinessAccessErrorDecoder: EntityDecoder[BusinessAccessError] = jsonOf[BusinessAccessError]
  implicit val BusinessAccessErrorEncoder: EntityEncoder[BusinessAccessError] = jsonEncoderOf[BusinessAccessError]
}
