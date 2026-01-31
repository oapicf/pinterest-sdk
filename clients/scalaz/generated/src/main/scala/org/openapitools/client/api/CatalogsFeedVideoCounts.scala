package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFeedVideoCounts._

case class CatalogsFeedVideoCounts (
  /* The number of videos successfully ingested from the feed file. */
  ingestedVideos: Option[Integer],
/* The number of videos that were not ingested from the feed file. */
  notIngestedVideos: Option[Integer],
/* The number of videos in the feed file. */
  totalVideos: Option[Integer])

object CatalogsFeedVideoCounts {
  import DateTimeCodecs._

  implicit val CatalogsFeedVideoCountsCodecJson: CodecJson[CatalogsFeedVideoCounts] = CodecJson.derive[CatalogsFeedVideoCounts]
  implicit val CatalogsFeedVideoCountsDecoder: EntityDecoder[CatalogsFeedVideoCounts] = jsonOf[CatalogsFeedVideoCounts]
  implicit val CatalogsFeedVideoCountsEncoder: EntityEncoder[CatalogsFeedVideoCounts] = jsonEncoderOf[CatalogsFeedVideoCounts]
}
