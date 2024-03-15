package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdArrayResponseElement._

case class AdArrayResponseElement (
  data: Option[AdResponse],
exceptions: Option[Exception])

object AdArrayResponseElement {
  import DateTimeCodecs._

  implicit val AdArrayResponseElementCodecJson: CodecJson[AdArrayResponseElement] = CodecJson.derive[AdArrayResponseElement]
  implicit val AdArrayResponseElementDecoder: EntityDecoder[AdArrayResponseElement] = jsonOf[AdArrayResponseElement]
  implicit val AdArrayResponseElementEncoder: EntityEncoder[AdArrayResponseElement] = jsonEncoderOf[AdArrayResponseElement]
}
