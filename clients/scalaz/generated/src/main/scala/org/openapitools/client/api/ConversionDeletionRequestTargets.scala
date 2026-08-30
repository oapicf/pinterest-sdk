package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionDeletionRequestTargets._

case class ConversionDeletionRequestTargets (
  /* Array of plain text user emails. */
  userEmails: List[String],
/* Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie). */
  epiks: List[String])

object ConversionDeletionRequestTargets {
  import DateTimeCodecs._

  implicit val ConversionDeletionRequestTargetsCodecJson: CodecJson[ConversionDeletionRequestTargets] = CodecJson.derive[ConversionDeletionRequestTargets]
  implicit val ConversionDeletionRequestTargetsDecoder: EntityDecoder[ConversionDeletionRequestTargets] = jsonOf[ConversionDeletionRequestTargets]
  implicit val ConversionDeletionRequestTargetsEncoder: EntityEncoder[ConversionDeletionRequestTargets] = jsonEncoderOf[ConversionDeletionRequestTargets]
}
