package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Interest._

case class Interest (
  canonicalUrl: Option[String],
id: Option[String],
key: Option[String],
name: Option[String])

object Interest {
  import DateTimeCodecs._

  implicit val InterestCodecJson: CodecJson[Interest] = CodecJson.derive[Interest]
  implicit val InterestDecoder: EntityDecoder[Interest] = jsonOf[Interest]
  implicit val InterestEncoder: EntityEncoder[Interest] = jsonEncoderOf[Interest]
}
