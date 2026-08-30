package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AmazonConnectResponse._

case class AmazonConnectResponse (
  /* Amazon connect response message */
  message: Option[String])

object AmazonConnectResponse {
  import DateTimeCodecs._

  implicit val AmazonConnectResponseCodecJson: CodecJson[AmazonConnectResponse] = CodecJson.derive[AmazonConnectResponse]
  implicit val AmazonConnectResponseDecoder: EntityDecoder[AmazonConnectResponse] = jsonOf[AmazonConnectResponse]
  implicit val AmazonConnectResponseEncoder: EntityEncoder[AmazonConnectResponse] = jsonEncoderOf[AmazonConnectResponse]
}
