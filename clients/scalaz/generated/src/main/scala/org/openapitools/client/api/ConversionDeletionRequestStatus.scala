package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionDeletionRequestStatus._

case class ConversionDeletionRequestStatus (
  
object ConversionDeletionRequestStatus {
  import DateTimeCodecs._

  implicit val ConversionDeletionRequestStatusCodecJson: CodecJson[ConversionDeletionRequestStatus] = CodecJson.derive[ConversionDeletionRequestStatus]
  implicit val ConversionDeletionRequestStatusDecoder: EntityDecoder[ConversionDeletionRequestStatus] = jsonOf[ConversionDeletionRequestStatus]
  implicit val ConversionDeletionRequestStatusEncoder: EntityEncoder[ConversionDeletionRequestStatus] = jsonEncoderOf[ConversionDeletionRequestStatus]
}
