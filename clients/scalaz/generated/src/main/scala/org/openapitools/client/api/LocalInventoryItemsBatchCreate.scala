package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LocalInventoryItemsBatchCreate._

case class LocalInventoryItemsBatchCreate (
  /* Array of inventory operations. Up to 1000 items per request. */
  operations: List[LocalInventoryOperation])

object LocalInventoryItemsBatchCreate {
  import DateTimeCodecs._

  implicit val LocalInventoryItemsBatchCreateCodecJson: CodecJson[LocalInventoryItemsBatchCreate] = CodecJson.derive[LocalInventoryItemsBatchCreate]
  implicit val LocalInventoryItemsBatchCreateDecoder: EntityDecoder[LocalInventoryItemsBatchCreate] = jsonOf[LocalInventoryItemsBatchCreate]
  implicit val LocalInventoryItemsBatchCreateEncoder: EntityEncoder[LocalInventoryItemsBatchCreate] = jsonEncoderOf[LocalInventoryItemsBatchCreate]
}
