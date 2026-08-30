package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import CatalogsFeedIngestion._

case class CatalogsFeedIngestion (
  /* Timestamp of the feed ingestion. */
  createdAt: OffsetDateTime,
/* Catalog Feed id pertaining to the feed ingestion. */
  feedId: String,
/* Unique identifier of a feed ingestion. */
  id: String,
/* Status of the feed ingestion. */
  status: CatalogsFeedProcessingStatus)

object CatalogsFeedIngestion {
  import DateTimeCodecs._

  implicit val CatalogsFeedIngestionCodecJson: CodecJson[CatalogsFeedIngestion] = CodecJson.derive[CatalogsFeedIngestion]
  implicit val CatalogsFeedIngestionDecoder: EntityDecoder[CatalogsFeedIngestion] = jsonOf[CatalogsFeedIngestion]
  implicit val CatalogsFeedIngestionEncoder: EntityEncoder[CatalogsFeedIngestion] = jsonEncoderOf[CatalogsFeedIngestion]
}
