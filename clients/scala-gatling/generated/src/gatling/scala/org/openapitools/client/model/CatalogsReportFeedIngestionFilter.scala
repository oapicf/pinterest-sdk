
package org.openapitools.client.model


case class CatalogsReportFeedIngestionFilter (
    _reportType: String,
    /* ID of the feed entity. */
    _feedId: String,
    /* Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. */
    _processingResultId: Option[String]
)
object CatalogsReportFeedIngestionFilter {
    def toStringBody(var_reportType: Object, var_feedId: Object, var_processingResultId: Object) =
        s"""
        | {
        | "reportType":$var_reportType,"feedId":$var_feedId,"processingResultId":$var_processingResultId
        | }
        """.stripMargin
}
