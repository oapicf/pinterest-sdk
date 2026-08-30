package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionDeletionRequestEPIKTargets._

case class ConversionDeletionRequestEPIKTargets (
  /* Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie). */
  epiks: List[String])

object ConversionDeletionRequestEPIKTargets {
  import DateTimeCodecs._

  implicit val ConversionDeletionRequestEPIKTargetsCodecJson: CodecJson[ConversionDeletionRequestEPIKTargets] = CodecJson.derive[ConversionDeletionRequestEPIKTargets]
  implicit val ConversionDeletionRequestEPIKTargetsDecoder: EntityDecoder[ConversionDeletionRequestEPIKTargets] = jsonOf[ConversionDeletionRequestEPIKTargets]
  implicit val ConversionDeletionRequestEPIKTargetsEncoder: EntityEncoder[ConversionDeletionRequestEPIKTargets] = jsonEncoderOf[ConversionDeletionRequestEPIKTargets]
}
