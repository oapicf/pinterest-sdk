package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsRetailFeedsUpdateRequest._

case class CatalogsRetailFeedsUpdateRequest (
  defaultCurrency: Option[NullableCurrency],
/* A human-friendly name associated to a given feed. */
  name: Option[String],
format: Option[CatalogsFormat],
credentials: Option[CatalogsFeedCredentials],
/* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
  location: Option[String],
preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
status: Option[CatalogsStatus],
catalogType: CatalogsType,
defaultAvailability: Option[ProductAvailabilityType])

object CatalogsRetailFeedsUpdateRequest {
  import DateTimeCodecs._

  implicit val CatalogsRetailFeedsUpdateRequestCodecJson: CodecJson[CatalogsRetailFeedsUpdateRequest] = CodecJson.derive[CatalogsRetailFeedsUpdateRequest]
  implicit val CatalogsRetailFeedsUpdateRequestDecoder: EntityDecoder[CatalogsRetailFeedsUpdateRequest] = jsonOf[CatalogsRetailFeedsUpdateRequest]
  implicit val CatalogsRetailFeedsUpdateRequestEncoder: EntityEncoder[CatalogsRetailFeedsUpdateRequest] = jsonEncoderOf[CatalogsRetailFeedsUpdateRequest]
}
