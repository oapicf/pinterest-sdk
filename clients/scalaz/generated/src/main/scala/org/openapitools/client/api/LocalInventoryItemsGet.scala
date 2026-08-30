package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LocalInventoryItemsGet._

case class LocalInventoryItemsGet (
  /* Array of local inventory items */
  items: List[LocalInventoryItemResponse])

object LocalInventoryItemsGet {
  import DateTimeCodecs._

  implicit val LocalInventoryItemsGetCodecJson: CodecJson[LocalInventoryItemsGet] = CodecJson.derive[LocalInventoryItemsGet]
  implicit val LocalInventoryItemsGetDecoder: EntityDecoder[LocalInventoryItemsGet] = jsonOf[LocalInventoryItemsGet]
  implicit val LocalInventoryItemsGetEncoder: EntityEncoder[LocalInventoryItemsGet] = jsonEncoderOf[LocalInventoryItemsGet]
}
