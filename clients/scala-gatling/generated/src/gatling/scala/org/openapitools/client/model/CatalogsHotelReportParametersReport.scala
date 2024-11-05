
package org.openapitools.client.model


case class CatalogsHotelReportParametersReport (
    _reportType: Option[String],
    /* ID of the feed entity. */
    _feedId: String,
    /* Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. */
    _processingResultId: Option[String],
    /* Unique identifier of a catalog. If not given, oldest catalog will be used */
    _catalogId: Option[String]
)
object CatalogsHotelReportParametersReport {
    def toStringBody(var_reportType: Object, var_feedId: Object, var_processingResultId: Object, var_catalogId: Object) =
        s"""
        | {
        | "reportType":$var_reportType,"feedId":$var_feedId,"processingResultId":$var_processingResultId,"catalogId":$var_catalogId
        | }
        """.stripMargin
}
