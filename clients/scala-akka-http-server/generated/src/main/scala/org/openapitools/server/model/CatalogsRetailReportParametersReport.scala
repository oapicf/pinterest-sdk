package org.openapitools.server.model


/**
 * @param feedId ID of the feed entity. for example: ''null''
 * @param processingResultId Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. for example: ''null''
 * @param reportType  for example: ''null''
 * @param catalogId Unique identifier of a catalog. If not given, oldest catalog will be used for example: ''null''
 * @param productGroupId Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature. for example: ''null''
*/
final case class CatalogsRetailReportParametersReport (
  feedId: String,
  processingResultId: Option[String] = None,
  reportType: String,
  catalogId: Option[String] = None,
  productGroupId: Option[String] = None
)

