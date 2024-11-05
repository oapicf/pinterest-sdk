package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import CatalogsHotelFeed._

case class CatalogsHotelFeed (
  createdAt: OffsetDateTime,
id: String,
updatedAt: OffsetDateTime,
/* A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. */
  name: String,
format: CatalogsFormat,
catalogType: CatalogsType,
credentials: CatalogsFeedCredentials,
/* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
  location: String,
preferredProcessingSchedule: CatalogsFeedProcessingSchedule,
status: CatalogsStatus,
defaultCurrency: NullableCurrency,
/* The locale used within a feed for product descriptions. */
  defaultLocale: String,
/* Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. */
  catalogId: String)

object CatalogsHotelFeed {
  import DateTimeCodecs._

  implicit val CatalogsHotelFeedCodecJson: CodecJson[CatalogsHotelFeed] = CodecJson.derive[CatalogsHotelFeed]
  implicit val CatalogsHotelFeedDecoder: EntityDecoder[CatalogsHotelFeed] = jsonOf[CatalogsHotelFeed]
  implicit val CatalogsHotelFeedEncoder: EntityEncoder[CatalogsHotelFeed] = jsonEncoderOf[CatalogsHotelFeed]
}
