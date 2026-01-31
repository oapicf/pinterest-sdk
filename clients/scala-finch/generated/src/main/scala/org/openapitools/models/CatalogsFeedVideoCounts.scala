package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.
 * @param ingestedUnderscorevideos The number of videos successfully ingested from the feed file.
 * @param notUnderscoreingestedUnderscorevideos The number of videos that were not ingested from the feed file.
 * @param totalUnderscorevideos The number of videos in the feed file.
 */
case class CatalogsFeedVideoCounts(ingestedUnderscorevideos: Option[Int],
                notUnderscoreingestedUnderscorevideos: Option[Int],
                totalUnderscorevideos: Option[Int]
                )

object CatalogsFeedVideoCounts {
    /**
     * Creates the codec for converting CatalogsFeedVideoCounts from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedVideoCounts] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedVideoCounts] = deriveEncoder
}
