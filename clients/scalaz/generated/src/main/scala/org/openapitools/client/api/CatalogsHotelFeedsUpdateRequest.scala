package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelFeedsUpdateRequest._

case class CatalogsHotelFeedsUpdateRequest (
  defaultCurrency: Option[NullableCurrency],
/* A human-friendly name associated to a given feed. */
  name: Option[String],
format: Option[CatalogsFormat],
credentials: Option[CatalogsFeedCredentials],
/* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
  location: Option[String],
preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
status: Option[CatalogsStatus],
catalogType: CatalogsType)

object CatalogsHotelFeedsUpdateRequest {
  import DateTimeCodecs._

  implicit val CatalogsHotelFeedsUpdateRequestCodecJson: CodecJson[CatalogsHotelFeedsUpdateRequest] = CodecJson.derive[CatalogsHotelFeedsUpdateRequest]
  implicit val CatalogsHotelFeedsUpdateRequestDecoder: EntityDecoder[CatalogsHotelFeedsUpdateRequest] = jsonOf[CatalogsHotelFeedsUpdateRequest]
  implicit val CatalogsHotelFeedsUpdateRequestEncoder: EntityEncoder[CatalogsHotelFeedsUpdateRequest] = jsonEncoderOf[CatalogsHotelFeedsUpdateRequest]
}
