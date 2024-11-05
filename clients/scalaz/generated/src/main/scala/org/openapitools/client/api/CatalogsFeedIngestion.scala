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
  id: String,
feedId: String,
createdAt: OffsetDateTime,
status: CatalogsFeedProcessingStatus)

object CatalogsFeedIngestion {
  import DateTimeCodecs._

  implicit val CatalogsFeedIngestionCodecJson: CodecJson[CatalogsFeedIngestion] = CodecJson.derive[CatalogsFeedIngestion]
  implicit val CatalogsFeedIngestionDecoder: EntityDecoder[CatalogsFeedIngestion] = jsonOf[CatalogsFeedIngestion]
  implicit val CatalogsFeedIngestionEncoder: EntityEncoder[CatalogsFeedIngestion] = jsonEncoderOf[CatalogsFeedIngestion]
}
