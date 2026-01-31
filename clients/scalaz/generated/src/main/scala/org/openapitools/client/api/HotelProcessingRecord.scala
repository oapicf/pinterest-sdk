package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import HotelProcessingRecord._

case class HotelProcessingRecord (
  /* Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. */
  errors: Option[List[ItemValidationEvent]],
/* The catalog hotel id in the merchant namespace */
  hotelId: Option[String],
status: Option[ItemProcessingStatus],
/* Array with the validation warnings for the item processing record */
  warnings: Option[List[ItemValidationEvent]])

object HotelProcessingRecord {
  import DateTimeCodecs._

  implicit val HotelProcessingRecordCodecJson: CodecJson[HotelProcessingRecord] = CodecJson.derive[HotelProcessingRecord]
  implicit val HotelProcessingRecordDecoder: EntityDecoder[HotelProcessingRecord] = jsonOf[HotelProcessingRecord]
  implicit val HotelProcessingRecordEncoder: EntityEncoder[HotelProcessingRecord] = jsonEncoderOf[HotelProcessingRecord]
}
