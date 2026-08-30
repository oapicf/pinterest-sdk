package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import HttpMethod._

case class HttpMethod (
  
object HttpMethod {
  import DateTimeCodecs._

  implicit val HttpMethodCodecJson: CodecJson[HttpMethod] = CodecJson.derive[HttpMethod]
  implicit val HttpMethodDecoder: EntityDecoder[HttpMethod] = jsonOf[HttpMethod]
  implicit val HttpMethodEncoder: EntityEncoder[HttpMethod] = jsonEncoderOf[HttpMethod]
}
