package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemUpdateBatchRecord._

case class ItemUpdateBatchRecord (
  /* The catalog item id in the merchant namespace */
  itemId: Option[String],
attributes: Option[UpdatableItemAttributes],
/* The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. */
  updateMask: Option[List[UpdateMaskFieldType]])

object ItemUpdateBatchRecord {
  import DateTimeCodecs._

  implicit val ItemUpdateBatchRecordCodecJson: CodecJson[ItemUpdateBatchRecord] = CodecJson.derive[ItemUpdateBatchRecord]
  implicit val ItemUpdateBatchRecordDecoder: EntityDecoder[ItemUpdateBatchRecord] = jsonOf[ItemUpdateBatchRecord]
  implicit val ItemUpdateBatchRecordEncoder: EntityEncoder[ItemUpdateBatchRecord] = jsonEncoderOf[ItemUpdateBatchRecord]
}
