
package org.openapitools.client.model


case class CatalogsFeedVideoCounts (
    /* The number of videos successfully ingested from the feed file. */
    _ingestedVideos: Option[Integer],
    /* The number of videos that were not ingested from the feed file. */
    _notIngestedVideos: Option[Integer],
    /* The number of videos in the feed file. */
    _totalVideos: Option[Integer]
)
object CatalogsFeedVideoCounts {
    def toStringBody(var_ingestedVideos: Object, var_notIngestedVideos: Object, var_totalVideos: Object) =
        s"""
        | {
        | "ingestedVideos":$var_ingestedVideos,"notIngestedVideos":$var_notIngestedVideos,"totalVideos":$var_totalVideos
        | }
        """.stripMargin
}
