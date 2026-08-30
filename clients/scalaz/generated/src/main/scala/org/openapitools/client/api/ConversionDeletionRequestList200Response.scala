package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionDeletionRequestList200Response._

case class ConversionDeletionRequestList200Response (
  bookmark: Option[String],
items: List[ConversionDeletionRequest])

object ConversionDeletionRequestList200Response {
  import DateTimeCodecs._

  implicit val ConversionDeletionRequestList200ResponseCodecJson: CodecJson[ConversionDeletionRequestList200Response] = CodecJson.derive[ConversionDeletionRequestList200Response]
  implicit val ConversionDeletionRequestList200ResponseDecoder: EntityDecoder[ConversionDeletionRequestList200Response] = jsonOf[ConversionDeletionRequestList200Response]
  implicit val ConversionDeletionRequestList200ResponseEncoder: EntityEncoder[ConversionDeletionRequestList200Response] = jsonEncoderOf[ConversionDeletionRequestList200Response]
}
