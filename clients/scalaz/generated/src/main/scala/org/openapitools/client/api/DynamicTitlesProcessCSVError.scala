package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DynamicTitlesProcessCSVError._

case class DynamicTitlesProcessCSVError (
  /* The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED. */
  errorType: Option[String],
/* The row number with a validation error. -1 indicates a file-level error. */
  rowNumber: Option[Integer])

object DynamicTitlesProcessCSVError {
  import DateTimeCodecs._

  implicit val DynamicTitlesProcessCSVErrorCodecJson: CodecJson[DynamicTitlesProcessCSVError] = CodecJson.derive[DynamicTitlesProcessCSVError]
  implicit val DynamicTitlesProcessCSVErrorDecoder: EntityDecoder[DynamicTitlesProcessCSVError] = jsonOf[DynamicTitlesProcessCSVError]
  implicit val DynamicTitlesProcessCSVErrorEncoder: EntityEncoder[DynamicTitlesProcessCSVError] = jsonEncoderOf[DynamicTitlesProcessCSVError]
}
