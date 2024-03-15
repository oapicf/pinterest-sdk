package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFeedIngestionInfo._

case class CatalogsFeedIngestionInfo (
  /* The number of ingested products that are in stock. */
  IN_STOCK: Option[Integer],
/* The number of ingested products that are in out of stock. */
  OUT_OF_STOCK: Option[Integer],
/* The number of ingested products that are in preorder. */
  PREORDER: Option[Integer])

object CatalogsFeedIngestionInfo {
  import DateTimeCodecs._

  implicit val CatalogsFeedIngestionInfoCodecJson: CodecJson[CatalogsFeedIngestionInfo] = CodecJson.derive[CatalogsFeedIngestionInfo]
  implicit val CatalogsFeedIngestionInfoDecoder: EntityDecoder[CatalogsFeedIngestionInfo] = jsonOf[CatalogsFeedIngestionInfo]
  implicit val CatalogsFeedIngestionInfoEncoder: EntityEncoder[CatalogsFeedIngestionInfo] = jsonEncoderOf[CatalogsFeedIngestionInfo]
}
