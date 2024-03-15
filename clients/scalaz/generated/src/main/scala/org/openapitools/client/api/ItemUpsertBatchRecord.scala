package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemUpsertBatchRecord._

case class ItemUpsertBatchRecord (
  /* The catalog item id in the merchant namespace */
  itemId: Option[String],
attributes: Option[ItemAttributes])

object ItemUpsertBatchRecord {
  import DateTimeCodecs._

  implicit val ItemUpsertBatchRecordCodecJson: CodecJson[ItemUpsertBatchRecord] = CodecJson.derive[ItemUpsertBatchRecord]
  implicit val ItemUpsertBatchRecordDecoder: EntityDecoder[ItemUpsertBatchRecord] = jsonOf[ItemUpsertBatchRecord]
  implicit val ItemUpsertBatchRecordEncoder: EntityEncoder[ItemUpsertBatchRecord] = jsonEncoderOf[ItemUpsertBatchRecord]
}
