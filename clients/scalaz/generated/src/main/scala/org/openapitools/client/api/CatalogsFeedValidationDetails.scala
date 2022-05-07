package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFeedValidationDetails._

case class CatalogsFeedValidationDetails (
  errors: CatalogsFeedValidationErrors,
warnings: CatalogsFeedValidationWarnings)

object CatalogsFeedValidationDetails {
  import DateTimeCodecs._

  implicit val CatalogsFeedValidationDetailsCodecJson: CodecJson[CatalogsFeedValidationDetails] = CodecJson.derive[CatalogsFeedValidationDetails]
  implicit val CatalogsFeedValidationDetailsDecoder: EntityDecoder[CatalogsFeedValidationDetails] = jsonOf[CatalogsFeedValidationDetails]
  implicit val CatalogsFeedValidationDetailsEncoder: EntityEncoder[CatalogsFeedValidationDetails] = jsonEncoderOf[CatalogsFeedValidationDetails]
}
