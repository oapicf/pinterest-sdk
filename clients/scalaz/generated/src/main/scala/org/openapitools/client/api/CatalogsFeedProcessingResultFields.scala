package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFeedProcessingResultFields._

case class CatalogsFeedProcessingResultFields (
  ingestionDetails: CatalogsFeedIngestionDetails,
status: CatalogsFeedProcessingStatus,
productCounts: CatalogsFeedProductCounts,
validationDetails: CatalogsFeedValidationDetails)

object CatalogsFeedProcessingResultFields {
  import DateTimeCodecs._

  implicit val CatalogsFeedProcessingResultFieldsCodecJson: CodecJson[CatalogsFeedProcessingResultFields] = CodecJson.derive[CatalogsFeedProcessingResultFields]
  implicit val CatalogsFeedProcessingResultFieldsDecoder: EntityDecoder[CatalogsFeedProcessingResultFields] = jsonOf[CatalogsFeedProcessingResultFields]
  implicit val CatalogsFeedProcessingResultFieldsEncoder: EntityEncoder[CatalogsFeedProcessingResultFields] = jsonEncoderOf[CatalogsFeedProcessingResultFields]
}
