package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import CatalogsRetailFeed._

case class CatalogsRetailFeed (
  createdAt: Option[OffsetDateTime],
id: Option[String],
updatedAt: Option[OffsetDateTime],
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
defaultCountry: Country,
defaultAvailability: ProductAvailabilityType)

object CatalogsRetailFeed {
  import DateTimeCodecs._

  implicit val CatalogsRetailFeedCodecJson: CodecJson[CatalogsRetailFeed] = CodecJson.derive[CatalogsRetailFeed]
  implicit val CatalogsRetailFeedDecoder: EntityDecoder[CatalogsRetailFeed] = jsonOf[CatalogsRetailFeed]
  implicit val CatalogsRetailFeedEncoder: EntityEncoder[CatalogsRetailFeed] = jsonEncoderOf[CatalogsRetailFeed]
}
