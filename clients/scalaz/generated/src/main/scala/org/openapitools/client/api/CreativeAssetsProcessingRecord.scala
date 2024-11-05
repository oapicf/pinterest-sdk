package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreativeAssetsProcessingRecord._

case class CreativeAssetsProcessingRecord (
  /* The catalog creative assets id in the merchant namespace */
  creativeAssetsId: Option[String],
/* Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. */
  errors: Option[List[ItemValidationEvent]],
/* Array with the validation warnings for the item processing record */
  warnings: Option[List[ItemValidationEvent]],
status: Option[ItemProcessingStatus])

object CreativeAssetsProcessingRecord {
  import DateTimeCodecs._

  implicit val CreativeAssetsProcessingRecordCodecJson: CodecJson[CreativeAssetsProcessingRecord] = CodecJson.derive[CreativeAssetsProcessingRecord]
  implicit val CreativeAssetsProcessingRecordDecoder: EntityDecoder[CreativeAssetsProcessingRecord] = jsonOf[CreativeAssetsProcessingRecord]
  implicit val CreativeAssetsProcessingRecordEncoder: EntityEncoder[CreativeAssetsProcessingRecord] = jsonEncoderOf[CreativeAssetsProcessingRecord]
}
