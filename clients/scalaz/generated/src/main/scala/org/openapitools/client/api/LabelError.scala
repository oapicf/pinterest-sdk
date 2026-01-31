package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LabelError._

case class LabelError (
  data: Option[Label],
errorMessages: Option[List[String]])

object LabelError {
  import DateTimeCodecs._

  implicit val LabelErrorCodecJson: CodecJson[LabelError] = CodecJson.derive[LabelError]
  implicit val LabelErrorDecoder: EntityDecoder[LabelError] = jsonOf[LabelError]
  implicit val LabelErrorEncoder: EntityEncoder[LabelError] = jsonEncoderOf[LabelError]
}
