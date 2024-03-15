package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemBatchRecord._

case class ItemBatchRecord (
  /* The catalog item id in the merchant namespace */
  itemId: Option[String],
attributes: Option[ItemAttributes],
/* The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. */
  updateMask: Option[List[UpdateMaskFieldType]])

object ItemBatchRecord {
  import DateTimeCodecs._

  implicit val ItemBatchRecordCodecJson: CodecJson[ItemBatchRecord] = CodecJson.derive[ItemBatchRecord]
  implicit val ItemBatchRecordDecoder: EntityDecoder[ItemBatchRecord] = jsonOf[ItemBatchRecord]
  implicit val ItemBatchRecordEncoder: EntityEncoder[ItemBatchRecord] = jsonEncoderOf[ItemBatchRecord]
}
