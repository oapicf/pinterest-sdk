package model

import play.api.libs.json._

/**
  * Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.
  * @param ingestedVideos The number of videos successfully ingested from the feed file.
  * @param notIngestedVideos The number of videos that were not ingested from the feed file.
  * @param totalVideos The number of videos in the feed file.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsFeedVideoCounts(
  ingestedVideos: Option[Int],
  notIngestedVideos: Option[Int],
  totalVideos: Option[Int]
)

object CatalogsFeedVideoCounts {
  implicit lazy val catalogsFeedVideoCountsJsonFormat: Format[CatalogsFeedVideoCounts] = Json.format[CatalogsFeedVideoCounts]
}

