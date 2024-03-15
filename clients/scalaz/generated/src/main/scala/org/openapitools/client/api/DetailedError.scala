package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DetailedError._

case class DetailedError (
  code: Integer,
message: String,
details: Any)

object DetailedError {
  import DateTimeCodecs._

  implicit val DetailedErrorCodecJson: CodecJson[DetailedError] = CodecJson.derive[DetailedError]
  implicit val DetailedErrorDecoder: EntityDecoder[DetailedError] = jsonOf[DetailedError]
  implicit val DetailedErrorEncoder: EntityEncoder[DetailedError] = jsonEncoderOf[DetailedError]
}
