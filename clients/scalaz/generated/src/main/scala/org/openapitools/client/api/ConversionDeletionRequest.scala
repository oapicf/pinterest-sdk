package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import ConversionDeletionRequest._

case class ConversionDeletionRequest (
  /* Timestamp when the conversion deletion request was succesfully created. */
  createdTime: LocalDate,
/* Timestamp when the conversion deletion request was processed. */
  processedTime: Option[LocalDate],
/* Unique identifier of the conversion deletion request */
  requestId: String,
/* Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled. */
  status: ConversionDeletionRequestStatus)

object ConversionDeletionRequest {
  import DateTimeCodecs._

  implicit val ConversionDeletionRequestCodecJson: CodecJson[ConversionDeletionRequest] = CodecJson.derive[ConversionDeletionRequest]
  implicit val ConversionDeletionRequestDecoder: EntityDecoder[ConversionDeletionRequest] = jsonOf[ConversionDeletionRequest]
  implicit val ConversionDeletionRequestEncoder: EntityEncoder[ConversionDeletionRequest] = jsonEncoderOf[ConversionDeletionRequest]
}
