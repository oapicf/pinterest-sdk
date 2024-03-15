package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemDeleteBatchRecord._

case class ItemDeleteBatchRecord (
  /* The catalog item id in the merchant namespace */
  itemId: Option[String])

object ItemDeleteBatchRecord {
  import DateTimeCodecs._

  implicit val ItemDeleteBatchRecordCodecJson: CodecJson[ItemDeleteBatchRecord] = CodecJson.derive[ItemDeleteBatchRecord]
  implicit val ItemDeleteBatchRecordDecoder: EntityDecoder[ItemDeleteBatchRecord] = jsonOf[ItemDeleteBatchRecord]
  implicit val ItemDeleteBatchRecordEncoder: EntityEncoder[ItemDeleteBatchRecord] = jsonEncoderOf[ItemDeleteBatchRecord]
}
