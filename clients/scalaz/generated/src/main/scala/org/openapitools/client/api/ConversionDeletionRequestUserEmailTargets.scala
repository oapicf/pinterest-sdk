package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionDeletionRequestUserEmailTargets._

case class ConversionDeletionRequestUserEmailTargets (
  /* Array of plain text user emails. */
  userEmails: List[String])

object ConversionDeletionRequestUserEmailTargets {
  import DateTimeCodecs._

  implicit val ConversionDeletionRequestUserEmailTargetsCodecJson: CodecJson[ConversionDeletionRequestUserEmailTargets] = CodecJson.derive[ConversionDeletionRequestUserEmailTargets]
  implicit val ConversionDeletionRequestUserEmailTargetsDecoder: EntityDecoder[ConversionDeletionRequestUserEmailTargets] = jsonOf[ConversionDeletionRequestUserEmailTargets]
  implicit val ConversionDeletionRequestUserEmailTargetsEncoder: EntityEncoder[ConversionDeletionRequestUserEmailTargets] = jsonEncoderOf[ConversionDeletionRequestUserEmailTargets]
}
