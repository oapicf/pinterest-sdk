package org.openapitools.server.model


/**
 * Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.
 *
 * @param ingestedVideos The number of videos successfully ingested from the feed file. for example: ''null''
 * @param notIngestedVideos The number of videos that were not ingested from the feed file. for example: ''null''
 * @param totalVideos The number of videos in the feed file. for example: ''null''
*/
final case class CatalogsFeedVideoCounts (
  ingestedVideos: Option[Int] = None,
  notIngestedVideos: Option[Int] = None,
  totalVideos: Option[Int] = None
)

