package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemDeleteDiscontinuedBatchRecord._

case class ItemDeleteDiscontinuedBatchRecord (
  /* The catalog item id in the merchant namespace */
  itemId: Option[String])

object ItemDeleteDiscontinuedBatchRecord {
  import DateTimeCodecs._

  implicit val ItemDeleteDiscontinuedBatchRecordCodecJson: CodecJson[ItemDeleteDiscontinuedBatchRecord] = CodecJson.derive[ItemDeleteDiscontinuedBatchRecord]
  implicit val ItemDeleteDiscontinuedBatchRecordDecoder: EntityDecoder[ItemDeleteDiscontinuedBatchRecord] = jsonOf[ItemDeleteDiscontinuedBatchRecord]
  implicit val ItemDeleteDiscontinuedBatchRecordEncoder: EntityEncoder[ItemDeleteDiscontinuedBatchRecord] = jsonEncoderOf[ItemDeleteDiscontinuedBatchRecord]
}
