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
  createdAt: Option[OffsetDateTime],
id: Option[String],
updatedAt: Option[OffsetDateTime],
ingestionDetails: CatalogsFeedIngestionDetails,
status: CatalogsFeedProcessingStatus,
productCounts: CatalogsFeedProductCounts,
validationDetails: CatalogsFeedValidationDetails)

object CatalogsFeedProcessingResult {
  import DateTimeCodecs._

  implicit val CatalogsFeedProcessingResultCodecJson: CodecJson[CatalogsFeedProcessingResult] = CodecJson.derive[CatalogsFeedProcessingResult]
  implicit val CatalogsFeedProcessingResultDecoder: EntityDecoder[CatalogsFeedProcessingResult] = jsonOf[CatalogsFeedProcessingResult]
  implicit val CatalogsFeedProcessingResultEncoder: EntityEncoder[CatalogsFeedProcessingResult] = jsonEncoderOf[CatalogsFeedProcessingResult]
}
