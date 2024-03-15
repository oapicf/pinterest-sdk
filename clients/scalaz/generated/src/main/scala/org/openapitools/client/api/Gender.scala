package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Gender._

case class Gender (
  
object Gender {
  import DateTimeCodecs._

  implicit val GenderCodecJson: CodecJson[Gender] = CodecJson.derive[Gender]
  implicit val GenderDecoder: EntityDecoder[Gender] = jsonOf[Gender]
  implicit val GenderEncoder: EntityEncoder[Gender] = jsonEncoderOf[Gender]
}
