package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import CatalogsFeedProcessingResult._

case class CatalogsFeedProcessingResult (
  createdAt: OffsetDateTime,
id: String,
updatedAt: OffsetDateTime,
ingestionDetails: CatalogsFeedIngestionDetails,
productCounts: CatalogsFeedProductCounts,
status: CatalogsFeedProcessingStatus,
validationDetails: CatalogsFeedValidationDetails,
videoCounts: Option[CatalogsFeedVideoCounts])

object CatalogsFeedProcessingResult {
  import DateTimeCodecs._

  implicit val CatalogsFeedProcessingResultCodecJson: CodecJson[CatalogsFeedProcessingResult] = CodecJson.derive[CatalogsFeedProcessingResult]
  implicit val CatalogsFeedProcessingResultDecoder: EntityDecoder[CatalogsFeedProcessingResult] = jsonOf[CatalogsFeedProcessingResult]
  implicit val CatalogsFeedProcessingResultEncoder: EntityEncoder[CatalogsFeedProcessingResult] = jsonEncoderOf[CatalogsFeedProcessingResult]
}
