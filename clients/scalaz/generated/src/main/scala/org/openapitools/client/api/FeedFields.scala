package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedFields._

case class FeedFields (
  defaultCountry: Country,
defaultAvailability: ProductAvailabilityType,
defaultCurrency: NullableCurrency,
/* A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. */
  name: String,
format: CatalogsFormat,
/* The locale used within a feed for product descriptions. */
  defaultLocale: String,
credentials: CatalogsFeedCredentials,
/* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
  location: String,
preferredProcessingSchedule: CatalogsFeedProcessingSchedule,
status: CatalogsStatus)

object FeedFields {
  import DateTimeCodecs._

  implicit val FeedFieldsCodecJson: CodecJson[FeedFields] = CodecJson.derive[FeedFields]
  implicit val FeedFieldsDecoder: EntityDecoder[FeedFields] = jsonOf[FeedFields]
  implicit val FeedFieldsEncoder: EntityEncoder[FeedFields] = jsonEncoderOf[FeedFields]
}
