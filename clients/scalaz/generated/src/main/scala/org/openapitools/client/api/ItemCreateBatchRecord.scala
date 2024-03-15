package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemCreateBatchRecord._

case class ItemCreateBatchRecord (
  /* The catalog item id in the merchant namespace */
  itemId: Option[String],
attributes: Option[ItemAttributes])

object ItemCreateBatchRecord {
  import DateTimeCodecs._

  implicit val ItemCreateBatchRecordCodecJson: CodecJson[ItemCreateBatchRecord] = CodecJson.derive[ItemCreateBatchRecord]
  implicit val ItemCreateBatchRecordDecoder: EntityDecoder[ItemCreateBatchRecord] = jsonOf[ItemCreateBatchRecord]
  implicit val ItemCreateBatchRecordEncoder: EntityEncoder[ItemCreateBatchRecord] = jsonEncoderOf[ItemCreateBatchRecord]
}
