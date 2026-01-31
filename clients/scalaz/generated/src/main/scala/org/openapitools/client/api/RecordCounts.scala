package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RecordCounts._

case class RecordCounts (
  /* Number of invalid records processed */
  invalid: Integer,
/* Number of records processed */
  processed: Integer,
/* Number of valid records processed */
  valid: Integer)

object RecordCounts {
  import DateTimeCodecs._

  implicit val RecordCountsCodecJson: CodecJson[RecordCounts] = CodecJson.derive[RecordCounts]
  implicit val RecordCountsDecoder: EntityDecoder[RecordCounts] = jsonOf[RecordCounts]
  implicit val RecordCountsEncoder: EntityEncoder[RecordCounts] = jsonEncoderOf[RecordCounts]
}
