package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFeedProductCounts._

case class CatalogsFeedProductCounts (
  /* The number of products in the feed file. */
  original: Option[Integer],
/* The number of products successfully ingested from the feed file. */
  ingested: Option[Integer])

object CatalogsFeedProductCounts {
  import DateTimeCodecs._

  implicit val CatalogsFeedProductCountsCodecJson: CodecJson[CatalogsFeedProductCounts] = CodecJson.derive[CatalogsFeedProductCounts]
  implicit val CatalogsFeedProductCountsDecoder: EntityDecoder[CatalogsFeedProductCounts] = jsonOf[CatalogsFeedProductCounts]
  implicit val CatalogsFeedProductCountsEncoder: EntityEncoder[CatalogsFeedProductCounts] = jsonEncoderOf[CatalogsFeedProductCounts]
}
