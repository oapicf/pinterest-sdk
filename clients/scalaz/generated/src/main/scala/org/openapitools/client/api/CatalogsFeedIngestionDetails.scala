package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFeedIngestionDetails._

case class CatalogsFeedIngestionDetails (
  errors: CatalogsFeedIngestionErrors,
info: CatalogsFeedIngestionInfo)

object CatalogsFeedIngestionDetails {
  import DateTimeCodecs._

  implicit val CatalogsFeedIngestionDetailsCodecJson: CodecJson[CatalogsFeedIngestionDetails] = CodecJson.derive[CatalogsFeedIngestionDetails]
  implicit val CatalogsFeedIngestionDetailsDecoder: EntityDecoder[CatalogsFeedIngestionDetails] = jsonOf[CatalogsFeedIngestionDetails]
  implicit val CatalogsFeedIngestionDetailsEncoder: EntityEncoder[CatalogsFeedIngestionDetails] = jsonEncoderOf[CatalogsFeedIngestionDetails]
}
