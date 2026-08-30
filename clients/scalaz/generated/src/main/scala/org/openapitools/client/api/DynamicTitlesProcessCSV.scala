package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DynamicTitlesProcessCSV._

case class DynamicTitlesProcessCSV (
  /* List of validation errors. Empty on success. */
  errors: Option[List[DynamicTitlesProcessCSVError]],
/* Processing status. Present on success. */
  status: Option[String])

object DynamicTitlesProcessCSV {
  import DateTimeCodecs._

  implicit val DynamicTitlesProcessCSVCodecJson: CodecJson[DynamicTitlesProcessCSV] = CodecJson.derive[DynamicTitlesProcessCSV]
  implicit val DynamicTitlesProcessCSVDecoder: EntityDecoder[DynamicTitlesProcessCSV] = jsonOf[DynamicTitlesProcessCSV]
  implicit val DynamicTitlesProcessCSVEncoder: EntityEncoder[DynamicTitlesProcessCSV] = jsonEncoderOf[DynamicTitlesProcessCSV]
}
