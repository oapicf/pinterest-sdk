package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemProcessingRecord._

case class ItemProcessingRecord (
  /* The catalog item id in the merchant namespace */
  itemId: Option[String],
/* Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. */
  errors: Option[List[ItemValidationEvent]],
/* Array with the validation warnings for the item processing record */
  warnings: Option[List[ItemValidationEvent]],
status: Option[ItemProcessingStatus])

object ItemProcessingRecord {
  import DateTimeCodecs._

  implicit val ItemProcessingRecordCodecJson: CodecJson[ItemProcessingRecord] = CodecJson.derive[ItemProcessingRecord]
  implicit val ItemProcessingRecordDecoder: EntityDecoder[ItemProcessingRecord] = jsonOf[ItemProcessingRecord]
  implicit val ItemProcessingRecordEncoder: EntityEncoder[ItemProcessingRecord] = jsonEncoderOf[ItemProcessingRecord]
}
