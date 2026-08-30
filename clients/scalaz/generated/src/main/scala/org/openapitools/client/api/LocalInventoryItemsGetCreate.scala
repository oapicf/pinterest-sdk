package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LocalInventoryItemsGetCreate._

case class LocalInventoryItemsGetCreate (
  /* Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items. */
  itemFilters: List[ItemIdStoreCodePair])

object LocalInventoryItemsGetCreate {
  import DateTimeCodecs._

  implicit val LocalInventoryItemsGetCreateCodecJson: CodecJson[LocalInventoryItemsGetCreate] = CodecJson.derive[LocalInventoryItemsGetCreate]
  implicit val LocalInventoryItemsGetCreateDecoder: EntityDecoder[LocalInventoryItemsGetCreate] = jsonOf[LocalInventoryItemsGetCreate]
  implicit val LocalInventoryItemsGetCreateEncoder: EntityEncoder[LocalInventoryItemsGetCreate] = jsonEncoderOf[LocalInventoryItemsGetCreate]
}
