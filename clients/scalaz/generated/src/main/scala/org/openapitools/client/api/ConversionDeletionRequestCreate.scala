package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionDeletionRequestCreate._

case class ConversionDeletionRequestCreate (
  /* Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request. */
  deletionTargets: ConversionDeletionRequestTargets)

object ConversionDeletionRequestCreate {
  import DateTimeCodecs._

  implicit val ConversionDeletionRequestCreateCodecJson: CodecJson[ConversionDeletionRequestCreate] = CodecJson.derive[ConversionDeletionRequestCreate]
  implicit val ConversionDeletionRequestCreateDecoder: EntityDecoder[ConversionDeletionRequestCreate] = jsonOf[ConversionDeletionRequestCreate]
  implicit val ConversionDeletionRequestCreateEncoder: EntityEncoder[ConversionDeletionRequestCreate] = jsonEncoderOf[ConversionDeletionRequestCreate]
}
