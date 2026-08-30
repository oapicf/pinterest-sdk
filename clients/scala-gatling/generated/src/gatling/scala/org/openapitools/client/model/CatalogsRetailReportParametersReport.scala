
package org.openapitools.client.model


case class CatalogsRetailReportParametersReport (
    /* ID of the feed entity. */
    _feedId: String,
    /* Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. */
    _processingResultId: Option[String],
    _reportType: String,
    /* Unique identifier of a catalog. If not given, oldest catalog will be used */
    _catalogId: Option[String],
    /* Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature. */
    _productGroupId: Option[String]
)
object CatalogsRetailReportParametersReport {
    def toStringBody(var_feedId: Object, var_processingResultId: Object, var_reportType: Object, var_catalogId: Object, var_productGroupId: Object) =
        s"""
        | {
        | "feedId":$var_feedId,"processingResultId":$var_processingResultId,"reportType":$var_reportType,"catalogId":$var_catalogId,"productGroupId":$var_productGroupId
        | }
        """.stripMargin
}
